package com.dyrwi.koreancitiies.new_activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import com.dyrwi.koreancitiies.R;

/**
 * Created by Ben on 14-Sep-15.
 */
public class PagerActivity extends Activity {
    private ViewPager pager;
    private CityInfoAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.city_info_viewpager);
        pager = (ViewPager) findViewById(R.id.pager);
    }
}
