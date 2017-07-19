package manvendra.assignment3Question3;

/**
 * Created by zemoso on 19/7/17.
 * This class is used to create object of Warrior class and pass it on to the methods which take
 * interfaces as argument.
 * @author Manvendra
 */
public class Main {
    /**
     * This method is used to create object of the interface CanSwim to call its methods.
     * @param obj object of the interface
     */
    void method1(CanSwim obj){
        obj.run();
        obj.swim();
    }
    /**
     * This method is used to create object of the interface CanFly to call its methods.
     * @param obj object of the interface
     */
    void method2(CanFly obj){
        obj.fly();
        obj.invisible();
    }
    /**
     * This method is used to create object of the interface CanFight to call its methods.
     * @param obj object of the interface
     */
    void method3(CanFight obj){
        obj.groundFight();
        obj.skyFight();
    }
    /**
     * This method is used to create object of the interface Hero to call its methods.
     * @param obj object of the interface
     */
    void method4(Hero obj){
        obj.everything();
    }

    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Main main = new Main();
        main.method1(warrior);
        main.method2(warrior);
        main.method3(warrior);
        main.method4(warrior);
        warrior.power();
    }
}