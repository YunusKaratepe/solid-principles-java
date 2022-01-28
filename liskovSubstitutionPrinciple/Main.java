public class Main {

    public static boolean testRectangle(Rectangle r) {
        r.setHeight(4);
        r.setWidth(5);
        return r.getHeight() * r.getWidth() == 4 * 5;
    }

    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle();
        Square square = new Square();

        square.setHeight(5);
        rectangle.setHeight(5);
        rectangle.setWidth(4);



        System.out.println(testRectangle(rectangle));
        System.out.println(testRectangle(square));
        // square should not extend rectangle
        

    }
}
