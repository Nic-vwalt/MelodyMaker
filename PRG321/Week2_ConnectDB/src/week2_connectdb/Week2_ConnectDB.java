
package week2_connectdb;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Week2_ConnectDB {

    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        //1: Register the driver class [com.mysql.jdbc.Driver]
        
        Class.forName("com.mysql.jdbc.Driver");
        
        //2: Creating Connection
        
        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
        
        //3: Creatig Query Statement
        
        Statement st = con.createStatement();
        //3.1 Insert Query
        
        String ins_qry = "INSERT INTO Student_Info(`Student_Name`, `Student_Surname`, `DOB`) VALUES ('Mike','Snail','1997-05-23')";
        String ins_qry1 = "INSERT INTO Student_Info(`Student_Name`, `Student_Surname`, `DOB`) VALUES ('Mich','Snail','1997-05-24')";
        
        //3.2 Update Query
        
        String Upd_qry = "UPDATE `student_info` SET `Student_ID`=1,`Student_Name`='Test',`Student_Surname`='Snail',`DOB`='1987-01-01' WHERE `Student_ID` = 13";
        
        //3.3 Delete Query
        
        
        String Del_qry = "DELETE FROM `student_info` WHERE `Student_ID`=1";
        
        //3.4 Select Query
        
        
       // String Sel_qry = "SELECT `Student_ID`, `Student_Name`, `Student_Surname`, `DOB` FROM `student_info` WHERE 'Student_Surname' = 'Snail'";
        
     String Sel_qry= "SELECT `Student_ID`, `Student_Name`, `Student_Surname`, `DOB` FROM `student_info` WHERE `Student_Surname` = 'Snail'";
        
        //4: Executing Queries
        
       //int num = st.executeUpdate(Del_qry); //Only for Insert, Update and Delete queries
       
        //System.out.println(num + " Number of rows affected ");
        
        ResultSet rs = st.executeQuery(Sel_qry);
        
        while(rs.next()) {    
          //  System.out.println("jhj");
            int id = rs.getInt(1);
            String name = rs.getString("Student_Name");
            String sname = rs.getString("Student_Surname");
            String DOB = rs.getString("DOB");
            System.out.println("Student ID: " + id +"\nStudent Name: "+name + "\nStudent Surname:" + sname + "\nDOB: " +DOB + "\n" );
        }
        
        //5: Closing connection
        
        con.close();
    }
    
}
