import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,1,4,3,5,-2,-3,-1,-4,-5);
        System.out.println("Original List: " + list);
        List<Integer> sorted = list.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted List(natural order): " + sorted);
        List<Integer> reverseSorted = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Sorted List(reverse order): " + reverseSorted);
    }

}