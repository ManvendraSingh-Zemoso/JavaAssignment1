package manvendra.assignment3Question4;

/**
 * Created by zemoso on 19/7/17.
 * This class is the implementation of BicycleFactory which is the factory of class
 * Bicycle.
 * @author Manvendra
 */
public class BicycleImplementationFactory implements BicycleFactory {
    /**
     * This method is used to return object of Bicycle class.
     * @return returns object of class Bicycle
     */
    public Bicycle getBicycle(){return new Bicycle();}
}
