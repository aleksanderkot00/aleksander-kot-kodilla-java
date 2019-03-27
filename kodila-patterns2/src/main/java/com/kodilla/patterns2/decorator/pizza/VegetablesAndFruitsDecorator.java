package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class VegetablesAndFruitsDecorator extends  AbstractPizzaDecorator {
    private final VegetablesAndFruitsComponent component;

    public VegetablesAndFruitsDecorator(Pizza pizza, VegetablesAndFruitsComponent component) {
        super(pizza);
        this.component = component;
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + " + component.name();
    }
}
