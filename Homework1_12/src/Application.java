import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //First example
        Scanner sc = new Scanner(System.in);
        while(true){
            try{
                System.out.print("Enter a number: ");
                int x = sc.nextInt();
                System.out.println("10 / " + x + " = " + divide1(x));
                break;
            }
            catch(ArithmeticException e){
                System.out.println(e.getMessage());
            }
        }
        //Second example
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        while(true){
            if(divide2(x) == 0){
                System.out.print("Enter a number: ");
                x = sc.nextInt();
            }
            else{
                System.out.println("10 / " + x + " = " + divide2(x));
                break;
            }
        }

    }
    public static int divide1(int x) throws ArithmeticException {
        if(x == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return 10 / x;
    }
    public static int divide2(int x){
        try{
            return 10 / x;
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
