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
        System.out.println("I am passionate about chicken Fingers and it is very 
important to know basic stats about the chicken and where the fingers are coming 
from :)");
        /**
         * Create 2 instances of your class by using the default constructor.
         */
    Chicken_Fingers chickenone = new Chicken_Fingers();
    Chicken_Fingers chickentwo = new Chicken_Fingers();
        /**
         * Call all your objects set methods to assign values to your object. 
Assigns values to chickenone and chickentwo.
         */
    chickenone.setchickenName("Mandy");
    chickenone.setamount(6);
    chickenone.setweight(20.02);
    chickentwo.setchickenName("Drew");
    chickentwo.setamount(10);
    chickentwo.setweight(50.12);
        /**
         * Create 2 instances of your class by using the parameterized constructor
         */
    Chicken_Fingers chickenthree = new Chicken_Fingers("Bob", 4, 19.85);
    Chicken_Fingers chickenfour = new Chicken_Fingers("Henry", 3, 14.66);
        /**
         * Creating and assigning an  array to hold the chicken fingers attributes.
         */
    Chicken_Fingers flock[] = {chickenone, chickentwo, chickenthree, chickenfour};
        /**
         * loop throught the array and call each objects display function. After 
each item is displayed secretly feed the chicken.
         */
    for (Chicken_Fingers i : flock){
        i.display();
        i.eat(5);
    }
        /**
         * Print the title
         */
    System.out.println("Stats after organic feeding:");
        /**
         * loop through and redisplay the updated objects stats since the chicken 
has ate.
         */
    for (Chicken_Fingers i : flock){
        i.display();
    }
}
}
