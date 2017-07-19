package manvendra.assignment3Question1;

/**
 * Created by zemoso on 18/7/17.
 * This class describes the lifetime,food type,habitat,average weight and type of Mouse sub class.
 * @author Manvendra
 */
public class Mouse extends Rodent {
    /**
     * It is a default constructor which describes the class Mouse.
     */
    Mouse(){
        System.out.println("This is Mouse class.");
    }
    /**
     * This describes the lifetime of Mouse.
     */
    @Override
    public void lifeTime() {
        System.out.println("Lifetime is around 5 years.");
    }
    /**
     * This describes about the food type(whether they are herbivorous or not).
     */
    @Override
    public void food(){
        System.out.println("They are Herbivorous in nature.");
    }
    /**
     * This tells us about their habitat.
     */
    @Override
    public void home() {
        System.out.println("They live underground.");
    }
}