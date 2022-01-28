public class Circle extends Shape {

    private int radius;

    public Circle(int radius) {
        super("Circle");
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public int Area() {
        return 3 * radius * radius;
    }
}
