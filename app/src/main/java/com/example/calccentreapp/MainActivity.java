package com.example.calccentreapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.preference.PreferenceManager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle drawerToggle;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(drawerToggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout=findViewById(R.id.drawer_layout);
        navigationView=findViewById(R.id.nav_view);
        drawerToggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home: {
                        Toast.makeText(MainActivity.this, " in progress ", Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.calc:
                    {
                        Toast.makeText(MainActivity.this,"Calculator Selected ",Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.acc:
                    {
                        Toast.makeText(MainActivity.this,"in progress",Toast.LENGTH_SHORT).show();
                        break;
                    }
                    case R.id.settings:
                    {
                        Toast.makeText(MainActivity.this,"Settings Selected",Toast.LENGTH_SHORT).show();
                        break;
                    }
                }
                return false;
            }
        });
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        String setting = "Welcome " + prefs.getString("user_name", "");
        Toast.makeText(this, setting, Toast.LENGTH_LONG).show();
    }
    @Override
    public void onBackPressed(){
        if(drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();
        }
    }

    public void launchSettings(MenuItem item) {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
    public void launchRoman(MenuItem item) {
        Intent intent = new Intent(this, FromToRomanActivity.class);
        startActivity(intent);
    }
    public void launchConverter(MenuItem item) {
        Intent intent = new Intent(this, ConverterActivity.class);
        startActivity(intent);
    }
    public void launchTempConverter(MenuItem item) {
        Intent intent = new Intent(this, TempConverterActivity.class);
        startActivity(intent);

    }
    public void launchNumericSystems(MenuItem item) {
        Intent intent = new Intent(this, Numeric_Systems.class);
        startActivity(intent);
    }
    public void launchCalculator(MenuItem item) {
        Intent intent = new Intent(this, CalculatorActivity.class);
        startActivity(intent);
    }
    public void launchEnergyConverter(MenuItem item) {
        Intent intent = new Intent(this, EnergyConverter.class);
        startActivity(intent);
    }
}