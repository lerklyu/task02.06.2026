package taxes;

public class SystemDebitMinusCredit extends TaxSystem {

    @Override
    public int calcTaxFor(int debit, int credit) {
        if (debit < credit) {
            return 0;
        }
        return (int) ((debit - credit) * 0.15);
    }
}
