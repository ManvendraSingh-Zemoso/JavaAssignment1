package java_assignments.assignment2;

import java.util.Scanner;

/**
 * Created by zemoso on 26/7/17.
 * This class is used to check whether the input string consists of all alphabets(case-insensitive).
 * Time complexity is O(n), where n is the length of the string, and space complexity is O(1) i.e. constant.
 * @author Manvendra
 */
public class AllAlphabets {
    /**
     * To take a string as input and check if it consists of all alphabets or not.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter the input string to be checked for all alphabets : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean array[] = new boolean[26];
        for(int i=0;i<26;i++)array[i]=false;
        boolean value=true;
        int count=0;
        if(str.length()<26) value=false;
        else{
            for(int i=0;i<str.length();i++) {
                char check = Character.toLowerCase(str.charAt(i));
                if((int)check >=97 && (int)check <=122 ){
                    int position = check - 'a';
                    if(array[position]==false) {
                        array[position] = true;
                        count++;
                        if (count == 26){
                            System.out.println("The input string contains all alphabets(case-insensitive).");
                            return;
                        }
                    }
                }
            }
            for(int i=0;i<26;i++){
                if(array[i]==false) {
                    value=false;
                }
            }
        }
        if(value==true)System.out.println("The input string contains all alphabets(case-insensitive).");
        else System.out.println("The input string does not contain all alphabets.");
    }
}