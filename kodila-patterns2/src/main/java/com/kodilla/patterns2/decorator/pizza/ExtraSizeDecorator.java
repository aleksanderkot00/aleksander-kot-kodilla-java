package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraSizeDecorator extends AbstractPizzaDecorator {
    public ExtraSizeDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(6));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Extra Size";
    }
}
