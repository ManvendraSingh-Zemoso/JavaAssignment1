package manvendra.assignment3Question2;

/**
 * Created by zemoso on 18/7/17.
 * This class is used to access the other classes.
 * @author Manvendra
 */
public class MainClass {
    public static void main(String[] args) {
        casting();
    }

    /**
     * This method is used for Upcasting and Downcasting.
     */
    public static void casting(){
        System.out.println("Upcasting : ");
        Cycle[] cycle = {new UniCycle(), new BiCycle(), new TriCycle()};
        for(int i=0;i<3;i++)
        {
            cycle[i].balance();
        }
        System.out.println("Downcasting : ");
        ((UniCycle)(cycle[0])).balance();
        ((BiCycle)(cycle[1])).balance();
        ((TriCycle)(cycle[2])).balance();
    }
}
