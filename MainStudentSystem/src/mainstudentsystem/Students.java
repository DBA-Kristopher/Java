/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainstudentsystem;

/**
 *
 * @author James Flond
 */
//Create Class Students
public class Students {

    
            
    // Create private global variables
    private String name = "Default"; 
    private int test1= 0;
    private int test2= 0;
    private int test3 = 0;
    //Calulated variables
    private int avg;
    private String grade;

    
    
    //Create Student class constructor
       public Students()
    {
                    
        System.out.println("Students Constructor called");
    }
 
       
    //Create Student class constructor with parameters
    public Students(String cname, int ctest1, int ctest2, int ctest3)
    {
        name = cname;
        test1 = ctest1;
        test2 = ctest2;
        test3 = ctest3;
        
        System.out.println("Constructor with parameters called");
    }
    
    //<editor-fold desc="Set Methods">
    
    //Create set Methods for private variables;
        public void setName (String Sname) 
        {
            name = Sname;
        }   
        public void setTest1 (int Stest1)
        {
            test1 = Stest1;
        }
                public void setTest2 (int Stest2)
        {
            test2 = Stest2;
        }       
                public void setTest3 (int Stest3)
        {
            test3 = Stest3;
        }
        //</editor-fold>
        
   //<editor-fold desc="Get Methods">
    //Create get Methods for private variables;
        public String getName()
    {
        return name;
    }
        public int getTest1()
        {
            return test1;
        }
        public int getTest2()
        {
            return test2;
        }
        public int getTest3()
        {
            return test3;
        }
        public int getAVG()
        {
            return avg;
        }
        public String getGrade()
        {
            return grade;
        }
   
//</editor-fold>
       
       
//<editor-fold desc="Calc Methods">
        public void CalcAvg()
        {
            int total = test1 +test2 + test3;
            avg = total/3;
        }
        public void CalcGrade ()
    {
        
     
        if (avg >= 90)
        {
         grade = "A";   
        }
        else if (avg >= 80 && avg <= 89)
        {
            grade = "B";
        }
                else if (avg >= 70 && avg <= 79)
        {
            grade = "C";
        }
                        else if (avg >= 60 && avg <= 69)
        {
            grade = "D";
        }
                else if (avg < 60)
        {
            grade = "F";
        }
              
        }
//</editor-fold>  
//<editor-fold desc="ToString Methods">
//add toString method to display name
public String toString()
{
        return name;
}

//</editor-fold>
       
       
       
       
       
       
       
       
       
       
}
  