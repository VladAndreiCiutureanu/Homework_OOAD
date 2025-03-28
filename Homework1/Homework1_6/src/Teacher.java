public class Teacher extends Person {
    String school;
    String subject;

    public Teacher(String name, int age, Address address, String school, String subject) {
        super(name, age, address);
        this.school = school;
        this.subject = subject;
    }

    @Override
    public String toString() {

        return "Teacher [name=" + name + ", age=" + age + ", address=" + address + ", school=" + school + ", subject=" + subject + "]";

    }
}
