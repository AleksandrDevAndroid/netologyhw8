package taxes;

public class TaxEarningsMinusSpendings extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        return (debit - credit) * 15 / 100 > 0 ? (debit - credit) * 15 / 100 : 0;
    }
}
