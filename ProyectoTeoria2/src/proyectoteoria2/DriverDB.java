/*
Clase para la conexion de la Base de datos document DB
 */
package proyectoteoria2;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author Faith
 */
public class DriverDB {
    
        private final String URI = "mongodb+srv://mongoPower:waySecure1@tbd2-empleo-bfigs.mongodb.net/AgenciaEmpleo?retryWrites=true&w=majority", databaseName = "AgenciaEmpleo"; 
        private final MongoClient mongoClient;
        private final MongoDatabase database;
        
        public DriverDB(){
            mongoClient = MongoClients.create(URI);
            database = mongoClient.getDatabase(databaseName);
        }
        
        /*MongoCollection<Document> collection = database.getCollection("Candidato");
        Document myDoc = collection.find().first();
        System.out.println(myDoc.toJson());*/
        
        /*String template = "mongodb+srv://%s:%s@%s/AgenciaEmpleo?retryWrites=true&w=majority"; // replicaSet=rs0
        String username = "mongoPower";
        String password = "waySecure1";
        String clusterEndpoint = "tbd2-empleo-bfigs.mongodb.net";
        //String readPreference = "secondaryPreferred";
        String connectionString = String.format(template, username, password, clusterEndpoint/*, readPreference*);

        MongoClientURI clientURI = new MongoClientURI(connectionString);
        MongoClient mongoClient = new MongoClient(clientURI);

        MongoDatabase testDB = mongoClient.getDatabase("AgenciaEmpleo");
        MongoCollection<Document> numbersCollection = testDB.getCollection("Candidato");

        //Document doc = new Document("name", "pi").append("value", 3.14159);
        //numbersCollection.insertOne(doc);

        MongoCursor<Document> cursor = numbersCollection.find().iterator();
        try {
            while (cursor.hasNext()) {
                System.out.println(cursor.next().toJson());
            }
        } finally {
            cursor.close();
        }*/
        /*String template = "mongodb+srv://%s:%s@%s/AgenciaEmpleo?retryWrites=true&w=majority"; // replicaSet=rs0
        String username = "mongoPower";
        String password = "waySecure1";
        String clusterEndpoint = "tbd2-empleo-bfigs.mongodb.net";
        //String readPreference = "secondaryPreferred";
        String connectionString = String.format(template, username, password, clusterEndpoint/*, readPreference*);
        MongoClientURI clientURI = new MongoClientURI(connectionString);
        MongoClient mongoClient = new MongoClient(clientURI);
        MongoDatabase testDB = mongoClient.getDatabase("AgenciaEmpleo");
        MongoCollection<Document> numbersCollection = testDB.getCollection("Candidato");
        //Document doc = new Document("name", "pi").append("value", 3.14159);
        //numbersCollection.insertOne(doc);
        MongoCursor<Document> cursor = numbersCollection.find().iterator();
        try {
        while (cursor.hasNext()) {
        System.out.println(cursor.next().toJson());
        }
        } finally {
        cursor.close();
        }*/
    
}
