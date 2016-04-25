package com.dyrwi.koreancitiies.new_activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.dyrwi.koreancitiies.R;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Ben on 11-Sep-15.
 */
public class NewCityListFragment extends ListFragment {
    private static String TAG = "NewCityListFragment";
    private CityAdapter adapter = null;
    private ArrayList<NewCity> cityList = new ArrayList<NewCity>();

    @Override
    public void onCreate(Bundle savedInstanceStatus) {
        super.onCreate(savedInstanceStatus);
        Log.i(TAG, "onCreate is called");
        this.cityList = NewCityLab.get(getActivity().getApplicationContext()).getCities();
        this.adapter = new CityAdapter(NewCityLab.get(getActivity().getApplicationContext()).getCities());
        setListAdapter(adapter);
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceStatus) {
        return super.onCreateView(inflater, parent, savedInstanceStatus);
    }

    public void onListItemClick(ListView listView, View view, int position, long id) {
        NewCity c = (NewCity) getListAdapter().getItem(position);
        Intent i = new Intent(getActivity(), NewCityInformationActivity.class);
        i.putExtra(NewCityInformationFragment.NEWCITY_ID, c.getId());
        startActivity(i);
    }


    private class CityAdapter extends ArrayAdapter<NewCity> {
        public CityAdapter(ArrayList<NewCity> cities) {
            super(getActivity(), android.R.layout.simple_list_item_1, cities);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = getActivity().getLayoutInflater().inflate(R.layout.city_list_frag, null);
            }

            NewCity city = getItem(position);
            ImageView image = (ImageView) convertView.findViewById(R.id.city_list_frag_imageView);
            image.setImageBitmap(BitmapHelper.decodeSampledBitmapFromResource(getResources(), city.getPhoto(), 75, 75));

            TextView name = (TextView) convertView.findViewById(R.id.city_list_frag_name);
            name.setText(city.getName());

            TextView description = (TextView) convertView.findViewById(R.id.city_list_frag_description);
            description.setText(city.getBriefDescription());

            return convertView;
        }
    }

    public void onSearch(String s) {
        Log.i(TAG, "Searching " + s);
        cityList = new ArrayList<NewCity>();
        if (getActivity() == null) {
            Log.i(TAG, "activity is null");
        }
        for (int i = 0; i < NewCityLab.get(getActivity().getApplicationContext()).getCities().size(); i++) {
            if (NewCityLab.get(getActivity().getApplicationContext()).getCities().get(i).getName().toLowerCase().contains(s.toLowerCase())) {
                cityList.add(NewCityLab.get(getActivity().getApplicationContext()).getCities().get(i));
            }
        }
        Log.i(TAG, "Search has found: " + String.valueOf(cityList.size()) + " correct matches");
        adapter = new CityAdapter(cityList);
        setListAdapter(adapter);

    }

    public void sortByName() {
        if(cityList != null) {
            Collections.sort(cityList, new NewCityNameComparable());
            for(NewCity c: cityList) {
                Log.i(TAG, c.getName());
            }
            adapter.notifyDataSetChanged();
        }
    }


    public void sortByPopulation() {
        if(cityList != null) {
            Collections.sort(cityList, new NewCityPopulationComparable());
            for(NewCity c: cityList) {
                Log.i(TAG, c.getName());
            }
            adapter.notifyDataSetChanged();
        }
    }

}
