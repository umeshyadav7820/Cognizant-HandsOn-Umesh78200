import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class StudentDAO {

    Connection con;

    StudentDAO() throws Exception {

        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String password = "Rsy0794";

        con = DriverManager.getConnection(url, user, password);
    }

    public void insertStudent(int id, String name, int age) throws Exception {

        String sql = "INSERT INTO students VALUES(?,?,?)";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setInt(3, age);

        int rows = ps.executeUpdate();

        System.out.println(rows + " Row Inserted");
    }

    public void updateStudent(int age, int id) throws Exception {

        String sql = "UPDATE students SET age=? WHERE id=?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, age);
        ps.setInt(2, id);

        int rows = ps.executeUpdate();

        System.out.println(rows + " Row Updated");
    }
    public void DeleteStudent(int id) throws Exception {

        String sql = "DELETE FROM students WHERE id=?";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);

        int rows = ps.executeUpdate();

        System.out.println(rows + " Row Deleted");
    }

}
public class StudentDAO_32 {
    public static void main(String[] args) throws Exception {

        StudentDAO dao = new StudentDAO();

        dao.insertStudent(108, "Rohit", 22);

        dao.updateStudent(25, 104);
        dao.DeleteStudent(104);
        dao.con.close();

    }
}

