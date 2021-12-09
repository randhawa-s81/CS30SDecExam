/********************************************************************
 * Programmer:    sveinson
 * Class:  CS30S
 *
 * Assignment: OOP Example 1: Circle
 *
 * Description: a simple Circle class with driver/client code to
 *              demonstate the basics of programming in OOP
 ***********************************************************************/

// import libraries as needed here

public class Circle {
    //*** Class Variables ***
    
    private static int nextID = 1000;       // unique id for next circle
    
    //*** Instance Variables ***
    
    private double radius;                  // radius of circle
    private final double PI = 3.14159;      // value of PI
    private int id;                         // id of this circle
    
    //*** Constructors ***
    
    public Circle(){
        id = nextID++;          // set unique id of circle object
                                // and increment nextID so the next object
                                // gets a uniqui id number
        
        radius = 0.0;           // default value for radius
    }// end default/no-arg constructor
    
    // full arg constructor
    /* this is an example of method overloading
     * you can have two methods with the same name as 
     * long as the paramter list is different
     */
    public Circle(double r){
        id = nextID++;          // set unique id of circle object
                                // and increment nextID so the next object
                                // gets a uniqui id number
        
        this.radius = r;           // default value for radius
    }// end default/no-arg constructor
    
    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * Interface:
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
    
    
    //*** Getters ***
    /*****************************************
    * Description: get circle id
    * 
    * Interface:
    * 
    * @return       int: id number
    * ****************************************/
    public int getId(){
        return id;
    }// end getId
    
    /*****************************************
    * Description: get circle radius
    * 
    * Interface:
    * 
    * @return       double: radius
    * ****************************************/
    public double getRadius(){
        return radius;
    }// end getRadius
       
    //*** Setters ***
    /*****************************************
    * Description: set the value of the radius
    * 
    * Interface:
    * 
    * @param        double: new radius for the circle
    * ****************************************/
    public void setRadius(double radius){
         this.radius = radius;   
    }// end setRadius
    
    // *** other ***
    /*****************************************
    * Description: get circle area
    * 
    * Interface:
    * 
    * @return       double: area
    * ****************************************/
    public double getArea(){
        double a = this.PI * this.getRadius() * this.getRadius();
        return a;
    }// end getArea
    
    /*****************************************
    * Description: get circle circumference
    * 
    * Interface:
    * 
    * @return       double: area
    * ****************************************/
    public double getCircumference(){
        double a = this.PI * this.getRadius() * 2;
        return a;
    }// end getCircumference
    
    /*****************************************
    * Description: get circle diameter
    * 
    * Interface:
    * 
    * @return       double: diameter
    * ****************************************/
    public double getDiameter(){
        double a = this.getRadius() * 2;
        return a;
    }// end getDiameter
    
    /*****************************************
    * Description: over ride to string
    * 
    * Interface:
    * 
    * @return       String: circle state
    * ****************************************/
    @Override
    public String toString(){
        String nl = System.lineSeparator(); 
        
        /* build a string that displays
         * state of the circle i.e.
         * print the id, radius, area, etc...
         * in some formatted fashion
         * for some extra challenge use a StringBuilder object
         */
        StringBuilder s = new StringBuilder();
        
        s.append(String.format("%-10s%10d%s", "Circle:", this.getId(), nl));
        s.append(String.format("%-10s%10.3f%s", "Radius:", this.getRadius(), nl));
        s.append(String.format("%-10s%10.3f%s", "Area:", this.getArea(), nl));
        s.append(String.format("%-10s%10.3f%s", "Diameter:", this.getDiameter(), nl));
        s.append(String.format("%-10s%10.3f%s", "Circ:", this.getCircumference(), nl));
        
        return s.toString();
    }// end toString
    
    
} // end of public class