import com.mongodb.MongoClient;
import com.mongodb.DB;

public class MongoDemo {
    public static void main(String args[])throws Exception{
        try{
            MongoClient mongoClient= new MongoClient("localhost",27017);
            DB db = mongoClient.getDB("test");
            System.out.println("Connected to Database");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
            System.out.println("Server is ready!");

    }
}
