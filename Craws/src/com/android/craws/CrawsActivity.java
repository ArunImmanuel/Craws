package com.android.craws;

import android.app.Activity;
import android.os.Bundle;

public class CrawsActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        System.out.println("Welcome to Craws");
    }
}