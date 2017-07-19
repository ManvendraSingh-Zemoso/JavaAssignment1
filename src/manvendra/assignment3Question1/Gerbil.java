package manvendra.assignment3Question1;

/**
 * Created by zemoso on 18/7/17.
 */
public class Gerbil extends Rodent {
    /**
     * It is a default constructor which describes the class Gerbil.
     */
    Gerbil(){
        System.out.println("This is Gerbil class.");
    }
    /**
     * This describes the lifetime of Gerbil.
     */
    @Override
    public void lifeTime() {
        System.out.println("Lifetime is around 10 years.");
    }
    /**
     * This describes about the food type(whether they are herbivorous or not).
     */
    @Override
    public void food(){
        System.out.println("They are Carnivorous in nature.");
    }
    /**
     * This tells us about their habitat.
     */
    @Override
    public void home() {
        System.out.println("They have adapted to almost every terrestrial habitat");
    }
    /**
     * This tells us about the average weight of rodents.
     */
    @Override
    public void weight() {
        System.out.println("Average weight is about 70 grams.");
    }
}

