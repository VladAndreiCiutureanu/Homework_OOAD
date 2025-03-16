public class Equation {
    public static void solveEquation(double a, double b) throws DivideByZero {
        try{
            validate(a,b);
            System.out.println("The equation has been solved");
            System.out.println("Solution: " + (b/a));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void validate(double a, double b) throws DivideByZero {
        if(a == 0) {
            throw new DivideByZero();
        }
    }
}
