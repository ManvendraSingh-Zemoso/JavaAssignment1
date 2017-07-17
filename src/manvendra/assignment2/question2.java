package manvendra.assignment2;

/**
 * Created by zemoso on 13/7/17.
 * This class is used to call second constructor from first constructor.
 * @author Manvendra
 */
public class question2 {
    static int i;

    /**
     * Constructor used to call other constructor.
     */
    question2(){
        new question2(i);
        System.out.println("default");
    }

    /**
     * Constructor with argument
     * @param j integer type
     */
    question2(int j){
        System.out.println("value of i = " + j);
    }

    public static void main(String[] args) {
        for (i = 0; i < 5; i++) {
            new question2();
        }
    }
}
