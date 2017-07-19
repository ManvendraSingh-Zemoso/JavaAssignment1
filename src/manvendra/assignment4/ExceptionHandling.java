package manvendra.assignment4;

/**
 * Created by zemoso on 19/7/17.
 * This Class is used to throw and catch exceptions.
 * @author Manvendra
 */
public class ExceptionHandling extends Exception{
    /**
     * This method is used to throw four exceptions NewException1, NewException2, NewException3
     * and NullPointerException.
     * @param a integer type
     * @throws NewException1 exception
     * @throws NewException2 exception
     * @throws NewException3 exception
     */
    public static void exceptionThrow(int a) throws NewException1,NewException2,NewException3{
        if(a==0){
            System.out.println("Throwing Exception NewException1");
            throw new NewException1("NewException1");
        }
        else if(a>10){
            System.out.println("Throwing Exception NewException2");
            throw new NewException2("NewException2");
        }
        else if(a<0){
            System.out.println("Throwing Exception NewException3");
            throw new NewException3("NewException3");
        }
        else throw new NullPointerException();
    }
    /**
     * This method is used to catch exceptions.
     */
    public static void trycatch(int i){
        try{
            exceptionThrow(i);
        } catch (Exception e) {
            System.out.println("Exception Caught is : " + e.toString());
        }
        /**
         * Finally clause is used to verify that finally clause is executed,
         * even if a NullPointerException is thrown.
         */
        finally {
            System.out.println("Finally");
        }
    }
    public static void main(String[] args) {
        trycatch(0);
    }
}
