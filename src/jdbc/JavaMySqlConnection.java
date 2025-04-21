package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;

public class JavaMySqlConnection {

    public static void main(String[] args) {
        
try{
    
    //add jdbc driver for mysql
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testing_db","root", "rootroot");

    // prepare sql statement
    PreparedStatement ps=con.prepareStatement("INSERT INTO register VALUES('Sam', 'sam19@gmail.com')");

    //Execute the staement
    ps.executeUpdate();

    con.close();
    ps.close();


}
catch(Exception e){

    System.out.println(e);
}

    }
}
