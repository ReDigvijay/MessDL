package com.devilcity.messdl;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class DayActivityMonday extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.day_activity_monday);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.ic_launcher);
    }

    public void breakfastClick(View v) {
        Intent i = new Intent(this, MondayBreakfast.class);
        startActivity(i);
    }

    public void lunchClick(View v) {
        Intent i = new Intent(this, MondayLunch.class);
        startActivity(i);
    }

    public void snacksClick(View v) {
        Intent i = new Intent(this, MondaySnacks.class);
        startActivity(i);
    }
    public void dinnerClick(View v) {
        Intent i = new Intent(this, MondayDinner.class);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_day_activity_monday, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent myIntent = new Intent(getApplicationContext(), WeekActivity.class);
        startActivityForResult(myIntent, 0);
        return true;

    }
}