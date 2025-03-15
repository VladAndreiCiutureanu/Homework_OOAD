import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Teacher> teachers = new ArrayList<>();

        Course course = new Course(teachers, students);
        course.addStudent(new Student("Ion Ionescu", 20, new Address("Bd Oltenia", 2, "Craiova", "Dolj"),2, new ArrayList<>()));
        course.addStudent(new Student("Andrei Popescu", 21, new Address("Bd Tineretului", 6, "Vaslui", "Vaslui"),3, new ArrayList<>()));

        course.addTeacher(new Teacher("Alexandru Dobre", 42, new Address("Bd Decebal", 5, "Craiova", "Dolj"), "Scoala nr.31", "Matematica"));
        System.out.println(course);

        System.out.println(course.addTeacher(teachers.get(0)));
        System.out.println(course.addStudent(students.get(1)));

        System.out.println(course.removeStudent(students.get(1)));
        System.out.println(course.removeTeacher(teachers.get(0)));



    }
}
