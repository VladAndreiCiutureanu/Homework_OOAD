import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Utility {
    public static int doubleValue(int value){
        return value * 2;
    }
    public static int readFromFile(String filename) {
        try{
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            return Integer.parseInt(line);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Implicit value for x is 1");
            return 1;
        }
    }
    public static void solve(String filename) {
        System.out.println("The double of x is: " + doubleValue(readFromFile(filename)));
    }
}
