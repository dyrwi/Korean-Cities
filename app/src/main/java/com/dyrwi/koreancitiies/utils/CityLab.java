package com.dyrwi.koreancitiies.utils;

import android.content.Context;
import android.util.Log;
import com.dyrwi.koreancitiies.classes.City;
import com.dyrwi.koreancitiies.json.JSONSerializer;
import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by Ben on 10-Sep-15.
 */
public class CityLab {
    private static final String TAG = "CityLab";
    private static final String FILENAME = "cities.json";

    private ArrayList<City> mCities;
    private JSONSerializer mSerializer;

    private static CityLab sCityLab;
    private Context mAppContext;

    private CityLab(Context appContext) {
        mAppContext = appContext;
        mSerializer = new JSONSerializer(mAppContext, FILENAME);

        try {
            mCities = mSerializer.loadCities();
        } catch (Exception e) {
            mCities = new ArrayList<City>();
            Log.e(TAG, "Error loading cities: ", e);
        }
    }

    public static CityLab get(Context c) {
        if (sCityLab == null) {
            sCityLab = new CityLab(c.getApplicationContext());
        }
        return sCityLab;
    }

    public City get(UUID id) {
        for (City c : mCities) {
            if (c.getId().equals(id))
                return c;
        }
        return null;
    }

    public void add(City c) {
        mCities.add(c);
        saveAll();
    }

    public void addAll(ArrayList<City> c) {
        for(City city: c) {
            add(city);
        }
    }

    private void clearAll() {
        for(City c: mCities) {
            delete(c);
        }
    }

    public void addAllNew(ArrayList<City> cities) {
        clearAll();
        addAll(cities);
    }

    public ArrayList<City> getCities() {
        return mCities;
    }

    public void delete(City c) {
        mCities.remove(c);
        saveAll();
    }

    public boolean saveAll() {
        try {
            mSerializer.saveCities(mCities);
            Log.d(TAG, "cities saved to file");
            return true;
        } catch (Exception e) {
            Log.e(TAG, "Error saving cities: " + e);
            return false;
        }
    }
}
