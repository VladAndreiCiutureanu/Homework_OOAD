public class DoubleToComplex {
    private Double number;

    public DoubleToComplex(Double number) {
        this.number = number;
    }

    public Double getNumber() {
        return number;
    }

    public ComplexNumber getComplex() {
        return new ComplexNumber(number, 0);
    }
}
