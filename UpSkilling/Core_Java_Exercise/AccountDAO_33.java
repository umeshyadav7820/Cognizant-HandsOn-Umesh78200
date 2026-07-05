import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class AccountDAO {

    Connection con;

    AccountDAO() throws Exception {

        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String password = "Rsy0794";

        con = DriverManager.getConnection(url, user, password);
    }

    public void transferMoney(int fromId, int toId, int amount) throws Exception {

        con.setAutoCommit(false);

        try {

            String debit = "UPDATE accounts SET balance = balance - ? WHERE id = ?";
            PreparedStatement ps1 = con.prepareStatement(debit);

            ps1.setInt(1, amount);
            ps1.setInt(2, fromId);

            ps1.executeUpdate();

            String credit = "UPDATE accounts SET balance = balance + ? WHERE id = ?";
            PreparedStatement ps2 = con.prepareStatement(credit);

            ps2.setInt(1, amount);
            ps2.setInt(2, toId);

            ps2.executeUpdate();

            con.commit();

            System.out.println("Transaction Successful");

        } catch (Exception e) {

            con.rollback();

            System.out.println("Transaction Failed");

        }

        con.setAutoCommit(true);
    }
}

public class AccountDAO_33 {

    public static void main(String[] args) throws Exception {

        AccountDAO dao = new AccountDAO();

        dao.transferMoney(1, 2, 1000);

        dao.con.close();
    }
}