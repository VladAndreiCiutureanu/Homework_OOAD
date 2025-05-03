package wrong;

public class Penguin implements Bird {


    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguin cannot fly");
    }

    @Override
    public void walk() {
        System.out.println("Penguin is walking");
    }
}
