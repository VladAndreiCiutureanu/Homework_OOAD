public class Calculator {
    public static ComplexNumber suma(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.getReal() + b.getReal(),a.getImag()+ b.getImag());
    }

    public static ComplexNumber suma(Double a, Double b) {
        DoubleToComplex temp1 = new DoubleToComplex(a);
        DoubleToComplex temp2 = new DoubleToComplex(b);
        return suma(temp1.getComplex(), temp2.getComplex());
    }

    public static ComplexNumber suma(ComplexNumber a, Double b) {
        ComplexToDouble temp1 = new ComplexToDouble(a);
        return suma(temp1.getDouble(), b);
    }

    public static ComplexNumber suma(Double a, ComplexNumber b) {
        ComplexToDouble temp1 = new ComplexToDouble(b);
        return suma(a, temp1.getDouble());
    }
}
