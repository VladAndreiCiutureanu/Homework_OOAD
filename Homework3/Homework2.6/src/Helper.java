public class Helper {
    private static final double dollarToRon = 4.56;
    private static final double ronToDollar =  0.22;
    public static Produs ProductToProdus(Product p){
        return new Produs(p.getId(), p.getName(), p.getPrice()*dollarToRon);
    }
    public static Product ProdusToProduct(Produs p){
        return new Product(p.getId(), p.getNume(), p.getPret() * ronToDollar);
    }
}
