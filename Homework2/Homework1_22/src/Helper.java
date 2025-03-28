import java.util.Scanner;

public class Helper {
    private static Integer readNumber(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            String number = sc.nextLine();
            return Integer.parseInt(number);
        }
        catch(NumberFormatException e){
            System.out.println("Please enter a number");
            return null;
        }
    }
    public static Integer sum(){
        Integer a = null;
        Integer b = null;
        while(a == null){
            a = readNumber();
        }
        while(b == null){
            b = readNumber();
        }
        return a+b;
    }
}
