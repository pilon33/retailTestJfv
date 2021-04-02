package jfv.retail.intercorp.config;

import java.io.FileInputStream;
import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;

@Service
public class FirebaseInitialize {

	@PostConstruct
	public void iniFirestore () throws IOException {
		
			FileInputStream serviceAccount =
					  new FileInputStream("./serviceFirebaseKey.json");

					 FirebaseOptions options = new FirebaseOptions.Builder()
					  .setCredentials(GoogleCredentials.fromStream(serviceAccount))
					  .setDatabaseUrl("https://retailTestJfv.firebaseio.com")
					  .build();

				
	
		if(FirebaseApp.getApps().isEmpty()){
			FirebaseApp.initializeApp(options);
			
		}
	
	 }	
	public 	 Firestore getFirestore() {
		return FirestoreClient.getFirestore();
	}
}

