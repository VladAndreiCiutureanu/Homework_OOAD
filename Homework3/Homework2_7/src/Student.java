import java.util.Random;

enum State {
    PREZENT,
    ABSENT
}

public class Student implements Observer {
    String name;

    public Student(String name) {
        this.name = name;
    }


    @Override
    public void getStatus() {
        Random random = new Random();
        int randomIndex = random.nextInt(2);
        System.out.println("Student: " + name + " is " + State.values()[randomIndex]);
    }
}
