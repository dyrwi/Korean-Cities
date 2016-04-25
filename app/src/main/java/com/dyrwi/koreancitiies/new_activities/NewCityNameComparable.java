package com.dyrwi.koreancitiies.new_activities;

import java.util.Comparator;

/**
 * Created by Ben on 23-Sep-15.
 */
public class NewCityNameComparable implements Comparator<NewCity> {

    @Override
    public int compare(NewCity o1, NewCity o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
}
