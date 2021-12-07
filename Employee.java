/********************************************************************
 * Programmer:	Samajeet Randhawa 
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

    //*** Setters ***

    public void setHoursWorked(){
        this.hoursWorked = hoursWorked;
    }// end setHoursWorked

    public void setHourlyWage(){
        this.hourlyWage = hourlyWage; 
    }// end setHourlyWage

    //*** other methods *** 

    @Override 
    public String toString(){
        String st = "";
        st = (""+this.hourlyWage + this.hoursWorked + this.id);
        return st; 
    }
} // end of public class