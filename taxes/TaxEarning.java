package taxes;

public class TaxEarning extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        return debit >= 1000 ? debit * 6 / 100 : 0;
    }
}
