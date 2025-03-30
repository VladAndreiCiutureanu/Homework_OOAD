public abstract class BurgerDecorator implements Burger {
    protected Burger decoratedBurger;

    public BurgerDecorator(Burger decoratedBurger) {
        this.decoratedBurger = decoratedBurger;
    }

    @Override
    public String getDescription() {
        return decoratedBurger.toString();
    }

    @Override
    public double getCost() {
        return decoratedBurger.getCost();
    }
}
