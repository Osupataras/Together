package com.osypchuk.taras.together.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.osypchuk.taras.together.Fragments.FragmentMap;
import com.osypchuk.taras.together.Fragments.FragmentMenu;
import com.osypchuk.taras.together.Fragments.FragmentProfile;

/**
 * Created by Taras on 05.12.2016.
 */

public class TabsAdapter extends FragmentPagerAdapter {
    int NumOfTabs;

    public TabsAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.NumOfTabs = NumOfTabs;
    }

    @Override
    public int getCount() {
        return NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                FragmentMenu tab1 = new FragmentMenu();
                return tab1;
            case 1:
                FragmentMap tab2 = new FragmentMap();
                return tab2;
            case 2:
                FragmentProfile tab3 = new FragmentProfile();
                return tab3;
            default:
                return null;


        }
    }

}