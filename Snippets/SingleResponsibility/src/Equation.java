public class Equation {
    private Coefficients coefficients;
    public Equation(Coefficients coefficients){
        this.coefficients = coefficients;
    }
    public Solution solve(){
        double a = coefficients.getA();
        double b = coefficients.getB();
        if(a==0){
            System.out.println("a cannot be zero");
            return null;
        }
        else{
            return new Solution(-b/a);
        }
    }
}
