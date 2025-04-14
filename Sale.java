package deals;

public class Sale extends Deal {
    private String nameProduct;
    private int priceProduct;

    public Sale(String nameProduct, int priceProduct) {
        super("Продажа " + nameProduct + " на " + priceProduct, priceProduct, 0);
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }
}
