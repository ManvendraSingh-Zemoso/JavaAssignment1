package manvendra.assignment3Question4;

/**
 * Created by zemoso on 19/7/17.
 * This Class is used to call a creation method on a factory object which produces an
 * implementation of the interface.
 * @author Manvendra
 */
public class Factories {
    /**
     * This method is used to call on a UnicycleFactory object.
     * @param fact object of UnicycleImplementationFactory
     */
    public static void ServiceUnicycle(UnicycleFactory fact){
        Unicycle s= fact.getUnicycle();
        s.balance();
    }
    /**
     * This method is used to call on a BicycleFactory object.
     * @param fact object of BicycleImplementationFactory
     */
    public static void ServiceBicycle(BicycleFactory fact){
        Bicycle s= fact.getBicycle();
        s.balance();
    }
    /**
     * This method is used to call on a TricycleFactory object.
     * @param fact object of TricycleImplementationFactory
     */
    public static void ServiceTricycle(TricycleFactory fact){
        Tricycle s= fact.getTricycle();
        s.balance();
    }

    /**
     * Used to call methods which produces an implementation of interfaces.
     * @param args to get command line arguments
     */
    public static void main(String[] args) {
        ServiceUnicycle(new UnicycleImplementationFactory());
        ServiceBicycle(new BicycleImplementationFactory());
        ServiceTricycle(new TricycleImplementationFactory());
    }
}
