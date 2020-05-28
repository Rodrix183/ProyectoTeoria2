/*
Clase para la conexion de la Base de datos document DB
 */
package proyectoteoria2;

import com.mongodb.ConnectionString;
//import com.mongodb.MongoClient;
import com.mongodb.MongoException;
//import com.mongodb.MongoClientSettings;
//import com.mongodb.MongoException;
//import com.mongodb.client.MongoClient;
//import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

/**
 *
 * @author Faith
 */
public class DriverDB {
    
//    private final String databaseName = "AgenciaEmpleo";
//    private ConnectionString connectionString = new ConnectionString("mongodb+srv://mongoPower:waySecure1@tbd2-empleo-bfigs.mongodb.net/AgenciaEmpleo?retryWrites=true&w=majority");
//    private CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
//    private CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);
//    private MongoClientSettings clientSettings = MongoClientSettings.builder()
//            .applyConnectionString(connectionString)
//            .codecRegistry(codecRegistry)
//            .build();
//    
//    private MongoClient mongoClient;
//    private MongoDatabase database;

    public DriverDB() {
    }

    /*
    public ArrayList<Persona> obtenerDocumentos(String coleccion) {
        ArrayList<DBObject> documentos = new ArrayList<>();
        MongoCollection<Document> collection = database.getCollection(coleccion);
        try (MongoCursor<Document> cursor = collection.find().iterator()) {
            while (cursor.hasNext()) {
                DBObject obj = (DBObject) cursor.next();
                documentos.add(obj);
            }
        }
        return documentos;
    }*/

//    public void crearConexion() {
//        try {
//            String collectionS = "Candidato";
//            mongoClient = MongoClients.create(clientSettings);
//            database = mongoClient.getDatabase(databaseName);
//            MongoCollection<Persona> collection = database.getCollection(collectionS, Persona.class);
//            
//            Persona p = new Persona();
//            p.setId("C1");
//            p.setNombre("Ivonne Nereyda");
//            p.setApellido("Caceres");
//            p.setNacionalidad("Hondureña");
//            p.setGenero("F");
//            DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//            Date fechaN = null;
//            try {
//                fechaN = sdf.parse("14/11/2012");
//            } catch (ParseException ex) {
//                Logger.getLogger(DriverDB.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            p.setFechaNacimiento(fechaN);
//            p.setTelefono("1122-3344");
//            p.setCorreo("ivonne@correo.com");
//            Direccion d = new Direccion();
//            d.setPais("Honduras");
//            d.setDepart("Fco.Morazan");
//            d.setMunicipio("Valle de Angeles");
//            d.setColonia("Col. Cerro Grande");
//            p.setDireccion(d);
//            
//            collection.insertOne(p);
//            
//            
//        } catch (MongoException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void cerrarConexion() {
//        mongoClient.close();
//    }

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
