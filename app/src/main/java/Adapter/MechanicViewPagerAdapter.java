package Adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import fragment.DataListFragment;


public class MechanicViewPagerAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 2;


    public MechanicViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {

            case 0:

                DataListFragment listFragment = new DataListFragment();
                return listFragment;

            case 1:

                DataListFragment mapFragment = new DataListFragment();
                return mapFragment;

        }

        return null;


    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}