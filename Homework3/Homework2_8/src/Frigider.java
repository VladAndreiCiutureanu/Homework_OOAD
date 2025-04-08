public class Frigider implements Observer {

    @Override
    public void update(State state) {
        System.out.println("Frigiderul este " + state);
    }
}
