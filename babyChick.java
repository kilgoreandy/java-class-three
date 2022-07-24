/** Chicken_Fingers Driver Test
 * Create a class called Driver.java. This class will contain your main method
 * @author Andy Kilgore
 * @version 1.0.0
 */


/**
 * Create a sub class that inherits everything from your base class.
 * (For example, if Car is the base class then SportsCar could be your sub class) [1 point]
 */
public class babyChick extends ChickenFingers{
    /**
     * Provide at least one additional attribute to your subclass [1 point]
     */

    private String motherName;


    /**
     * Inherits all constructors from super class
     * Create a default constructor for the subclass, that uses super to call the base class default constructor. [1 point]
     * It should set all attributes in the subclass as well as the super class to default values
     */
    public babyChick() {
        super();
        motherName = "Unknown";
    }

    /**
     * Create a parameterized constructor for the subclass, that uses keyword super to pass the inherited parameters to the base class. [2 point]
     * It should set all attributes in the subclass as well as the super class to the values that are passed in to the constructor.
     */
    public babyChick(String name, int num, double weight, String motherName) {
        super(name, num, weight);
        this.motherName = motherName;
    }

    public babyChick(ChickenFingers object, String motherName) {
        super(object);
        this.motherName = motherName;
    }

    /**
     * Create gettter/setter methods for it.
     */
    public String getMotherName() {
        return motherName;
    }
    public void setMotherName(String name) {
        this.motherName = name;
    }

    /**
     * Override the display() method to print out all the instance variable values from the base class, and also from the sub class. [2 point]
     */
    @Override
    public void display() {
        System.out.println("Chicken Name: " + getChickenName() + " Number of Fingers: " + getAmount() + " Weight: " + getWeight() + " and my moms name is " + getMotherName() + "\n");
        System.out.println("Baby Chickens Mother is named: " + getMotherName());
    }
}
