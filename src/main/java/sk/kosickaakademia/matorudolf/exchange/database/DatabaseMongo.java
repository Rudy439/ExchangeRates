package sk.kosickaakademia.matorudolf.exchange.database;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoClients;
import org.w3c.dom.Document;

public class DatabaseMongo {
    private static MongoClient mongoClient = MongoClients.create();

    public void test(){
    MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
    DB database = mongoClient.getDB("TheDatabaseExchange");
    DBCollection collection = database.getCollection("Exchange");
    collection = new collection ("mena","cena" ).


}}
