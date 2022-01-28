public class AreaCalculator {

    private Shape[] shapes;

    public void setShapes(Shape[] shapes) {
        this.shapes = shapes;
    }

    public Shape[] getShapes() {
        return shapes;
    }

    public int sumAreas() {
        int sum = 0;
        for (Shape shape: this.shapes) {
            if (shape.getShape().equals("Square")) {
                Square square = (Square) shape;
                sum += square.getHeight() * square.getHeight();
            }
            else if (shape.getShape().equals("Circle")) {
                Circle circle = (Circle) shape;
                sum += circle.getRadius() * circle.getRadius() * 3;
            }
        }
        return sum;
    }
}
