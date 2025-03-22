import java.util.List;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {
        List<Student> students = List.of(new Student("John", 4), new Student("Alice", 9.9), new Student("Bob", 7.1), new Student("Mary", 5.9));
        List<Student> sortedStudents = students.stream().sorted(new StudentComparator()).collect(Collectors.toList());
        System.out.println(sortedStudents);
    }
}
