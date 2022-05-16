package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {

    private final List<Continent> continents = new ArrayList<>();

    public boolean addContinent(Continent continent) {
        return continents.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQuantityOnTheWorld = continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum,country) -> sum.add(country));
        return peopleQuantityOnTheWorld;
    }
}