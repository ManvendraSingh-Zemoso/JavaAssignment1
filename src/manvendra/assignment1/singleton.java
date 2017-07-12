package manvendra.assignment1;

/**
 * Created by zemoso on 10/7/17.
 * This class is used to analyze the access of static and non static member methods and variables
 * through static and non static member methods.
 */
public class singleton {
    //static String s;
    /**
     * @param s string type non static variable
     */
    String s;

    /**
     * This is a static method to initialize non static variable.Hence it gives an error that
     * non-static variables cannot be referenced from static context, So we need to define it
     * as static member variable.As shown in comments above.
     *
     * @return object of class singleton
     */
    static singleton staticmethod(){
        //s="Zemoso";
        singleton objsingleton1 = new singleton();
        return objsingleton1;
    }

    /**
     * This is a non static method to print the value of the string.
     * To get the updated value of string we need to call the staticmethod() inside it before printing.
     */
    public void nonstaticmethod(){
        //staticmethod();
        System.out.println(s);
    }
}
