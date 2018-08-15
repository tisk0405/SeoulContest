package com.example.kccistc.seoulcontest;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class New_Seoul extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new__seoul);

        tabLayout = findViewById(R.id.tablayout_id);
        viewPager = findViewById(R.id.viewpager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        //add fragment here

        adapter.AddFragment(new New_Seoul_Tab1(), "");
        adapter.AddFragment(new New_Seoul_Tab2(), "");
        adapter.AddFragment(new New_Seoul_Tab3(), "");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_thumb_up);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_local_dining);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_videogame);
    }
}
