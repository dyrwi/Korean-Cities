package com.dyrwi.koreancitiies.new_activities;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dyrwi.koreancitiies.R;

/**
 * Created by Ben on 14-Sep-15.
 */
public class NewCityInfoFragInfo extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceStatus) {
        View v = inflater.inflate(R.layout.city_info_frag_info, container, false);
        return v;
    }
}
