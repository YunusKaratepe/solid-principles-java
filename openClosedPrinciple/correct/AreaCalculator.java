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
            sum += shape.Area();
        }
        return sum;
    }
}
