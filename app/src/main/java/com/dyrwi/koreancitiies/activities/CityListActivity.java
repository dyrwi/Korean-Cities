package com.dyrwi.koreancitiies.activities;

import android.support.v4.app.Fragment;

import com.dyrwi.koreancitiies.classes.City;
import com.dyrwi.koreancitiies.utils.CityLab;

import org.json.JSONException;
import org.json.JSONObject;

public class CityListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        try {
            createCitiesList();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return new CityListFragment();
    }

    private void createCitiesList() throws JSONException {
        CityLab.get(getApplicationContext()).addAll(CityCreation.generate());
    }
}
