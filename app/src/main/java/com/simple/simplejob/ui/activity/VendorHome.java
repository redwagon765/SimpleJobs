package com.simple.simplejob.ui.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.simple.simplejob.R;
import com.simple.simplejob.ui.fragment.JobsFragment;
import com.simple.simplejob.ui.fragment.MessagesFragment;
import com.simple.simplejob.ui.fragment.ProfileFragment;


public class VendorHome extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    ViewPager viewPager;
    BottomNavigationView navigation;
    FragmentManager fragmentManager;
    TextView text_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendor_home);

        loadFragment(new JobsFragment());

        navigation = findViewById(R.id.navigation);

        text_title = findViewById(R.id.text_title);
        text_title.setText("Jobs");

        navigation.setOnNavigationItemSelectedListener(this);


    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch (menuItem.getItemId()) {

            case R.id.home:
                for (Fragment fragment : getSupportFragmentManager().getFragments()) {
                    if (fragment != null) {
                        getSupportFragmentManager().beginTransaction().remove(fragment).commit();
                    }
                }
                return true;


            case R.id.navigation_bookings:


                break;
            case R.id.messages:
                if (!(getCurrentFrag() instanceof MessagesFragment)) {

                    MessagesFragment messagesFragment = new MessagesFragment();
                    fragmentManager = getSupportFragmentManager();
                    FragmentTransaction transaction = fragmentManager.beginTransaction();
                    transaction.replace(R.id.select_services, messagesFragment);
                    transaction.addToBackStack(null);
                    transaction.commit();


                }
                return true;


            case R.id.navigation_profile:
                if (!(getCurrentFrag() instanceof ProfileFragment)) {

                    ProfileFragment profileFragment = new ProfileFragment();
                    fragmentManager = getSupportFragmentManager();
                    FragmentTransaction transaction = fragmentManager.beginTransaction();
                    transaction.replace(R.id.select_services, profileFragment);
                    transaction.addToBackStack(null);
                    transaction.commit();


                }
                return true;

        }

        return false;


    }

    public Fragment getCurrentFrag() {
        Fragment frag = getSupportFragmentManager().findFragmentById(R.id.select_services);
        return frag;
    }

    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.select_services, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public void onBackPressed() {

        navigation.getMenu().getItem(0).setChecked(true);
        super.onBackPressed();

    }
}
