package jfv.retail.intercorp.service.implement;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.springframework.stereotype.Service;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.firebase.cloud.FirestoreClient;

import jfv.retail.intercorp.dto.ClienteDto;
import jfv.retail.intercorp.dto.ClienteModel;
import jfv.retail.intercorp.dto.KpiClienteDto;
import jfv.retail.intercorp.dto.ResponseCreaCliente;
import jfv.retail.intercorp.service.ClienteService;
import jfv.retail.intercorp.util.Util;

@Service
public class ClientServiceImplement implements ClienteService {

	@Override
	public List<ClienteDto> listClientes() throws InterruptedException, ExecutionException {
		//firestore 
		Firestore dbFireStore = FirestoreClient.getFirestore();
		ApiFuture<QuerySnapshot> collecionApiFuture = dbFireStore.collection("clientes").get();
		List<QueryDocumentSnapshot> documentSnapshots = collecionApiFuture.get().getDocuments();
		List<ClienteDto> lisClienteModels = new ArrayList<ClienteDto>();
		for (DocumentSnapshot document : documentSnapshots) {
			ClienteModel clienteModel = document.toObject(ClienteModel.class);

			ClienteDto respuestaCliente = new ClienteDto(clienteModel.getNombre(), clienteModel.getApellido(),
					clienteModel.getEdad(), clienteModel.getFecha_Nacimiento(),
					Util.fechaPosibleMuerte(clienteModel.getFecha_Nacimiento()), document.getId());
			lisClienteModels.add(respuestaCliente);
		}
		return lisClienteModels;
	}

	@Override
	public ResponseCreaCliente creaCliente(ClienteModel cliente) {
		//firestore 
		Firestore dbFireStore = FirestoreClient.getFirestore();
		ApiFuture<DocumentReference> collecionApiFuture = dbFireStore.collection("clientes").add(cliente);
		try {
			return new ResponseCreaCliente("0", collecionApiFuture.get().getId());
		} catch (InterruptedException e) {
			return new ResponseCreaCliente("1", e.getMessage());
		} catch (ExecutionException e) {
			return new ResponseCreaCliente("2", e.getMessage());
		}
	}


	@Override
	public KpiClienteDto kpideclientes() throws InterruptedException, ExecutionException {
		//firestore 
		Firestore dbFireStore = FirestoreClient.getFirestore();
		ApiFuture<QuerySnapshot> collecionApiFuture = dbFireStore.collection("clientes").get();
		List<QueryDocumentSnapshot> documentSnapshots = collecionApiFuture.get().getDocuments();
		List<Integer> edades = new ArrayList<Integer>();
		for (DocumentSnapshot document : documentSnapshots) {
			ClienteModel clienteModel = document.toObject(ClienteModel.class);
			edades.add(clienteModel.getEdad());
		}

		KpiClienteDto kpiClienteDto = new KpiClienteDto(Util.promedioEdades(edades), Util.desviacionEstandar(edades));

		return kpiClienteDto;
	}

}
