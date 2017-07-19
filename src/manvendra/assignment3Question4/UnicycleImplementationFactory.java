package manvendra.assignment3Question4;

/**
 * Created by zemoso on 19/7/17.
 * This class is the implementation of UnicycleFactory which is the factory of class
 * Unicycle.
 * @author Manvendra
 */
public class UnicycleImplementationFactory implements UnicycleFactory {
    /**
     * This method is used to return object of Unicycle class.
     * @return returns object of class Unicycle
     */
    public Unicycle getUnicycle(){
        return new Unicycle();
    }
}
