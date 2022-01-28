/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        Car car = new Car(new Engine());
        car.start();

        car = new Car(new DieselEngine());
        car.start();
    }
}