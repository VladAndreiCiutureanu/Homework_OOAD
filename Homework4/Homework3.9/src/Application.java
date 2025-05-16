public class Application {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(1.0), new Square(2.0), new Rectangle(3.0, 4.0)};
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }
    }
}
