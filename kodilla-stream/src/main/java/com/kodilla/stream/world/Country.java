package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final String name;
    private final BigDecimal peopleQuantity;

    public Country(final String name, final BigDecimal peopleQuantity) {
        this.name = name;
        this.peopleQuantity = peopleQuantity;
    }

    public Country(final String name) {
        this(name, new BigDecimal(38000534));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        return name.equals(country.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}