public class Sfera implements Shape3D{
    protected double raza;

    public Sfera(double raza) {
        this.raza = raza;
    }

    public double getArie() {
        return 4 * Math.PI * raza * raza;
    }

    public double getVolum() {
        return 4 * Math.PI * raza * raza * raza / 3;
    }

    public double getPerimetru() {
        return 2 * Math.PI * raza;
    }
}
