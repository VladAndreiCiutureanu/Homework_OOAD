import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Helper {
    private static List<Integer> readFromFile(){
        List<Integer> list = new ArrayList<Integer>();
        try{

            File file = new File("src/input.txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNext()){
                try{
                    String line = sc.nextLine();
                    list.add(Integer.parseInt(line));
                }
                catch(NumberFormatException e){
                    continue;
                }
            }
            sc.close();
            return list;
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
            return list;
        }
    }
    public static int sum(){
        List<Integer> list = readFromFile();
        return list.stream().reduce(0, (a,b) -> a+b);
    }
}
