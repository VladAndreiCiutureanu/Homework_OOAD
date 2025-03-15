import java.util.List;
public class Student extends Person {
    int year;
    List<Double> grades;

    public Student(String name, int age, Address address, int year, List<Double> grades) {
        super(name, age, address);
        this.year = year;
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student[ " + name + ", " + age + ", " + address + ", " + year + ", " + grades + "]";
    }
}
