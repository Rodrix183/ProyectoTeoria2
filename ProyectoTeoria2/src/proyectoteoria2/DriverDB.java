/*
Clase para la conexion de la Base de datos document DB
 */
package proyectoteoria2;

import com.mongodb.ConnectionString;
import com.mongodb.MongoException;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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

    private final String databaseName = "AgenciaEmpleo";
    private ConnectionString connectionString;
    private CodecRegistry pojoCodecRegistry;
    private CodecRegistry codecRegistry;
    private MongoClientSettings clientSettings;

    private MongoClient mongoClient;
    private MongoDatabase database;

    public DriverDB() {
        ConnectionString connectionString = new ConnectionString("mongodb+srv://mongoPower:waySecure1@tbd2-empleo-bfigs.mongodb.net/AgenciaEmpleo?retryWrites=true&w=majority");
        CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
        CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);
        MongoClientSettings clientSettings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .codecRegistry(codecRegistry)
                .build();
    }
    
    private void crearConexion(){
        mongoClient = MongoClients.create(clientSettings);
        database = mongoClient.getDatabase(databaseName);
    }
    
    public List<Persona> getPersonas(String par){
        List<Persona> personas = null;
        try {
            crearConexion();
            MongoCollection<Persona> collection = database.getCollection("Persona", Persona.class);
            personas = collection.find().into(new ArrayList<>());
        } catch (MongoException e) {
            e.printStackTrace();
        }finally{
            cerrarConexion();
        }
        return personas;
    }
    
    public void setPersonas(Persona P){
        try {
            crearConexion();
            MongoCollection<Persona> collection = database.getCollection("Persona", Persona.class);
            collection.insertOne(P);
        } catch (MongoException e) {
            e.printStackTrace();
        }finally{
            cerrarConexion();
        }
    }
    
    private void cerrarConexion(){
        mongoClient.close();
    }

}
