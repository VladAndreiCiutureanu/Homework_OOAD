public class LettuceDecorator extends BurgerDecorator {
    private static double cost = 0.5;
    public LettuceDecorator(Burger decoratedBurger) {
        super(decoratedBurger);
    }

    @Override
    public String getDescription() {
        return decoratedBurger.getDescription() + ", Lettuce";
    }

    @Override
    public double getCost() {
        return decoratedBurger.getCost() + cost;
    }
}
