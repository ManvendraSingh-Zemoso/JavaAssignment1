package manvendra.assignment2;

/**
 * Created by zemoso on 13/7/17.
 * This class is used to check whether constructor is called when array of object references
 * to this class is initialized.
 * @author Manvendra
 */
public class question4 {

    question4(String s){
        System.out.println("String : " + s);
    }

    public static void main(String[] args) {
        question4 [] arr = new question4[1];
        question4 obj = new question4("hello");
        arr[0] = obj;
    }
}

