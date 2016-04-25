package com.dyrwi.koreancitiies.new_activities;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.dyrwi.koreancitiies.R;
import com.mikepenz.community_material_typeface_library.CommunityMaterial;
import com.mikepenz.fontawesome_typeface_library.FontAwesome;
import com.mikepenz.iconics.IconicsDrawable;

/**
 * Created by Ben on 11-Sep-15.
 */
public abstract class NewSingleFragmentActivity extends AppCompatActivity {
    protected Toolbar toolbar;
    private static String TAG = "NewSingleFragmentActivity";

    protected abstract Fragment createFragment();
    protected abstract void search(String s);

    protected int getLayoutResId() {
        return R.layout.activity_fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceStatus) {
        super.onCreate(savedInstanceStatus);
        setContentView(getLayoutResId());
        this.toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment = manager.findFragmentById(R.id.content_frame);

        if (fragment == null) {
            fragment = createFragment();
            manager.beginTransaction().add(R.id.content_frame, fragment).commit();
        }
    }

    protected Toolbar getToolbar() {
        return this.toolbar;
    }


}
