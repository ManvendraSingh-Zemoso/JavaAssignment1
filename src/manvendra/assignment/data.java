package manvendra.assignment;

/**
 * Created by zemoso on 10/7/17.
 * This class is used to check default initialization of global and local member variables.
 */
public class data {
    /**
     * @param i integer type global variable
     * @param ch1 character type global variable
     */
    int i;
    char ch1;
    /**
     * This is a method to print default values of global member variables.
     */
    public void newMethod1(){
        System.out.println(i);
        System.out.println(ch1);
    }

    /**
     * This is a method to print default values of local member variables.
     * j- integer type local variable
     * ch2- character type local variable
     *
     * But this gives an error as the local variables need to be initialized in java
     * since these are not fields of a class.
     */

    public void newMethod2(){
        /*int j;
        char ch2;
        System.out.println(j);
        System.out.println(ch2);*/
    }
}
