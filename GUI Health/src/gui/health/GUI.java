/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.health;

import health.profile.console.program.HealthClient;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author James Flond
 */
public class GUI extends JFrameForm
{
    private JTextField jname, jage, jHeight, jWeight;
    private JButton jresults, jclear;
    private JLabel lblOutput, jBMI, jCategory, jMAXhr;
    private HealthClient client;
   
    
    public GUI()
    {
        super();
        
        
        jname = new JTextField(20);
        jage = new JTextField(10);
        jHeight = new JTextField(20);
        jWeight = new JTextField(20);
        jresults = new JButton("Results");
        jclear = new JButton("Clear");
        jBMI = new JLabel("");
        jCategory = new JLabel("");
        jMAXhr = new JLabel("");
        lblOutput = new JLabel("Testing");
        
         client = new HealthClient();
        
        setLayout(new GridLayout(0,2));
        add(new JLabel("Name"));
        add (jname);
        
        //add(new JLabel ("Output"));
       // add (lblOutput);
        add(new JLabel("Age"));
        add (jage);
        add(new JLabel("Weight"));
        add (jWeight);
        add(new JLabel("Height in inches"));
        add (jHeight);
        add (jresults);
        add (jclear);
        add(new JLabel("BMI"));
        add (jBMI);
        add(new JLabel("Category"));
        add (jCategory);
        add(new JLabel("MAX HR"));
        add (jMAXhr);
        ButtonHandler handler = new ButtonHandler();
//connect the buttons to the ActionListener using this object
jclear.addActionListener(handler);
jresults.addActionListener(handler);
    }
    
private class ButtonHandler implements ActionListener
{
    @Override
	public void actionPerformed(ActionEvent e)
	{
               if (e.getSource() == jclear)
		{
			System.out.println("Clear");
		}
		else if (e.getSource() == jresults)
		{
                //Template outupt statement: lblOutput.setText("Hellot " + jname.getText());
                    
                client.setName(jname.getText());
                client.setAge(Integer.parseInt(jage.getText()));
                client.setHeight(Integer.parseInt(jHeight.getText()));
                client.setWeight(Integer.parseInt(jWeight.getText()));
                client.CalcBMI();
                     client.CalcCategory();
                     client.CalcMaxHR();
                     jBMI.setText(String.valueOf(client.getBMI()));
                     jCategory.setText(String.valueOf(client.getCategory()));
                     jMAXhr.setText(String.valueOf(client.getMaxHR()));
               
                System.out.println("Done");
		}	                  			
	}
}
           
    
}
