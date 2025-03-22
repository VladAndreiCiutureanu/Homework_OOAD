public class Equation {
    private double a;
    private double b;
    private double c;

    public Equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public Solution solution() {
        try{
            validate();
            double delta = b * b - 4 * a * c;
            double sol1 = (-b + Math.sqrt(delta)) / (2 * a);
            double sol2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new Solution(sol1, sol2);
        }
        catch(NegativeDelta e) {
            System.out.println(e.getMessage());
            return null;
        }
        catch(ArithmeticException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    private void validate() throws NegativeDelta, ArithmeticException {
        if(a==0) {
            throw new ArithmeticException("a cannot be 0");
        }
        if(b * b - 4 * a * c < 0) {
            throw new NegativeDelta();
        }
    }

    @Override
    public String toString() {
        return a + "x^2 + " + b + "x + " + c + " = 0";
    }


}
