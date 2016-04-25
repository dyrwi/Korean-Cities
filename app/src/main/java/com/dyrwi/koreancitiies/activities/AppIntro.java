package com.dyrwi.koreancitiies.activities;


import android.content.Intent;
import android.os.Bundle;

import com.dyrwi.koreancitiies.new_activities.NewCityListActivity;
import com.dyrwi.koreancitiies.utils.AppIntroFragmentBuilder;
import com.dyrwi.koreancitiies.R;

public class AppIntro extends com.github.paolorotolo.appintro.AppIntro {
    @Override
    public void init(Bundle savedInstanceState) {
        addSlide(AppIntroFragmentBuilder.newInstance(R.layout.app_intro_1));
        addSlide(AppIntroFragmentBuilder.newInstance(R.layout.app_intro_2));
        addSlide(AppIntroFragmentBuilder.newInstance(R.layout.app_intro_3));
    }

    @Override
    public void onDonePressed() {
        startMainActivity();
    }

    @Override
    public void onSkipPressed() {
        startMainActivity();
    }

    private void startMainActivity() {
        Intent i = new Intent(this, NewCityListActivity.class);
        startActivity(i);
    }
}

