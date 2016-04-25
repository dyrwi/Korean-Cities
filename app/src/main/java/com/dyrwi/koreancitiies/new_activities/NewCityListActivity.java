package com.dyrwi.koreancitiies.new_activities;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.dyrwi.koreancitiies.R;
import com.mikepenz.community_material_typeface_library.CommunityMaterial;
import com.mikepenz.fontawesome_typeface_library.FontAwesome;
import com.mikepenz.google_material_typeface_library.GoogleMaterial;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;

import java.util.List;

/**
 * Created by Ben on 11-Sep-15.
 */
public class NewCityListActivity extends NewSingleFragmentActivity {
    private NewCityListFragment fragment;
    private static final String TAG = "NewCityListActivity";

    @Override
    public void onCreate(Bundle savedInstanceStatus) {
        super.onCreate(savedInstanceStatus);
        new DrawerBuilder()
                .withActivity(this)
                .withHeader(R.layout.nav_banner)
                .withToolbar(getToolbar())
                .addDrawerItems(
                        new PrimaryDrawerItem()
                                .withIcon(CommunityMaterial.Icon.cmd_city)
                                .withName("Cities")
                                .withIdentifier(1)
                                .withTextColor(Color.parseColor("#444444"))
                                .withSelectedTextColor(Color.parseColor("#1976D2")),
                        new SecondaryDrawerItem()
                                .withName("Map")
                                .withIcon(GoogleMaterial.Icon.gmd_map)
                                .withIdentifier(2)
                                .withTextColor(Color.parseColor("#444444"))
                                .withSelectedTextColor(Color.parseColor("#E64A19")))
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int i, IDrawerItem iDrawerItem) {
                        FragmentManager manager = getSupportFragmentManager();
                        Fragment fragment;
                        switch (iDrawerItem.getIdentifier()) {
                            case 1:
                                fragment = createFragment();
                                break;
                            case 2:
                                Uri location = Uri.parse("geo:36.4734819,127.8105163?z=6`");
                                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
                                PackageManager packageManager = getPackageManager();
                                List<ResolveInfo> activities = packageManager.queryIntentActivities(mapIntent, 0);
                                if (activities.size() > 0) {
                                    startActivity(mapIntent);
                                }
                                break;
                            default:
                                break;
                        }
                        return false;
                    }
                }).build();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem searchItem = menu.findItem(R.id.action_search);
        searchItem.setIcon(new IconicsDrawable(this).icon(FontAwesome.Icon.faw_search).color(Color.GRAY).sizeDp(20));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            final SearchView searchView = (SearchView) menu.findItem(R.id.action_search).getActionView();
            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

                @Override
                public boolean onQueryTextSubmit(String query) {
                    Log.i(TAG, "onQueryTextSubmit");
                    if (query != null)
                        search(query);
                    return true;
                }

                @Override
                public boolean onQueryTextChange(String query) {
                    Log.i(TAG, "onQueryTextChange");
                    if (query != null)
                        search(query);
                    return true;
                }
            });
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle the presses on the toolbar items
        switch (item.getItemId()) {
            case R.id.order_by_name:
                Log.i(TAG, "Order By: City Name");
                if (fragment != null)
                    fragment.sortByName();
                return true;
            case R.id.order_by_population:
                Log.i(TAG, "Order By: Population");
                if (fragment != null)
                    fragment.sortByPopulation();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected Fragment createFragment() {
        if (fragment == null) {
            this.fragment = new NewCityListFragment();
            Log.i(TAG, "new fragment created");
        }
        return this.fragment;
    }

    @Override
    protected void search(String s) {
        if (fragment != null) {
            fragment.onSearch(s);
        } else {
            Log.e(TAG, "fragment is null");
        }
    }
}
