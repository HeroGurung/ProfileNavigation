package com.sss.profilenavigation.java_home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sss.profilenavigation.R;

public class assignmentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignments);
        getSupportActionBar().setTitle("Assignments");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
