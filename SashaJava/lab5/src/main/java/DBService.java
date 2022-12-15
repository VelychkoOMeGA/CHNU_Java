import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBService {
    final String url;
    final String username;
    final String password;
    final Connection connection;

    public DBService(String url, String username, String password) throws SQLException, ClassNotFoundException {
        this.url = url;
        this.username = username;
        this.password = password;
        this.connection = getConnection();
    }
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(url,username,password);
    }
    void deleteAllTables() throws SQLException {
        String sqlStatement[] =
                {
                        "DROP TABLE IF EXISTS circle",
                        "DROP TABLE IF EXISTS rectangle",
                        "DROP TABLE IF EXISTS shape"
                };
        Statement statement = connection.createStatement();
        for (String sqlSt:sqlStatement) {
            statement.execute(sqlSt);
        }
        System.out.println("All tables removed");
    }
    void createAllTables() throws SQLException {
        String sqlStatement[]=
                {
                        """
                        CREATE TABLE shape_schema.shape
                        (
                            id BIGINT NOT NULL AUTO_INCREMENT,
                            name varchar(100) NOT NULL,
                            type varchar(100) NOT NULL,
                            CONSTRAINT PK_SHAPE PRIMARY KEY (id)
                        );
                        """,
                        """
                        CREATE TABLE shape_schema.rectangle
                        (
                            id BIGINT NOT NULL AUTO_INCREMENT,
                            id_shape BIGINT,
                            width INT NOT NULL,
                            length INT NOT NULL,
                            CONSTRAINT PK_RECTANGLE PRIMARY KEY (id),
                            FOREIGN KEY (id_shape) REFERENCES shape(id) ON UPDATE CASCADE ON DELETE SET NULL
                        );
                        """,
                        """
                        CREATE TABLE shape_schema.circle
                        (
                            id BIGINT NOT NULL AUTO_INCREMENT,
                            id_shape BIGINT,
                            radius INT NOT NULL,
                            CONSTRAINT PK_CIRCLE PRIMARY KEY (id),
                            FOREIGN KEY (id_shape) REFERENCES shape(id) ON UPDATE CASCADE ON DELETE SET NULL
                        );
                        """
                };

        Statement statement = connection.createStatement();
        for (String sqlSt:sqlStatement) {
            statement.execute(sqlSt);
        }
        System.out.println("All tables created");
    }
}
