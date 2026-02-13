package com.example.listcity;

import java.util.Objects;

/**
 * Represents a City with a name and a province.
 */
public class City implements Comparable<City> {
    private String city;
    private String province;

    /**
     * Creates a City object.
     * @param city City name
     * @param province Province name
     */
    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * @return the city name
     */
    String getCityName() {
        return this.city;
    }

    /**
     * @return the province name
     */
    String getProvinceName() {
        return this.province;
    }

    /**
     * Compares cities alphabetically by city name.
     */
    @Override
    public int compareTo(City o) {
        return this.city.compareTo(o.getCityName());
    }

    /**
     * Two City objects are equal if they have the same city and province.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City other = (City) o;
        return Objects.equals(city, other.city) && Objects.equals(province, other.province);
    }

    /**
     * Hash code consistent with equals().
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}
