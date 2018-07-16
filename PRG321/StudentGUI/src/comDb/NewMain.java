/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comDb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class NewMain {
static Connection conn;
static PreparedStatement pst;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
      conn = ConnectionClass.ConnectDB();  
    //   String sql = "Insert into student('StudentPassword','StudentName','StudentSurname','StudentAge') VALUES('?','?','?','?')";
      
      String sql="INSERT INTO `student` (`StudentPassword`, `StudentName`, `StudentSurname`, `StudentAge`) VALUES ( ?, ?, ?, ?)";
            pst=conn.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
               pst.setString(1, "222");
               pst.setString(2, "tt");
            pst.setString(3,"kr");
            //System.out.println( Integer.parseInt(tbAge.getText()));
            // System.out.println( tbAge.getText());
            String d="46";
            int dd=Integer.parseInt(d);
            System.out.println(dd);
            pst.setInt(4, dd);
               // System.out.println( tbAge.getText());
          int ddd=  pst.executeUpdate();
            System.out.println(ddd+"sucess");
    }
}
