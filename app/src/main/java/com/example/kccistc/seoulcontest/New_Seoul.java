package com.example.kccistc.seoulcontest;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class New_Seoul extends AppCompatActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new__seoul);

        tabLayout = findViewById(R.id.tab);
        appBarLayout = findViewById(R.id.appbar);
        viewPager = findViewById(R.id.viewpager);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new New_Seoul_Fragment1(), "관광지");
        adapter.AddFragment(new New_Seoul_Fragment2(), "맛집");
        adapter.AddFragment(new New_Seoul_Fragment3(), "행사안내");

        //adapter setup
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);


    }
}
