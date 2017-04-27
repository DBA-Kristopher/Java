/**************************************************** 
Program Name: HealthProfileConsole.java 
Programmer's Name: Derek Kristopher Smith 
Program Description: BMI  
***********************************************************/

package health.profile.console.program;

import java.util.Scanner;

/**
 *
 * @author James Flond
 */
public class Methods  //cookie cutter
{

             public static void main(String[] args)
             { 
                 
                 
                 
                //Welcome message
                 System.out.println("Welcome");
                 //Create Scanner
                 Scanner input = new Scanner( System.in );
                 //Create Health Client Object
                 HealthClient client = new HealthClient();
                
                 System.out.print("Enter name or X to quit: ");
                 String mName = input.nextLine();
                
                 if ("X".equals(mName) || "x".equals(mName))
                 {
                  System.out.println("Okay Goodbye");  
                 }
                 else {
                     System.out.println("Your age:");
                     int mAge = input.nextInt();
                     
                     System.out.println("Your Weight:");
                     int mWeight = input.nextInt();
                     System.out.println("Your Height in inches:");
                     int mHeight = input.nextInt();
             
                     //set client variables 
                     client.setName(mName);
                     
                     client.setAge(mAge);
                     client.setWeight(mWeight);
                     client.setHeight(mHeight);
                     //Run calc methods
                     client.CalcBMI();
                     client.CalcCategory();
                     client.CalcMaxHR();
                     
                     //Output user BMI
                     System.out.println("Health Profile for " + client.getName());
                     
                     System.out.println("BMI: " + client.getBMI());
                     System.out.println("BMI Category: " + client.getCategory());
                     System.out.println("Max heart rate: " + client.getMaxHR());
                     
               
                
             }   
             }
}

/**
 *
 * @author James Flond
 */

