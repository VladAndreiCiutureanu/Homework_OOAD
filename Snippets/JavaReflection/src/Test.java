public class Test {
    private int x;
    public String message;

    public Test(int x, String message) {
        this.x = x;
        this.message = message;
    }

    public void show() {
        System.out.println("x = " + x);
    }
}
