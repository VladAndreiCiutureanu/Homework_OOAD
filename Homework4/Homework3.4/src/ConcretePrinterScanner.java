public class ConcretePrinterScanner implements Printer, Scanner{
    @Override
    public void print() {
        System.out.println("ConcretePrinterScanner printing");
    }
    @Override
    public void scan() {
        System.out.println("ConcretePrinterScanner scanning");
    }
}
