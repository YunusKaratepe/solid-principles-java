public class Main {
    public static void main(String[] args) {
        
        Shape[] shapes = new Shape[3];


        Square square = new Square(5);
        Square square2 = new Square(3);
        Circle circle = new Circle(3);

        shapes[0] = square;
        shapes[1] = square2;
        shapes[2] = circle;

        AreaCalculator areaCalculator = new AreaCalculator();
        areaCalculator.setShapes(shapes);

        System.out.println(areaCalculator.sumAreas());;

    }
}
