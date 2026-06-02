import deals.Deal;
import deals.Expenditure;
import deals.Sale;
import taxes.SystemDebit;
import taxes.SystemDebitMinusCredit;
import taxes.TaxSystem;

public class Main {
    public static void main(String[] args) {

        Company company = new Company("Apple", new TaxSystem());
        company.setTaxSystem(new SystemDebitMinusCredit());
//        company.shiftMoney(1000);
//        company.shiftMoney(-1000);
//        company.shiftMoney(-10);
        Deal deal1 = new Sale("\"Наушники\"", 1000);
        Deal deal2 = new Expenditure("\"ЧипE43ASD\"", 500);
        Deal deal3 = new Sale("\"Телефон\"", 1000);
        Deal deal4 = new Expenditure("\"Провода\"", 100);
        company.applyDeals(new Deal[]{deal1, deal2, deal3, deal4});
        company.payTaxes();
    }
}
