package com.sss.profilenavigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.Toast;

import com.sss.profilenavigation.java_home.assignmentsActivity;
import com.sss.profilenavigation.java_home.downloadsActivity;
import com.sss.profilenavigation.java_home.eventActivity;
import com.sss.profilenavigation.java_home.informationActivity;
import com.sss.profilenavigation.java_home.routineActivity;
import com.sss.profilenavigation.java_home.trainingActivity;

public class MainActivity extends AppCompatActivity implements
      View.OnClickListener,
         NavigationView.OnNavigationItemSelectedListener
{
//    private CardView cardEvent, cardRoutine, cardInformation, cardTraining, cardAssignments, cardDownloads;


    @Override
    public void onClick(View v) {

    }

    public void eventClick(View v) {
        Intent intent = new Intent(this, eventActivity.class);
        startActivity(intent);
    }

    public void downloadClick (View v){
    Intent intent = new Intent(this, downloadsActivity.class);
    startActivity(intent);
}
    public void assignmentClick (View v){
        Intent intent = new Intent(this, assignmentsActivity.class);
        startActivity(intent);
    }
    public void informationClick (View v){
        Intent intent = new Intent(this, informationActivity.class);
        startActivity(intent);
    }
    public void routineClick (View v){
        Intent intent = new Intent(this, routineActivity.class);
        startActivity(intent);
    }
    public void trainingClick (View v){
        Intent intent = new Intent(this, trainingActivity.class);
        startActivity(intent);
    }

    //    @SuppressLint("WrongViewCast")
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //defining cards from the content_main xml file
//        cardEvent = (CardView) findViewById(R.id.card_event);
//        cardRoutine = (CardView) findViewById(R.id.card_routine);
//        cardInformation = (CardView) findViewById(R.id.card_information);
//        cardTraining = (CardView) findViewById(R.id.card_training);
//        cardAssignments = (CardView) findViewById(R.id.card_assignments);
//        cardDownloads = (CardView) findViewById(R.id.card_downloads);

        //add click listener to the cards
//        cardEvent.setOnClickListener((View.OnClickListener) this);
//        cardRoutine.setOnClickListener((View.OnClickListener) this);
//        cardInformation.setOnClickListener((View.OnClickListener) this);
//        cardTraining.setOnClickListener((View.OnClickListener) this);
//        cardAssignments.setOnClickListener((View.OnClickListener) this);
//        cardDownloads.setOnClickListener((View.OnClickListener) this);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener((NavigationView.OnNavigationItemSelectedListener) this);

    }
    @Override
    public void onBackPressed()
    {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START))
        {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //@SuppressWarnings("StatementWithEmptyBody")
//    @Override
    public boolean onNavigationItemSelected(MenuItem item)
    {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_attendance)
        {
            Toast.makeText(getApplicationContext(), "Attendance Clicked", Toast.LENGTH_SHORT).show();
//                    return true;
            // Handles the action
        } else if (id == R.id.nav_weekly_test)
        {

        }
        else if (id == R.id.nav_performance)
        {

        }
        else if (id == R.id.nav_settings)
        {

        }
        else if (id == R.id.nav_accounts)
        {
        }
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    //to choose between different activity of home page using switch
//    @Override
//    public void onClick(View v)
//    {
//        Intent i;
//
//        switch (v.getId())
//        {
//            case R.id.card_event : i = new Intent(this, eventActivity.class);
//                startActivity(i);
//                break;
//            case R.id.card_routine : i = new Intent(this, routineActivity.class);
//                startActivity(i);
//                break;
//            case R.id.card_information : i = new Intent(this, informationActivity.class);
//                startActivity(i);
//                break;
//            case R.id.card_training : i = new Intent(this, trainingActivity.class);
//                startActivity(i);
//                break;
//            case R.id.card_assignments : i = new Intent(this, assignmentsActivity.class);
//                startActivity(i);
//                break;
//            case R.id.card_downloads : i = new Intent(this, downloadsActivity.class);
//                startActivity(i);
//                break;
//            default:break ;
//        }
//    }
}

//    public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
//{
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState)
//    {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        DrawerLayout drawer = findViewById(R.id.drawer_layout);
//        NavigationView navigationView = findViewById(R.id.nav_view);
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
//                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
//        drawer.addDrawerListener(toggle);
//        toggle.syncState();
//        navigationView.setNavigationItemSelectedListener(this);
//    }
//
//
//    @Override
//    public void onBackPressed()
//    {
//        DrawerLayout drawer = findViewById(R.id.drawer_layout);
//        if (drawer.isDrawerOpen(GravityCompat.START))
//        {
//            drawer.closeDrawer(GravityCompat.START);
//        } else {
//            super.onBackPressed();
//        }
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu)
//    {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings)
//        {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
//
//    //@SuppressWarnings("StatementWithEmptyBody")
//    @Override
//    public boolean onNavigationItemSelected(MenuItem item)
//    {
//        // Handle navigation view item clicks here.
//        int id = item.getItemId();
//
//        if (id == R.id.nav_attendance)
//        {
//            // Handles the action
//        } else if (id == R.id.nav_weekly_test)
//        {
//
//        }
//        else if (id == R.id.nav_performance)
//        {
//
//        }
//        else if (id == R.id.nav_settings)
//        {
//
//        }
//        else if (id == R.id.nav_accounts)
//        {
//        }
//        DrawerLayout drawer = findViewById(R.id.drawer_layout);
//        drawer.closeDrawer(GravityCompat.START);
//        return true;
//    }
//}
