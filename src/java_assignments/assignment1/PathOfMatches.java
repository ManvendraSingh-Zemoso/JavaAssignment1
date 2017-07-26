package java_assignments.assignment1;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Created by zemoso on 26/7/17.
 * This class is used to find files in home directory which matches with input pattern.
 * @author Manvendra
 */
public class PathOfMatches {
    public static void main(String[] args) {
        Input();
    }
    /**
     * It is used to read/scan input from the user.
     * @return input string type
     */
    public static String TakeInput() {
        System.out.println("Enter the regular expression to be matched(type null to end) : ");
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        System.out.println("Regex :" + n);
        return n;
    }
    /**
     * It is used to make the process recursive.
     */
    public static void Input(){
        String input;
        do {
            input = TakeInput();
            if(!(input.equals("null")))Match(input);
        }while(!(input.equals("null")));
    }
    /**
     * It is used to match the input with the files present in home directory and print
     * the files with their absolute path.
     * @param input it is the input taken from user
     */
    public static void Match(String input){
        File[] files = new File("/home/zemoso").listFiles();
        for (File file : files) {
            if (file.isFile()) {
                Pattern pattern = Pattern.compile(input);
                Matcher filematcher = pattern.matcher(file.getName());
                if(filematcher.find()) {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}