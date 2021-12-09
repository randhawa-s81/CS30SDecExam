/********************************************************************
 * Programmer:    Samajeet Randhawa 
 * Class:  CS30S
 *
 * Assignment: Dec Exam 
 *
 * Description: brief description of class
 ***********************************************************************/

// import libraries as needed here

public class Employee {
    //*** Class Variables ***

        private static int nextId = 1000; 
        
        private static int maxRegHours = 40; 
        private static double otIncrement = 1.5; 

    //*** Instance Variables ***

        private int hoursWorked = 0;  // number of hours worked  
        private double hourlyWage = 0.0;   // hourly wage 
        private int id = 0;           // id if this employee 
        
    //*** Constructors ***

    public Employee(){
        id = nextId++;       // increment unique id

        hoursWorked = 0;          // default values ofr hours worked 
        hourlyWage = 0.0;        // and hourly wage 
    }// end of default no-arg constuctor 

    public Employee(int hours, double wage){
        id = nextId++;

        this.hourlyWage = wage; 
        this.hoursWorked = hours; 
    }// end default/no arconstructor

    //*** Getters ***
    
    /*****************************************
     * Description: get
     * 
     * Interface:
     * 
     * @param        double: hourly wage
     * ****************************************/

    public double gethourlyWage(){
        return hourlyWage;  
    }// end getHourlyWage

    /*****************************************
     * Description: get    
     * 
     * Interface:
     * 
     * @param        int: hours worked  
     * ****************************************/
    public int gethoursWorked(){
        return hoursWorked; 
    }// end getHoursWorked

    /*****************************************
     * Description: get    
     * 
     * Interface:
     * 
     * @param        int: id 
     * ****************************************/
    public int getId(){
        return id; 
    }// end getId
    
    //*** other methods *** 
    
    public double getRegPay(){
        double a = 0.0; 
    if(this.hoursWorked <= maxRegHours){
         a = this.hoursWorked * this.hourlyWage; 
    }// end of if 
    else{
        
    } // end else 
    return a; 
    }// end getRegPay 
    
    public double getOtPay(){
        double a = 0.0; 
        double b = 0.0; // variable for over time pay calculations 
        if(this.hoursWorked >= maxRegHours){
            a = this.hourlyWage * this.hoursWorked; 
            b = a * otIncrement; 
        }// end if structure 
        return b; 
    }// end getOtPay
    
    public double getGrossPay(){
        double grossPay = 0.0; 
        grossPay = getOtPay() + getRegPay();
        return grossPay; 
    }// end getGrossPay
    
    //*** Setters ***

    public void setHoursWorked(){
        this.hoursWorked = hoursWorked;
    }// end setHoursWorked

    public void setHourlyWage(){
        this.hourlyWage = hourlyWage; 
    }// end setHourlyWage


    @Override 
    public String toString(){
        String st = "";
        st = ("" + this.id + this.hoursWorked + this.hourlyWage + getRegPay() + getOtPay() + getGrossPay());
        
        return st; 
    }// 
} // end of public class