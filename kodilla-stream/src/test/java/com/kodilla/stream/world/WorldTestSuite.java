package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();

        Continent europa = new Continent("Europa");
        Continent asia = new Continent("Azja");
        Continent australia = new Continent("Australia");

        Country poland = new Country("Polska");
        Country germany = new Country("Niemcy");
        Country croatia = new Country("Chorwacja");
        Country japan = new Country("Japonia");
        Country qatar = new Country("Katar");
        Country vietnam = new Country("Wietnam");
        Country australiaCountry = new Country("Australia");
        Country fiji = new Country("Fiji");
        Country ukraine = new Country("Ukraina");

        world.addContinent(europa);
        world.addContinent(asia);
        world.addContinent(australia);

        europa.addCountry(poland);
        europa.addCountry(germany);
        europa.addCountry(croatia);
        europa.addCountry(ukraine);

        asia.addCountry(japan);
        asia.addCountry(qatar);
        asia.addCountry(vietnam);

        australia.addCountry(australiaCountry);
        australia.addCountry(fiji);

        //When
        BigDecimal totalPeople = world.getPeopleQuantity();

        //Then
        BigDecimal totalPeopleExpected = new BigDecimal("342004806");
        assertEquals(totalPeopleExpected, totalPeople);
    }
}