public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded) {
        if(rounded){
            return new RoundShapeFactory();
        }
        return new ShapeFactory();
    }
}
