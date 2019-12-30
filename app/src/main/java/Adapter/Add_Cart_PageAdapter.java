package Adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import fragment.Fragment_Add_Cart1;
import fragment.Fragment_Add_Cart2;
import fragment.Fragment_Add_Cart3;


/**
 * Created by wolfsoft on 10/11/2015.
 */
public class Add_Cart_PageAdapter extends FragmentStatePagerAdapter {



    public Add_Cart_PageAdapter(FragmentManager fm) {
        super(fm);

    }


    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Fragment_Add_Cart1 tab1 = new Fragment_Add_Cart1();
                return tab1;

            case 1:
                Fragment_Add_Cart2 tab6 = new Fragment_Add_Cart2();
                return tab6;


            case 2:
                Fragment_Add_Cart3 tab2 = new Fragment_Add_Cart3();
                return tab2;


            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}