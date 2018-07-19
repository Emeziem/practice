/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcuserdefined;
 
/**
 *
 * @author HP
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import static javafx.application.Platform.exit;

public class pDetails {
    Scanner sc=new Scanner(System.in);
  
    void UserInput(){
   try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://localhost:1433; databaseName=calyData; "
                    + "user=login;"
                    + "password=1234;";
            Connection con = DriverManager.getConnection(connectionUrl);
            System.out.println("CONNECTION ESTABLISHED");
            Statement st=(Statement) con.createStatement();
            System.out.println("ENTER EMPLOYEE ID");
            int Id=sc.nextInt();
            System.out.println("ENTER EMPLOYEE NAME");
     String Name=sc.next();
            st.executeUpdate("insert into data values('" +Id+"', '"+Name+"')");
            System.out.println("VALUES INSERTED SUCCESSFULLY...THANK YOU");
        }
        catch(java.lang.ClassNotFoundException e) {
            System.err.print("Class Not Found Exception");
            System.out.println(e.getMessage());
        }
        catch(SQLException ex) {
            System.err.println("SQLException:" + ex.getMessage());
            System.out.println("ErrorCode:" + ex.getErrorCode());
        }
    }
    void UserOutPut(){
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
        String connectionUrl = "jdbc:sqlserver://localhost:1433; databaseName=calyData; "
                + "user=login;"
                + "password=1234;";
        Connection con = DriverManager.getConnection(connectionUrl);
       System.out.println("Your connetion is successfull");
          //   System.out.println("please supply your Query");
      // String value = sc.nextLine();
       System.out.println("Here are the values from your DATABASE as requested");
            
        Statement st = con.createStatement();
         //ResultSet rs = st.executeQuery(value);
        ResultSet rs = st.executeQuery("SELECT * FROM data");
        while(rs.next()){
            int PersonID = rs.getInt(1);
            String LastName= rs.getString(2);
            
            System.out.println(PersonID + "    " + LastName  );
        }
        }
        catch(java.lang.ClassNotFoundException e) {
            System.err.print("Class Not Found Exception");
            System.out.println(e.getMessage());
        }
        catch(SQLException ex) {
            System.err.println("SQLException:" + ex.getMessage());
            System.out.println("ErrorCode:" + ex.getErrorCode());
        }
    }
    
}
