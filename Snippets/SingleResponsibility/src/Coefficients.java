import java.util.Scanner;

public class Coefficients {
    private double a;
    private double b;

    public void readFromKeyboard(){
        Scanner in = new Scanner(System.in);
        System.out.println("Equation: ax + b = 0");
        while(true){
            try{
                System.out.print("a = ");
                String line = in.nextLine();
                a = Double.parseDouble(line);
                break;
            }
            catch(Exception e){
                System.out.println("Invalid input, try again");
            }
        }
        while(true){
            try{
                System.out.print("b = ");
                String line = in.nextLine();
                b = Double.parseDouble(line);
                break;
            }
            catch(Exception e){
                System.out.println("Invalid input, try again");
            }
        }
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
