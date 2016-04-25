package com.dyrwi.koreancitiies.new_activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import java.util.UUID;

/**
 * Created by Ben on 11-Sep-15.
 */
public class NewCityInformationActivity extends NewSingleFragmentActivity {
    @Override
    public void onCreate(Bundle savedInstanceStatus) {
        super.onCreate(savedInstanceStatus);
        if (getSupportActionBar() != null)
            getSupportActionBar().hide();
    }

    @Override
    protected Fragment createFragment() {
        UUID cityID = (UUID) getIntent().getSerializableExtra(NewCityInformationFragment.NEWCITY_ID);
        return NewCityInformationFragment.newInstance(cityID);
    }

    @Override
    protected void search(String s) {

    }
}
