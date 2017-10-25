package com.kodilla.stream.world;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = testWorld();
        //When

        //Then
        Assert.assertEquals(world.getPeopleQuantity(), new BigDecimal("660000000"));
    }

    private static void buildTestEurope(World world) {
        Continent europe = new Continent("Europe");
        europe.addCountry(new Country("Poland", new BigDecimal("10000000")));
        europe.addCountry(new Country("Germany", new BigDecimal("20000000")));
        europe.addCountry(new Country("France", new BigDecimal("30000000")));

        world.addContinent(europe);
    }

    private static void buildTestAfrica(World world) {
        Continent africa = new Continent("Africa");
        africa.addCountry(new Country("Egypt", new BigDecimal("100000000")));
        africa.addCountry(new Country("Kenya", new BigDecimal("200000000")));
        africa.addCountry(new Country("Congo", new BigDecimal("300000000")));

        world.addContinent(africa);
    }

    private static World testWorld() {
        World world = new World();
        buildTestEurope(world);
        buildTestAfrica(world);
        return world;
    }
}