public class Televizor implements Observer {

    @Override
    public void update(State state) {
        System.out.println("Televizorul este " + state);
    }
}
