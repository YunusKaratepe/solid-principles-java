public abstract class Shape {

    private String shape;

    public Shape(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public abstract int Area();
}
