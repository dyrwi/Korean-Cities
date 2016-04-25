package com.dyrwi.koreancitiies.new_activities;

import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentTransaction;

import com.dyrwi.koreancitiies.R;

/**
 * Created by Ben on 14-Sep-15.
 */
public class TabListener implements ActionBar.TabListener {
    Fragment frag;
    public TabListener(Fragment frag) {
        this.frag = frag;
    }
    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        ft.replace(R.id.city_info_main, frag);
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
        ft.remove(frag);
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}
