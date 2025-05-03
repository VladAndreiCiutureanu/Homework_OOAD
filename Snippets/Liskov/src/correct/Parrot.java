package correct;

public class Parrot implements FlyingBird {
    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }

    @Override
    public void walk() {
        System.out.println("Parrot is walking");
    }
}
