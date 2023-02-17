import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    private static Connection connection;

    public static Connection getConnection() throws SQLException {

        String url="jdbc:oracle:thin:@localhost:1521:XE";
        String user="hr";
        String password="123456";

        connection = DriverManager.getConnection(url, user, password);
        return connection;
    }
}
