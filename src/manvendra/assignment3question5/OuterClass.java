package manvendra.assignment3question5;

/**
 * Created by zemoso on 19/7/17.
 * This class is used as the base class for SecondOuterClass and used to create an Inner class.
 * @author Manvendra
 */
public class OuterClass {
    class InnerClass{
        /**
         * This is non-default constructor of class InnerClass.
         * @param input string type
         */
        InnerClass(String input){
            System.out.println(input);
        }
    }
}
