package manvendra.assignment4;

/**
 * Created by zemoso on 19/7/17.
 * This class is used to create an new exception.
 * @author Manvendra
 */
public class NewException1 extends Exception{
    /**
     * Non -default constructor of the class to print the message when it is called.
     * @param message String type
     */
    public NewException1(String message){
        System.out.println(message);
    }
}
