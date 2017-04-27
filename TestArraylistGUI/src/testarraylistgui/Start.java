/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testarraylistgui;

/**
 *
 * @author James Flond
 */
public class Start {
    
        public static void main(String[] args) {

         TestArraylistGUI test = new TestArraylistGUI();

   

        test.setSize(700,500);
        test.setLocationRelativeTo(null);
        test.setDefaultCloseOperation(TestArraylistGUI.EXIT_ON_CLOSE);
        test.setVisible(true);
        
        }
}
