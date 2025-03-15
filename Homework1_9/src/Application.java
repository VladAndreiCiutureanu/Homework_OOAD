public class Application {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.boot();
        robot.turnOn();
        robot.move();
        robot.turnOff();
    }
}
