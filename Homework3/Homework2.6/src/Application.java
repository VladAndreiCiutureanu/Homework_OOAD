public class Application {
    public static void main(String[] args) {
        Product product = new Product(1, "Produs 1", 2);
        Produs produs = new Produs(2, "Produs 2", 3);
        System.out.println(Helper.ProductToProdus(product));
        System.out.println(Helper.ProdusToProduct(produs));
    }
}
