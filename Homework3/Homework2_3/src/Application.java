public class Application {
    public static void main(String[] args) {
        System.out.println(Calculator.suma(new ComplexNumber(2.0, 3.0), new ComplexNumber(4.0, -5.0)));
        System.out.println(Calculator.suma(3.0,4.0));
        System.out.println(Calculator.suma(new ComplexNumber(2.0, 3.0), 3.0));
        System.out.println(Calculator.suma(8.0, new ComplexNumber(2.0, 3.0)));
    }
}
