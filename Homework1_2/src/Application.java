public class Application {
    public static void main(String[] args) {
        MyCuteCar car = new MyCuteCar("Renault", 100, "Rocket");
        car.start();
        car.accelerate();
        car.stop();
    }
}
