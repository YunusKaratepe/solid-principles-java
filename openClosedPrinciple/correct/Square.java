public class Square extends Shape {

    private int height;

    public Square(int height) {
        super("Square");
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int Area() {
        return height * height;
    }

}
