package deals;

public class Expenditure extends Deal {

    private String nameProduct;
    private int priceProduct;

    public Expenditure(String nameProduct, int priceProduct) {
        super("Покупка " + nameProduct + " на " + priceProduct, 0, priceProduct);
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }
}
