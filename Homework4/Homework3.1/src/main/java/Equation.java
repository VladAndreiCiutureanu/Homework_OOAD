public class Equation {
    private Coefficients coefficients;
    public Equation(Coefficients coefficients){
        this.coefficients = coefficients;
    }
    public Solution solve(){
        if(coefficients.getA()==0){
            return new Solution();
        }
        else{
            return new Solution(-coefficients.getB()/coefficients.getA());
        }
    }
}
