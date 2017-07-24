package manvendra.assignment4;

import java.util.Random;

/**
 * Created by zemoso on 19/7/17.
 * This Class is used to throw and catch exceptions.
 * @author Manvendra
 */
public class ExceptionHandling extends Exception{
    public ExceptionHandling() {
    }

    public ExceptionHandling(String s) {
        super(s);
    }

    public ExceptionHandling(String s, Throwable throwable) {
        super(s, throwable);
    }

    public ExceptionHandling(Throwable throwable) {
        super(throwable);
    }

    public ExceptionHandling(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }

    /**
     * This method is used to throw four exceptions NewException1, NewException2, NewException3
     * and NullPointerException.
     * @param a integer type
     * @throws NewException1 exception
     * @throws NewException2 exception
     * @throws NewException3 exception
     */
    public static void exceptionThrow(int a) throws NewException1,NewException2,NewException3{
        if(a==10 || a==12|| a==15 || a==18){
            System.out.println("Throwing Exception NewException1");
            throw new NewException1("NewException1");
        }
        else if(a>20){
            System.out.println("Throwing Exception NewException2");
            throw new NewException2("NewException2");
        }
        else if(a<10){
            System.out.println("Throwing Exception NewException3");
            throw new NewException3("NewException3");
        }
        else throw new NullPointerException();
    }
    /**
     * This method is used to catch exceptions.
     */
    public static String trycatch(int i){
        Exception result = new Exception();
        try{
            exceptionThrow(i);
        } catch (Exception e) {
            result = e;
            System.out.println("Exception Caught : " + e.toString());
        }
        /**
         * Finally clause is used to verify that finally clause is executed,
         * even if a NullPointerException is thrown.
         */
        finally {
            System.out.println("Finally");
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int random = randomGenerator.nextInt(30);
        System.out.println("The input is : " + random);
        trycatch(random);
    }
}