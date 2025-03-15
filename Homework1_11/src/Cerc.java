public class Cerc implements Shape2D{
    protected double raza;

    public Cerc(double raza) {
        this.raza = raza;
    }

    public double getArie() {
        return Math.PI * raza * raza;
    }

    public double getPerimetru() {
        return 2 * Math.PI * raza;
    }
}
