public class Application {
    public static void main(String[] args) {
        Config config = Config.getInstance();
        System.out.println(config.getColor());
        System.out.println(config.getWeight());

        Config config1 = Config.getInstance();
        System.out.println(config1.getColor());
        System.out.println(config1.getWeight());
    }
}
