import java.sql.*;

public class JDBCConnection_31 {

    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://127.0.0.1:3306/student";
        String user = "root";
        String password = "Rsy0794";

        Connection con = DriverManager.getConnection(url, user, password);

        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("SELECT * FROM students");

        while (rs.next()) {
            System.out.println(rs.getInt("id") + " "
                    + rs.getString("name") + " "
                    + rs.getInt("age"));
        }

        con.close();
    }
}