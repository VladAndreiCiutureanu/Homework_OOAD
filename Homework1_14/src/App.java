import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public int readNumber() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }
}
