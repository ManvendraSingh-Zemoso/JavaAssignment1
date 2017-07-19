package manvendra.assignment4;

/**
 * Created by zemoso on 19/7/17.
 * This class is used to create a new exception.
 * @author Manvendra
 */
public class NewException3 extends Exception {
    /**
     * Non -default constructor of the class to print the message when it is called.
     * @param message String type
     */
    public NewException3(String message){
        System.out.println(message);
    }
}
