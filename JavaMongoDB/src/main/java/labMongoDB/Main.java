package labMongoDB;

import java.net.UnknownHostException;

import javax.swing.JTextField;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class Main {

	public static void main(String args[]) {
		
	
		try {

			MongoClient mongoClient = new MongoClient("localhost", 27017);

			DB db = mongoClient.getDB("BaseDeDadsaatos");

			DBCollection coleccionPeliculas = db.getCollection("Peliasdculas");
			DBCollection coleccionProductoras = db.getCollection("Producasdatoras");
			
			FrameCRUD frame = new FrameCRUD();
			new FrameCRUD().setVisible(true);
			
	
			mongoClient.close();

			} catch (UnknownHostException ex) {
				System.out.println("Exception al conectar al server de Mongo: " + ex.getMessage());
			}

		}
	}


