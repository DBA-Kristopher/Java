/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package health.profile.console.program;

/**
 *
 * @author James Flond
 */
public class HealthClient {
    
    private String name;
    private int Age;
    private int Weight;
    private int Height;
    	//instance variables
    private int BMI;
    private String Category;
    private int MaxHR;

              public int getBMI()
    {
        return BMI;
    }

                        public int getMaxHR()
    {
        return MaxHR;
    }
             public String getCategory()
    {
        return Category;
    }
    public void setName (String Cname)
        {
            name = Cname;
        }
    
    public void setAge (int CAge)
    {
        Age = CAge;
    }
    public void setWeight (int CWeight)
    {
        Weight = CWeight;
    }
    public void setHeight (int CHeight)
    {
        Height = CHeight;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return Age;
    }
        public int getWeight()
    {
        return Weight;
    }
            public int getHeight()
    {
        return Height;
    }
  
        public void CalcBMI ()
    {
        int calcWeight;
        int calcHeight;
        int CalBMI;
 
        calcWeight = Weight * 703;
        calcHeight = Height * Height;
   
        CalBMI = calcWeight / calcHeight;
        BMI = CalBMI;
    }
                public void CalcCategory ()
    {
        
     
        if (BMI <= 18)
        {
         Category = "Underweight";   
        }
        else if (BMI >= 19 && BMI <= 25)
        {
            Category = "Normal";
        }
                else if (BMI >= 26 && BMI <= 30)
        {
            Category = "Overweight";
        }
                else if (BMI > 30)
        {
            Category = "Obese";
        }
              
        }
    
                        public void CalcMaxHR ()
    {
        MaxHR = 200 - Age;
    }
}
