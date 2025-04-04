public class Application {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(true);
        Shape circle = shapeFactory.getShape("Circle");
        Shape oval = shapeFactory.getShape("Oval");
        circle.draw();
        oval.draw();

        shapeFactory = FactoryProducer.getFactory(false);
        Shape square = shapeFactory.getShape("Square");
        square.draw();
        shapeFactory = FactoryProducer.getFactory(false);
        Shape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.draw();
    }
}
