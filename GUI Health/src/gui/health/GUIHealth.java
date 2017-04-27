/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.health;

import health.profile.console.program.Methods;
import health.profile.console.program.HealthClient;
/**
 *
 * @author James Flond
 */
public class GUIHealth {
    
     HealthClient client1 = new HealthClient(); 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   

        GUI test = new GUI();

   

        test.setSize(400,400);
        test.setDefaultCloseOperation(JFrameForm.EXIT_ON_CLOSE);
        test.setVisible(true);
        
        // TODO code application logic here
    }
    
}
