public class Application {
    public static void main(String[] args) {
        Burger burger = new BaseBurger();
        System.out.println(burger.getDescription() + " $" + burger.getCost());

        Burger burgerWithCheese = new CheeseDecorator(new BaseBurger());
        System.out.println(burgerWithCheese.getDescription() + " $" + burgerWithCheese.getCost());

        Burger burgerWithBaconLettuce = new BaconDecorator(new LettuceDecorator(new BaseBurger()));
        System.out.println(burgerWithBaconLettuce.getDescription() + " $" + burgerWithBaconLettuce.getCost());

        Burger deluxeBurger = new TomatoDecorator(new CheeseDecorator(new LettuceDecorator(new BaseBurger())));
        System.out.println(deluxeBurger.getDescription() + " $" + deluxeBurger.getCost());
    }
}
