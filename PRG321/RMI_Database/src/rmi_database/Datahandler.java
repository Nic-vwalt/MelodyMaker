/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Datahandler {
    
    public Connection connect_db() throws ClassNotFoundException, SQLException
    {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_rmi","root","");
    
    return con;
    }
    
 
    
    public void display_ingredients(String name) throws ClassNotFoundException, SQLException
    {
    Connection con = connect_db();
    
    PreparedStatement ps =  con.prepareStatement("SELECT `Name`, `Price`, `item1`, `item2`, `item3` FROM food INNER JOIN `ingredients` ON `food`.`ingredient_id` = `ingredients`.`ingredient_id` WHERE `Name` = ?");
    ps.setString(1, name);
    ResultSet rs = ps.executeQuery();
    
        while (rs.next()) {            
            //int food_id = rs.getInt(0);
            String names = rs.getString("Name");
            String price = rs.getString("Price");
            String item1 = rs.getString("item1");
            String item2 = rs.getString("item2");
            String item3 = rs.getString("item3");
            
            System.out.println("Name: "+names+"\nPrice: "+price+"\nIngredient 1: "+item1+"\nIngredient 2: "+item2+"\nIngredient 3: "+item3);
            
        }
    }
    
    
    public void display_food() throws ClassNotFoundException, SQLException
    {
    Connection con = connect_db();
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT * from food");
        while (rs.next()) {            
            
            String names = rs.getString("Name");
            String price = rs.getString("Price");
        
            System.out.println("Name: "+names+"\nPrice: "+price);
        }
    }
}
