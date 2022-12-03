package com.example.projectschool;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.projectschool.fragments.*;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class NavPage extends AppCompatActivity {

    BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_page);

        navigationView = findViewById(R.id.bottomNavigationView);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new CatalogFragment()).commit();
        navigationView.setSelectedItemId(R.id.catalog);

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                switch (item.getItemId()) {
                    case R.id.catalog:
                        fragment = new CatalogFragment();
                        break;
                    case R.id.profile:
                        fragment = new ProfileFragment();
                        break;
                    case R.id.news:
                        fragment = new NewsFragment();
                        break;
                    case R.id.others:
                        fragment = new OthersFragment();
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, fragment).commit();

                return true;
            }
        });

    }
}