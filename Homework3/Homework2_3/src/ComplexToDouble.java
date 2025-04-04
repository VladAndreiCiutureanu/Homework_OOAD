public class ComplexToDouble {
    private ComplexNumber complex;

    public ComplexToDouble(ComplexNumber complex) {
        this.complex = complex;
    }

    public Double getDouble(){
        return Math.sqrt(complex.getReal()*complex.getReal()+complex.getImag()*complex.getImag());
    }

    public ComplexNumber getComplex(){
        return complex;
    }
}
