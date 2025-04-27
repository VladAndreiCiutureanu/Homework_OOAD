public class Application {
    public static void main(String[] args) {
        Person p = new Person("Peter");
        p.walk(new Dog());
        p.walk(new Cat());
        p.walk(new Lion());
    }
}
