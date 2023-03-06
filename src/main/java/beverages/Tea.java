package beverages;

import java.util.List;

public class Tea extends Beverage {

    public Tea(double basePrice, List<Supplement> Supplements) {
        this.basePrice = basePrice;
        this.Supplements = Supplements;
    }

    public Tea(double basePrice) {
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
