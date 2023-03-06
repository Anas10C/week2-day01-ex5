package beverages;

import java.util.List;

public class Coffee extends Beverage {
    public Coffee(double basePrice, List<Supplement> Supplements) {
        this.basePrice = basePrice;
        this.Supplements = Supplements;
    }

    public Coffee(double basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public double price() {
        double totalPrice = this.basePrice;

        for(Supplement s: Supplements) {
            totalPrice += s.price();
        }

        return totalPrice;
    }
}
