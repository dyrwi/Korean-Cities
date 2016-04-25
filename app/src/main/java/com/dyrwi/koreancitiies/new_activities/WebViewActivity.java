package com.dyrwi.koreancitiies.new_activities;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

import com.dyrwi.koreancitiies.R;

/**
 * Created by Ben on 12-Sep-15.
 */
public class WebViewActivity extends Activity {
    WebView browser;

    @Override
    public void onCreate(Bundle savedInstanceStatus) {
        super.onCreate(savedInstanceStatus);
        setContentView(R.layout.web_view);
        browser = (WebView)findViewById(R.id.webView);
        browser.getSettings().setJavaScriptEnabled(true);
        browser.getSettings().setBuiltInZoomControls(true);
        browser.loadUrl("http://english.visitkorea.or.kr/enu/SI/SI_EN_3_1_1_1.jsp?cid=264204");
    }

}
