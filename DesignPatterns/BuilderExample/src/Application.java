public class Application {
    public static void main(String[] args) {
        Car car1 = new Car.CarBuilder("Renault","Zoe").setAutoPilot(false).setHeatedSeats(false).build();
        System.out.println(car1);

        Car car2 = new Car.CarBuilder("Mercedes", "E-Class").setAutoPilot(true).setHeatedSeats(true).build();
        System.out.println(car2);
    }
}
