public class Car {
    protected String engine;
    protected double speed;

    public Car(String engine, double speed) {
        this.engine = engine;
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    protected void startEngine() {
        System.out.println("Engine " + engine + " started");
    }

    protected void stopEngine() {
        System.out.println("Engine " + engine + " stopped");
    }

    public void start(){
        startEngine();
        System.out.println("Car is moving");
    }

    public void accelerate(){
        System.out.println("Car is accelerating");
    }

    public void stop(){
        System.out.println("Car stopped");
        stopEngine();
    }
}
