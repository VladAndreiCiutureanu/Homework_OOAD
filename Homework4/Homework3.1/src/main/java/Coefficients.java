import java.util.Scanner;

public class Coefficients {
    private double a;
    private double b;
    public void readFromConsole(){
        Scanner sc = new Scanner(System.in);
        boolean needA = true;
        boolean needB = true;
        while(needA || needB){
            if(needA){
                System.out.print("a = ");
                String input = sc.nextLine();
                try{
                    a = Double.parseDouble(input);
                    needA = false;
                }
                catch(Exception e){
                    System.out.println("Invalid input!");
                }
            }
            if(needB){
                System.out.print("b = ");
                String input = sc.nextLine();
                try{
                    b = Double.parseDouble(input);
                    needB = false;
                }
                catch(Exception e){
                    System.out.println("Invalid input!");
                }
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
