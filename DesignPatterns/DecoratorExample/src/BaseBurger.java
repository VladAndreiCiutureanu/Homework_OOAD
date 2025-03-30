public class BaseBurger implements Burger {
    private static double cost = 8;
    private static String description = "Base Burger";


    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getCost() {
        return cost;
    }
}
