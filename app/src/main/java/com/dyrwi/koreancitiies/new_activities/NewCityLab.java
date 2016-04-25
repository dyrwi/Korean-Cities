package com.dyrwi.koreancitiies.new_activities;

import android.content.Context;
import android.util.Log;
import com.dyrwi.koreancitiies.classes.City;
import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by Ben on 10-Sep-15.
 */
public class NewCityLab {
    private static final String TAG = "CityLab";
    private ArrayList<NewCity> cities;

    private static NewCityLab sCityLab;
    private Context appContext;

    private NewCityLab(Context appContext) {
        this.appContext = appContext;
        try {
            cities = NewCityCreation.generate();
        } catch (Exception e) {
            cities = new ArrayList<NewCity>();
            Log.e(TAG, "Error loading cities: ", e);
        }
    }

    public static NewCityLab get(Context c) {
        if (sCityLab == null) {
            sCityLab = new NewCityLab(c.getApplicationContext());
        }
        return sCityLab;
    }

    public NewCity get(UUID id) {
        for (NewCity c : cities) {
            if (c.getId().equals(id))
                return c;
        }
        return null;
    }

    public void add(NewCity c) {
        cities.add(c);
        saveAll();
    }

    public void addAll(ArrayList<NewCity> c) {
        for(NewCity city: c) {
            add(city);
        }
    }

    private void clearAll() {
        for(NewCity c: cities) {
            delete(c);
        }
    }

    public void addAllNew(ArrayList<NewCity> cities) {
        clearAll();
        addAll(cities);
    }

    public ArrayList<NewCity> getCities() {
        return cities;
    }

    public void delete(NewCity c) {
        cities.remove(c);
        saveAll();
    }

    public boolean saveAll() {
        try {
            Log.d(TAG, "saveAll not implemented");
            return true;
        } catch (Exception e) {
            Log.e(TAG, "Error saving cities: " + e);
            return false;
        }
    }
}
