import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {

        Connection c=DbConnection.getConnection();
        Statement st=c.createStatement();

        String sql="SELECT * FROM employees";
        ResultSet result=st.executeQuery(sql);

        while(result.next()) {
            System.out.println(
                    result.getString("employee_id") + "\t\t" +
                    result.getString("first_name") + "\t\t" +
                    result.getString("last_name") + "\t\t" +
                    result.getString("email") + "\t\t" +
                    result.getString("phone_number") + "\t\t" +
                    result.getString("hire_date")
            );
        }
    }
}
