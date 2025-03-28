import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("John", 20));
        students.add(new Student("Jane", 21));
        students.add(new Student("Adam", 19));
        students.add(new Student("Tom", 22));
        students.add(new Student("Jerry", 23));
        System.out.println(StudentHelper.maxAge1(students));
        System.out.println(StudentHelper.maxAge2(students));
    }
}
