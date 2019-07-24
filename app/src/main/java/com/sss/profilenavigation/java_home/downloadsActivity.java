package com.sss.profilenavigation.java_home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sss.profilenavigation.R;

public class downloadsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_downloads);
        getSupportActionBar().setTitle("Downloads");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
