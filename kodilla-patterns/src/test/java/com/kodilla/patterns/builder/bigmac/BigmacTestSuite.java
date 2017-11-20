package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testNewBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("Brioche")
                .burger(2)
                .sauce("BBQ")
                .ingredient("Lettuce")
                .ingredient("Bacon")
                .ingredient("Cheese")
                .build();
        System.out.println(bigmac);
        //When
        int howManyBurgers = bigmac.getBurger();
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(2, howManyBurgers);
        Assert.assertEquals(3, howManyIngredients);
    }
}
