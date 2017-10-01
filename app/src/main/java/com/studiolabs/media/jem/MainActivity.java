package com.studiolabs.media.jem;

import android.support.annotation.NonNull;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.design.widget.NavigationView;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.studiolabs.media.jem.fragments.AboutUsFragment;
import com.studiolabs.media.jem.fragments.AnnouncementFragment;
import com.studiolabs.media.jem.fragments.ContactUsFragment;
import com.studiolabs.media.jem.fragments.DevotionFragment;
import com.studiolabs.media.jem.fragments.EventFragment;
import com.studiolabs.media.jem.fragments.HomeFragment;
import com.studiolabs.media.jem.fragments.LiveRadioFragment;
import com.studiolabs.media.jem.fragments.LiveVideoFragment;
import com.studiolabs.media.jem.fragments.PodcastFragment;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        drawerLayout.setDrawerShadow(R.drawable.drawer_shadow,GravityCompat.START);

        toolbar = (Toolbar) findViewById(R.id.nav_action);

        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        setSupportActionBar(toolbar);

        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        drawerLayout.closeDrawers();
        actionBarDrawerToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        //Beginning of Passing Data into the Header of a Navigation bar
        View v = navigationView.getHeaderView(0);

        //Ending Passing Data into the Header of a Navigation bar
        navigationView.setNavigationItemSelectedListener(this);
        HomeFragment overviewFragment = new HomeFragment();
        android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragmentHolder, overviewFragment, overviewFragment.getTag()).commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawerLayout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return actionBarDrawerToggle.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            HomeFragment homeFragment = new HomeFragment();
            android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragmentHolder, homeFragment, homeFragment.getTag()).commit();
        } else if (id == R.id.nav_announcements) {
            AnnouncementFragment announcementFragment = new AnnouncementFragment();
            android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragmentHolder, announcementFragment, announcementFragment.getTag()).commit();
        } else if (id == R.id.nav_devotion) {
            DevotionFragment devotionFragment = new DevotionFragment();
            android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragmentHolder, devotionFragment, devotionFragment.getTag()).commit();
        } else if (id == R.id.nav_events) {
            EventFragment eventFragment = new EventFragment();
            android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragmentHolder, eventFragment, eventFragment.getTag()).commit();
        } else if (id == R.id.nav_live_radio) {
            LiveRadioFragment liveRadioFragment = new LiveRadioFragment();
            android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragmentHolder, liveRadioFragment, liveRadioFragment.getTag()).commit();
        } else if (id == R.id.nav_live_video) {
            LiveVideoFragment liveVideoFragment= new LiveVideoFragment();
            android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragmentHolder, liveVideoFragment, liveVideoFragment.getTag()).commit();
        } else if (id == R.id.nav_podcast) {
            PodcastFragment podcastFragment = new PodcastFragment();
            android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragmentHolder, podcastFragment, podcastFragment.getTag()).commit();
        }else if (id == R.id.nav_contact_us) {
            ContactUsFragment contactUsFragment = new ContactUsFragment();
            android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragmentHolder, contactUsFragment, contactUsFragment.getTag()).commit();
        }else if (id == R.id.nav_about_us) {
            AboutUsFragment aboutUsFragment= new AboutUsFragment();
            android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragmentHolder, aboutUsFragment, aboutUsFragment.getTag()).commit();
        }

        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}
