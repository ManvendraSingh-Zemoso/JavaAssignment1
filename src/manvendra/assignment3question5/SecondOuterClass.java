package manvendra.assignment3question5;

/**
 * Created by zemoso on 19/7/17.
 * This class is used to create a inner class which inherits from Inner class of OuterClass.
 * Explaination : To inherit from inner class of a class by using an inner class we need to inherit from
 * the outer class of that inner class to the outer class of inheriting inner class.
 * @author Manvendra
 */
public class SecondOuterClass extends OuterClass{
    class SecondInnerClass extends OuterClass.InnerClass{
        SecondInnerClass(String input){
            super(input);
        }
    }
}
