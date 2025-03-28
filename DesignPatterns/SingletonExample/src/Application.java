public class Application {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton.getValue());
        System.out.println(singleton2.getValue());
    }
}
