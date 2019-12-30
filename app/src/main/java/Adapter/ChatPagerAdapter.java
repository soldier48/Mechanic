package Adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import fragment.Fragment_Chat_User;


/**
 * Created by wolfsoft on 10/11/2015.
 */
public class
ChatPagerAdapter extends FragmentStatePagerAdapter {

    int mNumOfTabs;

    public ChatPagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }


    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Fragment_Chat_User tab1 = new Fragment_Chat_User();
                return tab1;

            case 1:
                Fragment_Chat_User tab2 = new Fragment_Chat_User();
                return tab2;


            case 2:
                Fragment_Chat_User tab3 = new Fragment_Chat_User();
                return tab3;





            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}