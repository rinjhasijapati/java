import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.musql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost/connector";
        Connection con = DriverManager.getConnection(url, "root" ,"rinjhaS"); //connects to the database
        System.out.println("Connection success");

        //get the results from the database
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * from Student");
        statement.executeUpdate("UPDATE new_table SET name = 'rinjha' WHERE id = 5411");
        statement.executeUpdate("DELETE * from new_table WHERE id = 5411");



        while(resultSet.next()){
            String name = resultSet.getString("name");
            System.out.println(name + ","); //OR
            //System.out.println(resultSet.getString("name") + ",");
        }

        //prepare statement
        PreparedStatement preparedStatement = con.prepareStatement("SELECT * from new_table where id = ?");
        preparedStatement.setInt(1,21);
        ResultSet resultSet = preparedStatement.execteQuery();
    }
}