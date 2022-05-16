package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final List<Country> countries = new ArrayList<>();
    private final String name;

    public Continent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Country> getCountries() {
        return new ArrayList<>(countries);
    }

    public boolean addCountry (Country country) {
        return countries.add(country);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Continent continent = (Continent) o;

        if (!countries.equals(continent.countries)) return false;
        return name.equals(continent.name);
    }

    @Override
    public int hashCode() {
        int result = countries.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "countries=" + countries +
                ", name='" + name + '\'' +
                '}';
    }
}