package example;

import config.MongoDBConnection;
import com.mongodb.client.MongoDatabase;

public class MainMongoConnection {
    public static void main(String[] args) {
        try {
            // Intentamos obtener la base de datos
            MongoDatabase db = MongoDBConnection.getDatabase();

            // Si llegamos aquí sin errores, imprimimos el nombre de la BD
            System.out.println("Conectado a la base de datos: " + db.getName());

        } catch (Exception e) {
            System.err.println("❌ Algo salió mal:");
            e.printStackTrace();
        }
    }
}