public class Application {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("TRIANGLE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("Circle");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("RECTANGlE");
        shape3.draw();
    }
}
