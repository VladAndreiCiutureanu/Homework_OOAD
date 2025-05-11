import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(3));
        shapes.add(new Rectangle(2,4));
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }
    }
}
