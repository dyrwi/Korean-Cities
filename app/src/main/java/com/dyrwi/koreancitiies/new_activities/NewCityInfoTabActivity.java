package com.dyrwi.koreancitiies.new_activities;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;

import com.dyrwi.koreancitiies.R;

/**
 * Created by Ben on 14-Sep-15.
 */
@SuppressWarnings("deprecation")
public class NewCityInfoTabActivity extends Activity{

    //Declare tabs and fragments
    Tab infoTab, historyTab, attractionsTab;
    Fragment infoFrag = new NewCityInfoFragInfo();
    Fragment historyFrag = new NewCityInfoFragHistory();
    Fragment attractionsFrag = new NewCityInfoFragAttractions();

    @Override
    public void onCreate(Bundle savedInstanceStatus) {
        super.onCreate(savedInstanceStatus);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        setContentView(R.layout.city_info_main);

        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        infoTab = actionBar.newTab().setText("INFO");;
        historyTab = actionBar.newTab().setText("HISTORY");
        attractionsTab = actionBar.newTab().setText("ATTRACTIONS");

        infoTab.setTabListener(new TabListener(infoFrag));

        actionBar.addTab(infoTab);
        actionBar.addTab(historyTab);
        actionBar.addTab(attractionsTab);

    }
}
