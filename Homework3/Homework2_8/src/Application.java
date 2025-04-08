public class Application {
    public static void main(String[] args) {
        Prelungitor p = new Prelungitor();
        p.registerObserver(new AparatDeCafea());
        p.registerObserver(new Frigider());
        p.registerObserver(new Televizor());
        p.setState(State.DECONECTAT);
        p.setState(State.CONECTAT);
    }
}
