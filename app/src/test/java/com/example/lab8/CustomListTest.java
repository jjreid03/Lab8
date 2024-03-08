package com.example.lab8;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    @BeforeEach
    public void setUp(){
        list = new CustomList(null, new ArrayList<>());
    }

    @Test
    public void hasCityShouldReturnTrueIfCityExists() {
        City city = new City("Estevan", "SK");
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

    @Test
    public void hasCityShouldReturnFalseIfCityDoesNotExist() {
        City city = new City("Estevan", "SK");
        assertFalse(list.hasCity(city));
    }

    @Test
    public void deleteCityShouldRemoveCityIfExists() {
        City city = new City("Estevan", "SK");
        list.addCity(city);
        assertTrue(list.hasCity(city));
        list.deleteCity(city);
        assertFalse(list.hasCity(city));
    }

    @Test
    public void countCitiesShouldReturnNumberOfCitiesInList() {
        assertEquals(0, list.countCities());
        list.addCity(new City("Estevan", "SK"));
        assertEquals(1, list.countCities());
        list.addCity(new City("Regina", "SK"));
        assertEquals(2, list.countCities());
    }

    /**
     * this gets size of the list
     * @Return
     */
    public int getCount(){
        return cities.size();
    }

    /**
     * this adds a city object to the list
     * for the first phase it will be empty
     * @param city
     */
    public void addCity(City city) {
        cities.add(city);
    }

    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */

    public CustomList MockCityList(){
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus one
     */

    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), listSize + 1);
    }
}
