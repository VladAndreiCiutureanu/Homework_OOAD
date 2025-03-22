import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = list.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(squares);


        Set<String> names = Set.of("Alice", "Bob", "Charlie", "Dave", "Brandon");
        Set<String> namesWithB = names.stream().filter(x -> x.startsWith("B")).collect(Collectors.toSet());
        System.out.println(namesWithB);
        System.out.println(names);


        List<Integer> numbers = Arrays.asList(2,4,1,10, 78, 6 , 923, 34, 45, 56, 67, 78, 89, 90);
        List<Integer> sortedNumbers = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedNumbers);

    }
}