import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(3,2,1,4));
        int sum = list.stream().reduce(0, (a, b) -> a + b);
        int product = list.stream().reduce(1, (a,b)->a*b);
        System.out.println(sum);
        System.out.println(product);
    }
}
