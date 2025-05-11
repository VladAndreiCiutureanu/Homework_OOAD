public class Application {
    public static void main(String[] args) {
        MultifunctionalPrinter printer = new ConcreteMultiPrinter();
        printer.print();
        printer.scan();
        printer.fax();
        System.out.println("--------------------------------");
        Printer concretePrinter = new ConcretePrinter();
        concretePrinter.print();
        System.out.println("--------------------------------");
        ConcretePrinterScanner concretePrinterScanner = new ConcretePrinterScanner();
        concretePrinterScanner.print();
        concretePrinterScanner.scan();
        System.out.println("--------------------------------");
    }
}
