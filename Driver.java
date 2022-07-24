/** Chicken_Fingers Driver Test
 * Create a class called Driver.java. This class will contain your main method
 * @author Andy Kilgore
 * @version 1.0.0
 */
/**
 * creating a driver to test Chicken_Fingers.java
 */
public class Driver{
    /**
     * Setting up the main method, no args
     * @param args
     */
    public static void main(String[] args) {
        /**
         * print out header
         */
        System.out.println("I am passionate about chicken Fingers and it is very important to know basic stats about the chicken and where the fingers are coming from :)" + "\n");
        /**
         * 2 instances default constructor.
         */
        ChickenFingers chickenone = new ChickenFingers();
        ChickenFingers chickentwo = new ChickenFingers();
        /**
         * Assigns values to chickenone and chickentwo.
         */
        chickenone.setChickenName("Mandy");
        chickenone.setAmount(6);
        chickenone.setWeight(20.02);
        chickentwo.setChickenName("Drew");
        chickentwo.setAmount(10);
        chickentwo.setWeight(50.12);
        /**
         * 2 instances parameterized constructor
         */
        ChickenFingers chickenthree = new ChickenFingers("Bob", 4, 19.85);
        ChickenFingers chickenfour = new ChickenFingers("Henry", 3, 14.66);

        /**
         * Demonstrate that the copy Constructor works correctly
         */
        ChickenFingers twin = new ChickenFingers(chickenone);

        /**
         * In your main method, create 2 new object using your subclass, set the data, and call the display method.
         * Create one object using the no-arg (default) constructor of your sub-class. [1 point]
         * Call the set methods to set all attribute data associated to that object.
         */
        babyChick basichick = new babyChick();
        basichick.setChickenName("Brandon");
        basichick.setAmount(2);
        basichick.setWeight(5.00);
        basichick.setMotherName("Tina");

        /**
         * Call the display method for that object
         */
        basichick.display();

        /**
         * Create one object using the parameterized constructor of your sub-class. [1 point]
         * Call the display() method for this object too
         */
        babyChick paramchick = new babyChick("Duew", 2, 3.00, "Tanya");
        paramchick.display();

        /**
         * Creating and assigning an  array to hold the chicken fingers attributes.
         */
        ChickenFingers flock[] = {chickenone, chickentwo, chickenthree, chickenfour, twin, basichick, paramchick};
        /**
         * call each objects display functions. After
         each item is displayed secretly feed the chicken.
         */
        for (ChickenFingers i : flock) {
            i.display();
            i.eat(5);
        }

        System.out.println();

        System.out.println("Stats after organic feeding:");
        /**
         * redisplay the updated objects stats since the chicken has eaten.
         */
        for (ChickenFingers i : flock) {
            i.display();
        }

        System.out.println();

        /**
         * Demonstrate that the toString, and equals methods work in your main method [2 point]
         */
        System.out.println(chickenone);
        System.out.println();
        System.out.println("Is the object from copy Constructor the same? " + twin.equals(chickenone));
        System.out.println();


        /**
         * Also call this method at the end of your main method. [1 point]
         * Since counter is a static variable, it doesn't matter what chicken we call displayTotalChickens on'
         */
        chickenfour.displayTotalChickens();

        /**
         * Add all these objects from Assignment 2 to the same array you created in Assignment 1,
         * and loop through all objects to call the display method. (This demonstrates polymorphism)  [2 point]
         */
        for (ChickenFingers i : flock) {
            i.display();
        }
        System.out.println();
    }}


