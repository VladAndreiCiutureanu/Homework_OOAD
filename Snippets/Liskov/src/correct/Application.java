package correct;

public class Application {
    public static void main(String[] args) {
        Bird bird = new Penguin();
        bird.walk();
        // bird.fly(); nu se poate apela metoda fly

        FlyingBird fbird = new Parrot();
        fbird.walk();
        fbird.fly();
    }
}
