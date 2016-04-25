package com.dyrwi.koreancitiies.classes;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;
import java.util.UUID;

/**
 * Created by Ben on 10-Sep-15.
 */
public class City {
    private static final String JSON_ID  ="id";
    private static final String JSON_NAME = "name";
    private static final String JSON_POPULATION  ="population";
    private static final String JSON_HISTORY = "history";
    private static final String JSON_TOURIST_ATTRACTIONS = "touristAttractions";
    private static final String JSON_PHOTO = "photo";
    private static final String JSON_BRIEF_DESCRIPTION = "photo";

    private UUID id;
    private String name;
    private String briefDescription;
    private String population;
    private String history;
    private String touristAttractions;
    private Photo photo;


    public City() {
        id = UUID.randomUUID();
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject json = new JSONObject();
        json.put(JSON_ID, id.toString());
        json.put(JSON_NAME, name);
        json.put(JSON_POPULATION, population);
        json.put(JSON_HISTORY, history);
        json.put(JSON_TOURIST_ATTRACTIONS, touristAttractions);
        json.put(JSON_PHOTO, photo);
        json.put(JSON_BRIEF_DESCRIPTION, briefDescription);
        Log.i("TAG", this.getName() + " created");
        return json;
    }

    public City(JSONObject json) throws JSONException {
        id = UUID.fromString(json.getString(JSON_ID));
        name = json.getString(JSON_NAME);
        population = json.getString(JSON_POPULATION);
        history = json.getString(JSON_HISTORY);
        touristAttractions = json.getString(JSON_TOURIST_ATTRACTIONS);
        briefDescription = json.getString(JSON_BRIEF_DESCRIPTION);
        if (json.has(JSON_PHOTO))
            photo = new Photo(json.getJSONObject(JSON_PHOTO));
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
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

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public Photo getPhoto() {
        return this.photo;
    }

    public String getBriefDescription() {
        return briefDescription;
    }

    public void setBriefDescription(String briefDescription) {
        this.briefDescription = briefDescription;
    }
}
