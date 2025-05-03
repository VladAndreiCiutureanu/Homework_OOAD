package wrong;

public class Application {
    public static void main(String[] args) {
        Bird bird = new Penguin();
        bird.walk();
        bird.fly();
    }
}
