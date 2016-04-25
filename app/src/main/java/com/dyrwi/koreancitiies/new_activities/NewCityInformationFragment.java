package com.dyrwi.koreancitiies.new_activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.dyrwi.koreancitiies.R;
import java.util.UUID;

/**
 * Created by Ben on 11-Sep-15.
 */
public class NewCityInformationFragment extends Fragment {
    public static final String NEWCITY_ID = "newCityID";
    private NewCity city = null;

    public static NewCityInformationFragment newInstance(UUID cityID) {
        Bundle args = new Bundle();
        args.putSerializable(NEWCITY_ID, cityID);

        NewCityInformationFragment fragment = new NewCityInformationFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceStatus) {
        super.onCreate(savedInstanceStatus);
        UUID cityID = (UUID)getArguments().getSerializable(NEWCITY_ID);
        this.city = NewCityLab.get(getActivity().getApplicationContext()).get(cityID);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceStatus) {
        View v = inflater.inflate(R.layout.city_information, null);
        TextView cityName = (TextView)v.findViewById(R.id.city_information_city_name);
        cityName.setText(city.getName());

        ImageView image = (ImageView)v.findViewById(R.id.city_information_city_image);
        image.setImageResource(city.getPhoto());

/*        TextView population = (TextView)v.findViewById(R.id.city_information_population);
        population.setText(city.getPopulation());*/

        TextView description = (TextView)v.findViewById(R.id.city_information_description);
        description.setText(city.getBriefDescription());

        TextView history = (TextView)v.findViewById(R.id.city_information_history);
        history.setText(city.getHistory());

        TextView touristAttractions  = (TextView)v.findViewById(R.id.city_information_tourist_attractions);
        touristAttractions.setText(city.getTouristAttractions());

        return v;
    }
}
