package deals;

public class Expenditure extends Deal{

    public Expenditure(String name, int price) {
        super("Покупка " + name +
            " на " + price + " руб., ", price, 0);
        System.out.println(comment);
    }
}
