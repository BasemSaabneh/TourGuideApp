package com.devschema.sh4d0w.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;
    private String tabTitles[];

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
        tabTitles = new String[]{
                mContext.getString(R.string.tab_city),
                mContext.getString(R.string.tab_holy),
                mContext.getString(R.string.tab_food),
                mContext.getString(R.string.tab_heritage),
                mContext.getString(R.string.tab_map)
        };
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CitiesFragment();
        } else if (position == 1) {
            return new HolyLandFragment();
        } else if (position == 2) {
            return new FoodFragment();
        } else if (position == 3) {
            return new HeritageFragment();
        } else {
            return new HistoryFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    @Override
    public int getCount() {
        return 5;
    }
}
