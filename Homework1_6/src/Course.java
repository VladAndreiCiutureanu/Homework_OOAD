import java.util.ArrayList;
import java.util.List;
public class Course {
    List<Teacher> teachers;
    List<Student> students;

    public Course(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
    }

    public boolean addStudent(Student student) {
        if(students.contains(student)) {
            return false;
        }
        return students.add(student);
    }

    public boolean removeStudent(Student student) {
        if(students.contains(student)) {
            return students.remove(student);
        }
        return false;
    }

    public boolean addTeacher(Teacher teacher) {
        if(teachers.contains(teacher)) {
            return false;
        }
        return teachers.add(teacher);
    }

    public boolean removeTeacher(Teacher teacher) {
        if(teachers.contains(teacher)) {
            return teachers.remove(teacher);
        }
        return false;
    }
}
