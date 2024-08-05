package advancedJava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/college";
        Connection conn = null;

        int rollNo = 2;
        String name = "Jonny";

        String sql = "insert into student(id, name) values(" + rollNo + ", '" + name + "')";

        try {
            conn = DriverManager.getConnection(url,"root","biswa");

            Statement st = conn.createStatement();
            int m = st.executeUpdate(sql);
            if (m == 1){
                System.out.println("Inserted successfully : " + sql);
            }
            else {
                System.out.println("Insertion failed");
            }
        }
        catch ( Exception ex){
            System.err.println(ex);
        }
        finally {
            conn.close();
        }
    }
}
