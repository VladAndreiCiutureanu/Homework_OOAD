public class Application {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape(2.0);
        System.out.println(shape1.getArea());
        Shape shape2 = ShapeFactory.getShape(3.0,5.0);
        System.out.println(shape2.getArea());
    }
}
