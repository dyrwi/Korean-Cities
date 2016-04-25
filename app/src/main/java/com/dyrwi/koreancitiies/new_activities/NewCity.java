package com.dyrwi.koreancitiies.new_activities;

import android.util.Log;

import com.dyrwi.koreancitiies.R;
import com.dyrwi.koreancitiies.classes.Photo;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.UUID;

/**
 * Created by Ben on 10-Sep-15.
 */
public class NewCity {
    private UUID id;
    private String name = "Name";
    private String briefDescription = "Description";
    private long population = 0;
    private String history = "History";
    private String touristAttractions = "Attractions";
    private int photo = R.drawable.busan_icon;
    private String link = "http://www.google.com";



    public NewCity() {
        id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getTouristAttractions() {
        return touristAttractions;
    }

    public void setTouristAttractions(String touristAttractions) {
        this.touristAttractions = touristAttractions;
    }

    public void setPhoto(int file) {
        this.photo = file;
    }

    public int getPhoto() {
        return this.photo;
    }

    public String getBriefDescription() {
        return briefDescription;
    }

    public void setBriefDescription(String briefDescription) {
        this.briefDescription = briefDescription;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
