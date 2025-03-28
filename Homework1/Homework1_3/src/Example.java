public class Example {
    protected int x;
    protected double y;
    protected String s;

    public Example(int x, double y, String s)
    {
        this.x = x;
        this.y = y;
        this.s = s;
    }

    @Override
    public String toString() {
        return "Example [x=" + x + ", y=" + y + ", s=" + s + "]";
    }
}
