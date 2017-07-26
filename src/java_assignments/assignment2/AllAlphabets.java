package java_assignments.assignment2;

import java.util.Scanner;

/**
 * Created by zemoso on 26/7/17.
 * This class is used to check whether the input string consists of all alphabets(case-insensitive).
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
        int array[] = new int[26];
        for(int i=0;i<26;i++)array[i]=0;
        boolean value=true;
        if(str.length()<26) value=false;
        else{
            for(int i=0;i<str.length();i++) {
                char check = Character.toLowerCase(str.charAt(i));
                if((int)check >=97 && (int)check <=122 ){
                    int position = check - 'a';
                    array[position]+=1;
                }
            }
            for(int i=0;i<26;i++){
                if(array[i]==0) {
                    value=false;
                }
            }
        }
        if(value==true)System.out.println("The input string contains all alphabets(case-insensitive).");
        else System.out.println("The input string does not contain all alphabets.");
    }
}