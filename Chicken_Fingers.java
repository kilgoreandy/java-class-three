/** Java Class II Assignment 1 
* @author Andy Kilgore
* @version 1.0.0
*/

//Create a class named after your favorite object in the whole world.
public class Chicken_Fingers {
    // Declare the three data types for you instance variables
    // Create Instance Variables (attributes) (2 point)
    // Create at least 3 private instance fields (attributes) for your class
    // You must use at least 3 different data types for your fields

    private String chickenName = "Bob";
    private int amount = 5;
    private double weight = 20.00; 



//Create a default constructor (no parameters) that assigns all your instance variables to default values  (1 points)
    public Chicken_Fingers(){
    String chickenName = this.chickenName;
    int amount = this.amount;
    double weight = this. weight; 
    } 
    
//Create a parameterized constructor that takes all instance variables as parameters, and sets the instance variables to the values provided by the parameters (2 points)
    public Chicken_Fingers(String name, int num, double weight){
        chickenName = name;
         amount = num; 
         weight = weight; 
    }

//Create getter (accessor) and setter (mutator) methods  
//Create a getter (accessor) method for each of your instance variables (1 point)
//Create a setter (mutator) method for each of your instance variables  (1 point)

//Getter for chickenName
public String getchickenName(){
    return chickenName;
}
//Setter for chickenName
public void setchickenName(String name){
    chickenName = name;
}

//Getter for amount
public int getamount(){
    return amount;
}
//Setter for amount
public void setamount(int num){
    amount = num;
}

//Getter for weight
public double getweight(){
    return weight;
}
//Setter for weight
public void setweight(double lbs){
    weight  = lbs;
}

//Create a Method called display(), that simply prints out the values of all instance variables of your object (2 points)
public void display(){
    System.out.println("Chicken Name: " + this.chickenName + ", Number of Fingers: " + this.amount + ", Weight: " + this.weight + "lbs");
}

// Create any other method of your choice that increments or decrements any one of the objects instance fields. Test out the method for at least one of your objects. (2 point)
public void eat(double foodinlbs){
    // Call set weight to increment
    this.setweight(this.weight += foodinlbs);
}
}
