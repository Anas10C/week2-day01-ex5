package unit_tests;

import beverages.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class BeveragesPricingTest {
    @Test
    public void computes_coffee_price() {
        List<Supplement> supplements = new ArrayList<>();
        Beverage coffee = new Coffee(1.20, supplements);
        assertThat(coffee.price(), is(closeTo(1.20, 0.001)));
    }

    @Test
    public void computes_tea_price() {
        List<Supplement> supplements = new ArrayList<>();
        Beverage tea = new Tea(1.50, supplements);
        assertThat(tea.price(), is(closeTo(1.50, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_price() {
        List<Supplement> supplements = new ArrayList<>();
        Beverage hotChocolate = new HotChocolate(1.45, supplements);
        assertThat(hotChocolate.price(), is(closeTo(1.45, 0.001)));
    }

    @Test
    public void computes_tea_with_milk_price() {
        List<Supplement> supplements = new ArrayList<>();
        supplements.add(new Milk());
        Beverage tea = new Tea(1.50, supplements);
        assertThat(tea.price(), is(closeTo(1.60, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_price() {
        List<Supplement> supplements = new ArrayList<>();
        supplements.add(new Milk());
        Beverage coffee = new Coffee(1.20, supplements);
        assertThat(coffee.price(), is(closeTo(1.30, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_and_cream_price() {
        List<Supplement> supplements = new ArrayList<>();
        supplements.add(new Milk());
        supplements.add(new Cream());
        Beverage coffee = new Coffee(1.20, supplements);
        assertThat(coffee.price(), is(closeTo(1.45, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_with_cream_price() {
        List<Supplement> supplements = new ArrayList<>();
        supplements.add(new Cream());
        Beverage hotChocolateWithCream = new HotChocolate(1.45, supplements);
        assertThat(hotChocolateWithCream.price(),  is(closeTo(1.60, 0.001)));
    }
}
