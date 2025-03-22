import java.util.*;

public class StudentHelper {
    public static Student maxAge1(List<Student> students) {
        return students.stream().max(new StudentComparator()).get();
    }

    public static Student maxAge2(List<Student> students) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        for (Student student : students) {
            studentMap.put(student.getAge(), student.getName());
        }
        int maxAge = Collections.max(studentMap.keySet());
        return new Student(studentMap.get(maxAge), maxAge);
    }
}
