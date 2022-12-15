import java.sql.SQLException;

public class Demo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/shape_schema";
        String username = "root";
        String password = "admin";
        DBService service = new DBService(url,username,password);
        //service.createAllTables();
        service.deleteAllTables();
    }
}