// Chicken_Fingers Driver Test
// Create a class called Driver.java. This class will contain your main method
// @author Andy Kilgore
// @version 1.0.0

//creating a driver to test Chicken_Fingers.java
public class Driver{

//Setting up the main method, no args
public static void main(String[] args) {
    
    System.out.println("I am passionate about chicken Fingers and it is very important to know basic the chicken and  where the fingers are coming from :)");

    // Create 2 instances of your class by using the default constructor.
    Chicken_Fingers chickenone = new Chicken_Fingers();
    Chicken_Fingers chickentwo = new Chicken_Fingers();

    // Call all your objects set methods to assign values to your object. Assigns values to chickenone and chickentwo
    chickenone.setchickenName("Mandy");
    chickenone.setamount(6);
    chickenone.setweight(20.02);
    chickentwo.setchickenName("Drew");
    chickentwo.setamount(10);
    chickentwo.setweight(50.12);

    // Create 2 instances of your class by using the parameterized constructor 
    Chicken_Fingers chickenthree = new Chicken_Fingers("Bob", 4, 19.85);
    Chicken_Fingers chickenfour = new Chicken_Fingers("Henry", 3, 14.66);

    // Creating an array to hold the chicken fingers objects 
    Chicken_Fingers flock[];
    flock = new Chicken_Fingers[4];

    //appending each chicken object to flock array
    flock[0] = chickenone;
    flock[1] = chickentwo;
    flock[2] = chickenthree;
    flock[3] = chickenfour;

    // loop throught the array and call each objects display function
    for (int i = 0; i < 4; ++i){
        flock[i].display();
    }

    System.out.println("Stats after organic feed:");
    //loop through the array to call each objects eat method
    for (int i = 0; i < 4; ++i){
        flock[i].eat(5);
    }
    // loop through and redisplay the objects stats again after update
    for (int i = 0; i < 4; ++i){
        flock[i].display();
    }
}
}