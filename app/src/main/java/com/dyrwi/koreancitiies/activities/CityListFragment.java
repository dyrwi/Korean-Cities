package com.dyrwi.koreancitiies.activities;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.dyrwi.koreancitiies.R;
import com.dyrwi.koreancitiies.classes.City;
import com.dyrwi.koreancitiies.utils.CityLab;

import java.io.InputStream;
import java.util.ArrayList;

public class CityListFragment extends ListFragment {
    private ArrayList<City> mCities;

    @Override
    public void onDetach() {
        super.onDetach();
    }
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        mCities = CityLab.get(getActivity()).getCities();
        Log.i("TAG", String.valueOf(mCities.size()));
        CityAdapter adapter = new CityAdapter(mCities);
        setListAdapter(adapter);
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View v = super.onCreateView(inflater, parent, savedInstanceState);
        return v;
    }


    private class CityAdapter extends ArrayAdapter<City> {
        public CityAdapter(ArrayList<City> cities) {
            super(getActivity(), android.R.layout.simple_list_item_1, cities);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // if we weren't given a view, inflate one
            if (null == convertView) {
                convertView = getActivity().getLayoutInflater()
                    .inflate(R.layout.list_city, null);
            }

            // configure the view for this City
            City c = getItem(position);

            TextView titleTextView =
                (TextView)convertView.findViewById(R.id.list_city_name);
            titleTextView.setText(c.getName());
            TextView populationTextView =
                (TextView)convertView.findViewById(R.id.list_city_population);
            populationTextView.setText(c.getPopulation());
            TextView descriptionTextView =
                    (TextView)convertView.findViewById(R.id.list_city_description);
            descriptionTextView.setText(c.getBriefDescription());

            ImageView skylineImageView = (ImageView)convertView.findViewById(R.id.list_city_skylineImage);
            InputStream is = getClass().getResourceAsStream("/drawable/seoul_skyline.png");
            skylineImageView.setImageDrawable(Drawable.createFromStream(is, ""));
            return convertView;
        }
    }
}

