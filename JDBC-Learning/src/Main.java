import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String databaseUrl = "jdbc:mysql://localhost/mydatabase";

        //connection database
        Connection conn = DriverManager.getConnection(databaseUrl, "root", "root");
        System.out.println("Database Connection Success");

        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery("Select * from student");
        while(rs.next()){
            System.out.println(rs.getString("name"));
            System.out.println(rs.getInt("id"));
        }
    }
}