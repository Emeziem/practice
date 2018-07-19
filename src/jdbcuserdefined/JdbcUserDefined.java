
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
import java.util.*;
import static javafx.application.Platform.exit;
public class JdbcUserDefined {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while(true){
        Scanner sc=new Scanner(System.in);
        pDetails obj=new pDetails();
        // TODO code application logic here
         System.out.println("");
        System.out.println("(((((((((((((((...WELCOME TO APTECH STUDENT DATA COLLECTION...)))))))))))))))");
         System.out.println("");
         System.out.println("PRESS 1 TO REGISTER STUDENT");
         System.out.println("PRESS 2 TO VIEW STUDENT INFORMATION");
         System.out.println("PRESS 3 TO EXIT APPLICATION");
         int op=sc.nextInt();
         switch (op){
             case 1:
                 obj.UserInput();
                 break;
             case 2:
                 obj.UserOutPut();
                 break;
             case 3:
                 exit();
                 System.exit(0);
                 break;
             default:
                 System.err.println("INVALID OPERATION");
         }
    }
    }
}
