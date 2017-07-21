package manvendra.assignment5;

import java.util.regex.Pattern;

/**
 * Created by zemoso on 20/7/17.
 * This class is used to check whether a regular expression starts with an uppercase character
 * and ends with an period.
 * @author Manvendra
 */
public class Regex {
    /**
     * This method is used match the pattern with input.
     * @param test String type input
     * @return true or false
     */
    public static boolean TestRegex(String test){
        return Pattern.matches("^[A-Z].*[.]$",test);
    }
    /**
     * This method is used to print the result of TestRegex.
     * @param result output of return statement from Test method
     */
    public static void Result(boolean result){
        if(result) System.out.println("It is a regular Expression.");
        else System.out.println("Not a regular expression.");
    }
    public static void main(String[] args) {
        String input = "This is a statement.";
        System.out.println("Input = " + input);
        Result(TestRegex(input));
    }
}