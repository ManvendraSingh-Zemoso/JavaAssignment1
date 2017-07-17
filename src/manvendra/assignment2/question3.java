package manvendra.assignment2;

/**
 * Created by zemoso on 13/7/17.
 * This class is used to check whether constructor is called when array of object references
 * to this class are created.
 * @author Manvendra
 */
public class question3 {

    question3(String s){
        System.out.println("String : " + s);
    }

    public static void main(String[] args) {
        question3 [] arr = new question3[1];
    }
}