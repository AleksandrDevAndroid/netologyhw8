import deals.Deal;
import deals.Expenditure;
import deals.Sale;
import taxes.TaxEarning;
import taxes.TaxEarningsMinusSpendings;
import taxes.TaxSystem;

public class Main {
    public static void main(String[] args) {
        TaxSystem taxEarningsMinusSpendings = new TaxEarningsMinusSpendings();
        TaxSystem taxEarning = new TaxEarning();

        Company company1 = new Company("TechCube", taxEarningsMinusSpendings);

        company1.setTaxSystem(taxEarning);


        company1.shiftMoney(100000);
        company1.shiftMoney(-10000);

        company1.payTaxes();

        Deal[] deals = new Deal[3];
        deals[0] = new Sale("Ноутбук", 50000);
        deals[1] = new Sale("Телефон", 50000);
        deals[2] = new Expenditure("Реклама", 10000);

        System.out.println(company1.applyDeals(deals));
    }
}

