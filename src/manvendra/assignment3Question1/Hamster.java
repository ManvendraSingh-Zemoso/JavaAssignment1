package manvendra.assignment3Question1;

/**
 * Created by zemoso on 18/7/17.
 */
public class Hamster extends Rodent {
    /**
     * It is a default constructor which describes the class Hamster.
     */
    Hamster(){
        System.out.println("This is Hamster class.");
    }
    /**
     * This describes the lifetime of Hamsters.
     */
    @Override
    public void lifeTime() {
        System.out.println("Their lifetime is around 2-3 years.");
    }
    /**
     * This describes about the food type(whether they are herbivorous or not).
     */
    @Override
    public void food(){
        System.out.println("They are omnivores.");
    }
    /**
     * This tells us about their habitat.
     */
    @Override
    public void home() {
        System.out.println("They have adapted to almost every terrestrial habitat");
    }
    /**
     * This method is used to classify whether they are mammals or not.
     */
    @Override
    public void type(){
        System.out.println("They are not mammals.");
    }

}
