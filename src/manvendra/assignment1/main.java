package manvendra.assignment1;

/**
 * Created by zemoso on 10/7/17.
 * This is the main class of the project, it is used to get output from other classes of project(in
 *  this case).
 */
public class main{
    /**
     * This is the main function used to call methods of other classes through objects of that class.
     * From this function java starts running the program.
     * @param args to get command-line arguments
     */
    public static void main(String args[]){
        data objdata = new data();
        objdata.newMethod1();
        objdata.newMethod2();
        staticmethod1();
    }

    /**
     * This is a static method to call method of singleton class through its object.
     * Explaination: objsingleton2 -object of singleton class to call its non static method as
     * non static method need to be called through objects while static members can be
     * called by class reference.
     *
     */
    public static void staticmethod1() {
        singleton objsingleton2 = new singleton();
        objsingleton2.nonstaticmethod();
    }
}
