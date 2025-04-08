public class Application {
    public static void main(String[] args) {
        Curs curs = new Curs("Matematica");
        curs.registerObserver(new Student("Alex"));
        curs.registerObserver(new Student("Ion"));
        curs.registerObserver(new Student("Vasile"));
        curs.registerObserver(new Student("Victor"));
        curs.registerObserver(new Student("Bogdan"));
        curs.prezenta();
    }
}
