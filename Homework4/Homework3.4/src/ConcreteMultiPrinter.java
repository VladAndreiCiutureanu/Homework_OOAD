public class ConcreteMultiPrinter implements MultifunctionalPrinter{

    @Override
    public void fax() {
        System.out.println("ConcreteMultiPrinter faxing");
    }

    @Override
    public void print() {
        System.out.println("ConcreteMultiPrinter printing");
    }

    @Override
    public void scan() {
        System.out.println("ConcreteMultiPrinter scanning");
    }
}
