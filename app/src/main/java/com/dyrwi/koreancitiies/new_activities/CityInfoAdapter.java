package com.dyrwi.koreancitiies.new_activities;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Ben on 14-Sep-15.
 */
public class CityInfoAdapter extends FragmentStatePagerAdapter {
    Context context;

    public CityInfoAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return (NewCityInformationFragment.newInstance(NewCityLab.get(context).getCities().get(position).getId()));
    }

    @Override
    public int getCount() {
        return NewCityLab.get(context).getCities().size();
    }
}
