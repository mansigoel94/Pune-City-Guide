package com.example.mansi.puneguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryPageAdpater extends FragmentPagerAdapter {
    String pageName[] = {"Hotel", "Dine", "to do", "About"};

    public CategoryPageAdpater(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 4;
    } //since there are 4 fragments in Pune Guide app

    /** 1st fragment is HotelFragment at index 0
     * 2nd fragment is RestaurantFragment at index 1
     * 3rd fragment is ToDoFragment at index 2
     * 4th fragment is AboutFragment at index 3 or last index
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return (new HotelFragment());
        } else if (position == 1) {
            return new RestaurantFragment();
        } else if (position == 2) {
            return new ToDoFragment();
        } else
            return new AboutFragment();
    }

    /**Return the name of pages according to index to populate in TabLayout*/
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return pageName[0];
        } else if (position == 1) {
            return pageName[1];
        } else if (position == 2) {
            return pageName[2];
        } else
            return pageName[3];
    }
}
