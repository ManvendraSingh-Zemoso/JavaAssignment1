package manvendra.assignment3Question4;

/**
 * Created by zemoso on 19/7/17.
 * This class is the implementation of TricycleFactory which is the factory of class
 * Tricycle.
 * @author Manvendra
 */
public class TricycleImplementationFactory implements TricycleFactory {
    /**
     * This method is used to return object of Tricycle class.
     * @return returns object of class Tricycle
     */
    public Tricycle getTricycle(){
        return new Tricycle();
    }
}
