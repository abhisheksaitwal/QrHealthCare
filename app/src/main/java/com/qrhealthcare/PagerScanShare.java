package com.qrhealthcare;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class PagerScanShare extends FragmentStatePagerAdapter {

    //integer to count number of tabs
    int tabCount;
    private String[] tabTitles = new String[]{"Home", "Nearby", "Profile"};
    //Constructor to the class
    public PagerScanShare(FragmentManager fm, int tabCount) {
        super(fm);
        //Initializing tab count
        this.tabCount= tabCount;
    }


    // overriding getPageTitle()

    /* you can add name to tab instead only icon i.e. text with icon */
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }



    //Overriding method getItem
    @Override
    public Fragment getItem(int position) {
        //Returning the current tabs
        switch (position) {
            case 0:
                Tab1Scan tab1 = new Tab1Scan();
                return tab1;
            case 1:
                Tab2Nearby tab2 = new Tab2Nearby();
                return tab2;
            case 2:
                Tab3Profile tab3 = new Tab3Profile();
                return tab3;
            default:
                return null;
        }
    }

    //Overriden method getCount to get the number of tabs
    @Override
    public int getCount() {
        return tabCount;
    }
}
