public class AparatDeCafea implements Observer {
    @Override
    public void update(State state) {
        System.out.println("Aparatul de cafea este " + state);
    }
}
