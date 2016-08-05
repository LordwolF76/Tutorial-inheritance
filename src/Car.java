/**
 * Created by LordwolF on 8/4/2016.
 */
public class Car extends Machine {

    @Override
    public void start() {
        super.start();
    }

    public void wipeWindSield() {
        System.out.println("Wiping Windshield.");
    }
/*    public void start() {
        System.out.println("Car has Started.");
    }*/

    public void  showInfo() {
        System.out.println("Car name; " + name);
    }
}
