public class Cub implements Shape3D{
    protected double latura;

    public Cub(double latura) {
        this.latura = latura;
    }

    public double getArie() {
        return 6 * latura * latura;
    }

    public double getVolum() {
        return latura * latura * latura;
    }

    public double getPerimetru() {
        return 12 * latura;
    }
}
