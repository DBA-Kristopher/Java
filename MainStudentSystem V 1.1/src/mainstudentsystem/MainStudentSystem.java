/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainstudentsystem;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author James Flond
 */
public class MainStudentSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GUI test = new GUI();

   

        test.setSize(1434, 748);
        test.setDefaultCloseOperation(GUI.EXIT_ON_CLOSE);
        test.setVisible(true);
        // TODO code application logic here
    }
    
}
