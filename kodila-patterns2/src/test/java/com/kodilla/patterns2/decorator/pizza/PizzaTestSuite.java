package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaTestSuite {

    @Test
    public void testPizzaWithBaconPineappleExtraCheeseAndExtraSizeGetCost() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new MeatDecorator(pizza, MeatComponent.BACON);
        pizza = new VegetablesAndFruitsDecorator(pizza, VegetablesAndFruitsComponent.PINEAPPLE);
        pizza = new ExtraCheeseDecorator(pizza);
        pizza = new ExtraSizeDecorator(pizza);
        System.out.println(pizza.getCost());
        //When
        BigDecimal cost = pizza.getCost();
        //Then
        assertEquals(new BigDecimal(29), cost);
    }

    @Test
    public void testPizzaWithBaconPineappleExtraCheeseAndExtraSizeGetDescription() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new MeatDecorator(pizza, MeatComponent.BACON);
        pizza = new VegetablesAndFruitsDecorator(pizza, VegetablesAndFruitsComponent.PINEAPPLE);
        pizza = new ExtraCheeseDecorator(pizza);
        pizza = new ExtraSizeDecorator(pizza);
        System.out.println(pizza.getDescription());
        //When
        String description = pizza.getDescription();
        //Then
        assertEquals("Pizza with cheese and tomato sauce + BACON + PINEAPPLE + extra cheese Extra Size", description);
    }

    @Test
    public void testPizzaWithHamChickenExtraCheeseSizeGetCost() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new MeatDecorator(pizza, MeatComponent.HAM);
        pizza = new MeatDecorator(pizza, MeatComponent.CHICKEN);
        pizza = new ExtraCheeseDecorator(pizza);
        System.out.println(pizza.getCost());
        //When
        BigDecimal cost = pizza.getCost();
        //Then
        assertEquals(new BigDecimal(25), cost);
    }

    @Test
    public void testPizzaWithHamChickenExtraCheeseSizeGetDescription() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new MeatDecorator(pizza, MeatComponent.HAM);
        pizza = new MeatDecorator(pizza, MeatComponent.CHICKEN);
        pizza = new ExtraCheeseDecorator(pizza);
        System.out.println(pizza.getDescription());
        //When
        String description = pizza.getDescription();
        //Then
        assertEquals("Pizza with cheese and tomato sauce + HAM + CHICKEN + extra cheese", description);
    }

    @Test
    public void testPizzaWithDoubleExtraCheeseSizeGetCost() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new ExtraCheeseDecorator(pizza);
        pizza = new ExtraCheeseDecorator(pizza);
        System.out.println(pizza.getCost());
        //When
        BigDecimal cost = pizza.getCost();
        //Then
        assertEquals(new BigDecimal(19), cost);
    }

    @Test
    public void testPizzaWithDoubleExtraCheeseSizeGetDescription() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new ExtraCheeseDecorator(pizza);
        pizza = new ExtraCheeseDecorator(pizza);
        System.out.println(pizza.getDescription());
        //When
        String description = pizza.getDescription();
        //Then
        assertEquals("Pizza with cheese and tomato sauce + extra cheese + extra cheese", description);
    }
}