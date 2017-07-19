package manvendra.assignment3Question1;

/**
 * Created by zemoso on 18/7/17.
 * This class is used to create array of Rodent and call base class methods.
 * @author Manvendra
 */
public class MainClass {
    public static void main(String[] args) {
        Rodent rodent[] = {new Mouse(),new Gerbil(),new Hamster() };
        for(int i=0;i<3;i++){
            System.out.println("This describes  " + rodent[i]);
            rodent[i].lifeTime();
            rodent[i].food();
            rodent[i].home();
            rodent[i].weight();
            rodent[i].type();
        }
    }
}