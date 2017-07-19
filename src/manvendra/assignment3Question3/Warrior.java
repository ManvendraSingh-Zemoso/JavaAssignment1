package manvendra.assignment3Question3;

/**
 * Created by zemoso on 19/7/17.
 * This class is used to implement the inherited interface and inherit a base class.
 * @author Manvendra
 */
public class Warrior extends God implements Hero {
    /**
     * This method is the implementation of method from interface CanFly.
     */
    public void fly() {
        System.out.println("Can Fly.");
    }
    /**
     * This method is the implementation of method from interface CanSwim.
     */
    public void run() {
        System.out.println("Can run.");
    }
    /**
     * This method is the implementation of method from interface CanFight.
     */
    public void groundFight() {
        System.out.println("Can fight on ground.");
    }
    /**
     * This method is the implementation of method from interface CanFly.
     */
    public void invisible() {
        System.out.println("Can be invisible.");
    }
    /**
     * This method is the implementation of method from interface CanSwim.
     */
    public void swim() {
        System.out.println("Can Swim.");
    }
    /**
     * This method is the implementation of method from interface CanFight.
     */
    public void skyFight() {
        System.out.println("Can fight in sky.");
    }
    /**
     * This method is the implementation of method from interface Hero.
     */
    public void everything() {
        System.out.println("Everything is possible.");
    }
}
