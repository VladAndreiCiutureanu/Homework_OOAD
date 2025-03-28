public class Patrat implements Shape2D{
    protected double latura;

    public Patrat(double latura) {
        this.latura = latura;
    }

    public double getArie() {
        return latura * latura;
    }

    public double getPerimetru() {
        return 4 * latura;
    }
}
