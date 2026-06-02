import deals.Deal;
import taxes.TaxSystem;

public class Company {

    private String title;
    private int debit;
    private int credit;
    private TaxSystem taxSystem;

    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.debit = 0;
        this.credit = 0;
        this.taxSystem = taxSystem;
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        }
        if (amount < 0) {
            credit += Math.abs(amount);
        }
        if (amount == 0) {
        }
    }

    public void payTaxes() {
        System.out.printf("Компания %s уплатила налог в размере: %d руб.\n",
                title, taxSystem.calcTaxFor(debit, credit));
        debit = 0;
        credit = 0;
    }

    public int applyDeals(Deal[] deals) {
        for (Deal deal : deals) {
            credit += deal.creditChange;
            debit += deal.debitChange;
        }
        return debit - credit;
    }
}


