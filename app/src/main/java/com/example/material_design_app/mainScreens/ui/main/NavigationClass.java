package com.example.material_design_app.mainScreens.ui.main;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.example.material_design_app.R;
import com.example.material_design_app.mainScreens.ui.feed.FeedFragment;
import com.example.material_design_app.mainScreens.ui.dashboard.DashboardFragment;
import com.example.material_design_app.mainScreens.ui.expandable.ExpandableFragment;
import com.example.material_design_app.mainScreens.ui.list.ListFragment;
import com.example.material_design_app.mainScreens.ui.news.NewsFragment;
import com.example.material_design_app.mainScreens.ui.profile.ProfileFragment;
import com.example.material_design_app.mainScreens.ui.settings.SettingsFragment;
import com.example.material_design_app.mainScreens.ui.shopping.ShoppingFragment;
import com.google.android.material.navigation.NavigationView;

public class NavigationClass extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawer;

    ImageButton drawerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_design_navigation);


        drawer = findViewById(R.id.drawer_layout);

        drawerButton = findViewById(R.id.drawer_button);

        final NavigationView navigationView = findViewById(R.id.nav_view);

        navigationView.setNavigationItemSelectedListener(this);


        drawerButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if(!drawer.isDrawerOpen(GravityCompat.START))drawer.openDrawer(GravityCompat.START);

                else drawer.closeDrawer(GravityCompat.END);

            }
        });

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container,
                    new ProfileFragment()).commit();
            navigationView.setCheckedItem(R.id.profile); }
    }
        @Override
        public void onBackPressed () {
            if (drawer.isDrawerOpen(GravityCompat.START)) {
                drawer.closeDrawer(GravityCompat.START);
            } else {
                super.onBackPressed();
            }
        }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {

            case R.id.profile:
                getSupportFragmentManager().beginTransaction().replace(R.id.container,
                        new ProfileFragment()).commit();
                break;

            case R.id.dashboard:
                getSupportFragmentManager().beginTransaction().replace(R.id.container,
                        new DashboardFragment()).addToBackStack(null).commit();
                break;

            case R.id.news:
                getSupportFragmentManager().beginTransaction().replace(R.id.container,
                        new NewsFragment()).addToBackStack(null).commit();
                break;

            case R.id.shopping:
                getSupportFragmentManager().beginTransaction().replace(R.id.container,
                        new ShoppingFragment()).addToBackStack(null).commit();
                break;

            case R.id.feed:
                getSupportFragmentManager().beginTransaction().replace(R.id.container,
                        new FeedFragment()).addToBackStack(null).commit();
                break;

            case R.id.expandable:
                getSupportFragmentManager().beginTransaction().replace(R.id.container,
                        new ExpandableFragment()).addToBackStack(null).commit();
                break;

            case R.id.list:
                getSupportFragmentManager().beginTransaction().replace(R.id.container,
                        new ListFragment()).addToBackStack(null).commit();
                break;

            case R.id.settings:
                getSupportFragmentManager().beginTransaction().replace(R.id.container,
                        new SettingsFragment()).addToBackStack(null).commit();
                break;
        }

        drawer.closeDrawer(GravityCompat.START);
        return true;

    }
}


