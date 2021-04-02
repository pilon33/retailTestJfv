package jfv.retail.intercorp.service;

import java.util.List;
import java.util.concurrent.ExecutionException;

import jfv.retail.intercorp.dto.ClienteDto;
import jfv.retail.intercorp.dto.ClienteModel;
import jfv.retail.intercorp.dto.KpiClienteDto;
import jfv.retail.intercorp.dto.ResponseCreaCliente;

public interface ClienteService {
	public ResponseCreaCliente creaCliente(ClienteModel cliente) throws InterruptedException, ExecutionException;
	
	public KpiClienteDto kpideclientes() throws InterruptedException, ExecutionException;
	
	public List<ClienteDto> listClientes() throws InterruptedException, ExecutionException;
	
	
}
