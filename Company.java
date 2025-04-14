import deals.Deal;
import taxes.TaxSystem;

public class Company {
    private String title;
    private int credit;
    private int debit;
    TaxSystem taxSystem;

    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        } else credit += Math.abs(amount);
    }

    public void payTaxes() {
        int tax = taxSystem.calcTaxFor(debit, credit);
        System.out.printf("Компания %s уплатила налог в размере: %d руб.\n", title, tax);
        credit = 0;
        debit = 0;
    }

    public int applyDeals(Deal[] deals) {
        for (Deal deal : deals) {
            credit += deal.getCreditChange();
            debit += deal.getDebitChange();
            System.out.println(deal.getComment());
        }
        int balance = debit - credit;
        payTaxes();
        System.out.print("Разница доходов и раcходов ");
        return balance;
    }
}
