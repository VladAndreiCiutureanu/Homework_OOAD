public class Application {
    public static void main(String[] args) {
        C c = new C();
        c.readX();
        c.readY();
        c.readS();
        c.displayXYS();

        B b = new B();
        b.readS();
        b.displayX();

        A a = new A(5);
        a.displayX();
    }
}
