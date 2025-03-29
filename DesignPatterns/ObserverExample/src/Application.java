public class Application {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat();

        Observer phone = new PhoneDisplay();
        Observer TV = new TVDisplay();

        thermostat.addObserver(phone);
        thermostat.addObserver(TV);

        thermostat.setValue(10);
        thermostat.setValue(30);
    }
}
