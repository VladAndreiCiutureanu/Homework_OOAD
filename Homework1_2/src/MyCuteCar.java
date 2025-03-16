public class MyCuteCar extends Car{

    String rocketEngine;

    public MyCuteCar(String engine, double speed, String rocketEngine) {
        super(engine, speed);
        this.rocketEngine = rocketEngine;
    }

    protected void startRocketEngine() {
        System.out.println("Rocket engine " + rocketEngine + " started");
    }

    protected void stopRocketEngine() {
        System.out.println("Rocket engine " + rocketEngine + " stopped");
    }

    public void start(){
        startEngine();
        startRocketEngine();
        System.out.println("Car is moving");
    }

    public void stop(){
        System.out.println("Car stopped");
        stopRocketEngine();
        stopEngine();
    }


}
