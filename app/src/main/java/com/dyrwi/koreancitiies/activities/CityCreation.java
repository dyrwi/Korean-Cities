package com.dyrwi.koreancitiies.activities;

import com.dyrwi.koreancitiies.R;
import com.dyrwi.koreancitiies.classes.City;
import com.dyrwi.koreancitiies.classes.Photo;

import java.util.ArrayList;

/**
 * Created by Ben on 10-Sep-15.
 */
public class CityCreation {

    public static ArrayList<City> generate() {
        ArrayList<City> cities = new ArrayList<City>();
        City seoul = new City();
        seoul.setName("Seoul");
        seoul.setPopulation("25,620,000");
        seoul.setHistory("History");
        seoul.setTouristAttractions("Tourist Attractions");
        seoul.setBriefDescription("Seoul is the capital and largest metropolis of South Korea, the world's second largest metropolitan area it is home to over half of all South Koreans");
        cities.add(seoul);
        return cities;
    }
}
