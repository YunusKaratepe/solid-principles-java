public class Car {
    private IEngine engine;
    public Car(IEngine e) {
        engine = e;
    }

    public void start() {
        engine.start();
    }
    
}
