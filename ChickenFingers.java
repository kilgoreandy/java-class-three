/** Java Class II Assignment 1
 * @author Andy Kilgore
 * @version 1.0.0
 */
/**
 * Create a class named after your favorite object in the whole world.
 *
 * Create a static field in your class called counter. It should increment every time an object is created. [1 point]
 */
public class ChickenFingers {
    private String chickenName;
    private int amount;
    private double weight;
    public static int counter;

    /**
     * Create a default constructor
     * use the "this" reference in your default constructor to call the parameterized constructor. [1 point]
     */
    public ChickenFingers(){
        this("Unnamed Chicken", 0,0.00);
        String chickenName = this.chickenName;
        int amount = this.amount;
        double weight = this. weight;
    }

    /**
     * Parameterized constructor
     */
    public ChickenFingers(String name, int num, double weight){
        chickenName = name;
        amount = num;
        this.weight = weight;
        counter += 1;
    }

    /**
     * Create a Copy Constructor in your class [2 point]
     */
    public ChickenFingers(ChickenFingers object){
        chickenName = object.chickenName;
        amount = object.amount;
        weight = object.weight;
        counter += 1;
    }

    /**
     * Getters
     */
    public String getChickenName(){
        return chickenName;
    }
    public int getAmount(){
        return amount;
    }
    public double getWeight(){
        return weight;
    }


    /**
     * Setters
     * Use the "this" reference in all your setter (mutator) methods
     */
    public void setChickenName(String name){
        this.chickenName = name;
    }
    public void setAmount(int num){
        this.amount = num;
    }
    public void setWeight(double lbs){
        this.weight  = lbs;
    }


    /**
     * Create a Method called display(), that simply prints out the values of all
     instance variables of your object (2 points)
     */
    public void display(){
        System.out.println("Chicken Name: " + this.chickenName + ", Number of Fingers:" + this.amount + ", Weight: " + this.weight + "lbs");
    }

    /**
     *  Method of your choice that increments objects instance fields.
     */
    public void eat(double foodinlbs){
        /**
         * Call set weight to increment
         */
        this.setWeight(this.weight += foodinlbs);
    }

    /**
     * Create a static method that displays the counter value.
     */
    public void displayTotalChickens(){
        System.out.println("Total Chickens Spawned:" + counter);
    }

    /**
     * Override the toString() method and equals() method inside your class [2 points]
     */
    @Override
    public String toString() {
        return ("I am " + this.chickenName + " and I am proud to be a chicken");
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof ChickenFingers;
    }

}