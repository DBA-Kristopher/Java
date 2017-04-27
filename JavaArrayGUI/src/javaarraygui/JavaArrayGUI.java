/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarraygui;

/**
 *
 * @author James Flond
 */
public class JavaArrayGUI {
    
    public JavaArrayGUI()
    {
    String name;
    String quantity;
    String purchase;
    double current;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        StockGUI test = new StockGUI();
        

        //Array creation test
        JavaArrayGUI[] stockArray = new JavaArrayGUI[4];
        stockArray[0] = new JavaArrayGUI();

        

   

        test.setSize(400,400);
        test.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        test.setVisible(true);
    }

}
