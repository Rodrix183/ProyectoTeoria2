/*
Clase para la conexion de la Base de datos document DB
 */
package proyectoteoria2;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
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
        connectionString = new ConnectionString("mongodb+srv://mongoPower:waySecure1@tbd2-empleo-bfigs.mongodb.net/AgenciaEmpleo?retryWrites=true&w=majority");
        pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
        codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);
        clientSettings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .codecRegistry(codecRegistry)
                .build();
    }
    
    private void crearConexion(){
        mongoClient = MongoClients.create(clientSettings);
        database = mongoClient.getDatabase(databaseName);
    }
    
    public List<Persona> getPersonas(Document par){
        List<Persona> personas = null;
        try {
            crearConexion();
            MongoCollection<Persona> collection = database.getCollection("Candidato", Persona.class);
            if(par != null){
                personas = collection.find(par).into(new ArrayList<>());
            }else{
                personas = collection.find().into(new ArrayList<>());
            }
        } catch (MongoException e) {
            e.printStackTrace();
        }finally{
            cerrarConexion();
        }
        return personas;
    }
    
    public List<Empresa> getEmpresa(Document par){
        List<Empresa> empresas = null;
        try {
            crearConexion();
            MongoCollection<Empresa> collection = database.getCollection("Empresa", Empresa.class);
            if(par != null){
                empresas = collection.find(par).into(new ArrayList<>());
            }else{
                empresas = collection.find().into(new ArrayList<>());
            }
        } catch (MongoException e) {
            e.printStackTrace();
        }finally{
            cerrarConexion();
        }
        return empresas;
    }
    
    public List<CategoriaTrabajo> getTipoTrabajo(Document par){
        List<CategoriaTrabajo> tipoTrabajos = null;
        try {
            crearConexion();
            MongoCollection<CategoriaTrabajo> collection = database.getCollection("CategoriaTrabajo", CategoriaTrabajo.class);
            if(par != null){
                tipoTrabajos = collection.find(par).into(new ArrayList<>());
            }else{
                tipoTrabajos = collection.find().into(new ArrayList<>());
            }
        } catch (MongoException e) {
            e.printStackTrace();
        }finally{
            cerrarConexion();
        }
        for (CategoriaTrabajo tipoTrabajo : tipoTrabajos) {
            System.out.println(tipoTrabajo.getNombreCategoria());
        }
        return tipoTrabajos;
    }
    
    public void setPersonas(Persona P){
        try {
            crearConexion();
            MongoCollection<Persona> collection = database.getCollection("Candidato", Persona.class);
            collection.insertOne(P);
        } catch (MongoException e) {
            e.printStackTrace();
        }finally{
            cerrarConexion();
        }
    }
    
    public void setEmpresas(Empresa P){
        try {
            crearConexion();
            MongoCollection<Empresa> collection = database.getCollection("Empresa", Empresa.class);
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
