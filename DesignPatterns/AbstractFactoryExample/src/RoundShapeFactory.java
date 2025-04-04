public class RoundShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("circle")){
            return new Circle();
        }
        if(shapeType.equalsIgnoreCase("oval")){
            return new Oval();
        }
        return null;
    }
}
