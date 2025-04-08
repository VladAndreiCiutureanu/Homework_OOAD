public class ShapeFactory {
    public static Shape getShape(double... dimensions) {
        if (dimensions.length == 2) {
            return new Rectangle(dimensions[0], dimensions[1]);
        }
        if (dimensions.length == 1){
            return new Circle(dimensions[0]);
        }
        return null;
    }
}
