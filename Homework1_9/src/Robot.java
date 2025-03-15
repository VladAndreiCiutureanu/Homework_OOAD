public class Robot implements Computer, Mechanism{

    @Override
    public void boot() {
        System.out.println(getClass().getSimpleName() + " is booting up...");
    }

    @Override
    public void turnOn() {
        System.out.println(getClass().getSimpleName() + " is turning on...");
    }

    @Override
    public void turnOff() {
        System.out.println(getClass().getSimpleName() + " is turning off...");

    }

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " is moving...");
    }
}
