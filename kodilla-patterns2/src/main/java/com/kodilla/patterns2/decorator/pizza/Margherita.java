package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class Margherita implements PizzaOrder {
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15.00);
    }
    @Override
    public String getIngredients() {
        return "Pizza with cheese and tomato sauce";
    }
}
