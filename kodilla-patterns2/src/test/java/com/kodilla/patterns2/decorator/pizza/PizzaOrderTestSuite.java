package com.kodilla.patterns2.decorator.pizza;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

public class PizzaOrderTestSuite {
    @Test
    public void testPizzaMargheritaOrderGetCost() {
        //Given
        PizzaOrder thePizza = new Margherita();
        //When
        BigDecimal theCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(15.00), theCost);
    }
    @Test
    public void testPizzaMargheritaOrderGetIngredients() {
        //Given
        PizzaOrder thePizza = new Margherita();
        //When
        String ingredients = thePizza.getIngredients();
        //Then
        assertEquals("Pizza with cheese and tomato sauce", ingredients);
    }
    @Test
    public void testPizzaWithHamMushroomExtraCheeseGetCost() {
        //Given
        PizzaOrder thePizza = new Margherita();
        thePizza = new HamDecorator(thePizza);
        thePizza = new MushroomDecorator(thePizza);
        thePizza = new ExtraCheeseDecorator(thePizza);
        //When
        BigDecimal theCost = thePizza.getCost();
        //Then
        assertEquals(new BigDecimal(25.00), theCost);
    }
    @Test
    public void testPizzaWithHamMushroomExtraCheeseGetIngredients() {
        //Given
        PizzaOrder thePizza = new Margherita();
        thePizza = new HamDecorator(thePizza);
        thePizza = new MushroomDecorator(thePizza);
        thePizza = new ExtraCheeseDecorator(thePizza);
        //When
        String ingredients = thePizza.getIngredients();
        //Then
        assertEquals("Pizza with cheese and tomato sauce + ham + mushrooms + extra cheese", ingredients);
    }

}