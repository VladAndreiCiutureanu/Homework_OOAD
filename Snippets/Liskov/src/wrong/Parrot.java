package wrong;

public class Parrot implements Bird {

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }

    @Override
    public void walk() {
        System.out.println("Parrot is walking");
    }
}
