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
    private String Customer_address= "0";
    private int floor_length= 0;
    private int floor_width = 0;
    private int floor_type;
    //Calulated variables
  
    private int Floor_area;
    private int Floor_cost;

    
    
    //Create Student class constructor
       public Students()
    {
                    
        System.out.println("Students Constructor called");
    }
 
       
    //Create Student class constructor with parameters
    public Students(String cname, String cCustomer_address, int cfloor_length, int cfloor_width)
    {
        name = cname;
        Customer_address = cCustomer_address;
        floor_length = cfloor_length;
        floor_width = cfloor_width;
        
        System.out.println("Constructor with parameters called");
    }
    
    //<editor-fold desc="Set Methods">
    
    //Create set Methods for private variables;
        public void setName (String Sname) 
        {
            name = Sname;
        }   
        public void setCustomer_address (String SCustomer_address)
        {
            Customer_address = SCustomer_address;
        }
                public void setfloor_length (int Sfloor_length)
        {
            floor_length = Sfloor_length;
        }       
                public void setfloor_width (int Sfloor_width)
        {
            floor_width = Sfloor_width;
        }
                                public void setfloor_type (int Sfloor_type)
        {
            floor_type = Sfloor_type;
        }
        //</editor-fold>
        
   //<editor-fold desc="Get Methods">
    //Create get Methods for private variables;
        public String getName()
    {
        return name;
    }
        public String getCustomer_address()
        {
            return Customer_address;
        }
        public int getfloor_length()
        {
            return floor_length;
        }
        public int getfloor_width()
        {
            return floor_width;
        }
                public int getfloor_type()
        {
            return floor_type;
        }
        public int getFloor_area()
        {
            return Floor_area;
        }
        public int getFloor_cost()
        {
            return Floor_cost;
        }
   
//</editor-fold>
       
       
//<editor-fold desc="Calc Methods">
        public void CalcFloor_area()
        {
            int area = floor_width * floor_length;
            Floor_area = area;
        }
        public void CalcFloor_cost ()
        {
        int cost = Floor_area * floor_type;
        Floor_cost = cost;
              
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
  