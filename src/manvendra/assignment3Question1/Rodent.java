package manvendra.assignment3Question1;

/**
 * Created by zemoso on 18/7/17.
 * This class is the base class of other three classes.It is used to define behaviours of base class.
 * @author Manvendra
 */
abstract class Rodent {
    /**
     * It is a default constructor which describes the class Rodent.
     */
    Rodent(){
        System.out.println("This is the base class Rodent.");
    }
    /**
     * This describes the lifetime of the rodents.
     */
    abstract void lifeTime();
    /**
     * This describes about the food type(whether they are herbivorous or not).
     */
    abstract void food();
    /**
     * This tells us about their habitat.
     */
    abstract void home();
    /**
     * This tells us about the average weight of rodents.
     */
    protected void weight() {
        System.out.println("Average weight is about 100 grams.");
    }
    /**
     * This method is used to classify whether they are mammals or not.
     */
    protected void type(){
        System.out.println("All are mammals.");
    }
}