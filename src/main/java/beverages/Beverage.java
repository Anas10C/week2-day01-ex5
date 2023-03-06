package beverages;


import java.util.List;

public abstract class Beverage {
    protected double basePrice;
    protected List<Supplement> Supplements;

    public abstract double price();

}
