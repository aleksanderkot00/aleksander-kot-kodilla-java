package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class MeatDecorator extends AbstractPizzaDecorator {
    private final MeatComponent meatComponent;

    public MeatDecorator(Pizza pizza, MeatComponent meatComponent) {
        super(pizza);
        this.meatComponent = meatComponent;
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + " + meatComponent.name();
    }
}
