package com.example.mansi.puneguide;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class CategoryActivity extends AppCompatActivity {
    public static int positon = -1;

    /**
     * position is declared as static so it can be directly used outside this class
     * // while trying to specify the position of fragment to be opened
     * and also to prevent multiple instance of position by different classes
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        //getting the viewpager from layout and setting an Custom FragmentPagerAdapter to it
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        CategoryPageAdpater adapter = new CategoryPageAdpater(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        //opening the excat fragment on which user has clicked
        viewPager.setCurrentItem(positon);

        //To set the names of respective tabs according to the fragment in the TabLayout
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }
}
