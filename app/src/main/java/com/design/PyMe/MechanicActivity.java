package com.design.PyMe;

import android.app.Dialog;
import com.google.android.material.tabs.TabLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.ListFragment;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;



import java.util.ArrayList;
import java.util.List;

import Adapter.MechanicViewPagerAdapter;

public class MechanicActivity extends AppCompatActivity {


    MechanicViewPagerAdapter mechanicViewPagerAdapter;
    Dialog myDialog;
    ImageView img_add;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private int[] tabIcons = {
            R.drawable.ic_menu,
            R.drawable.ic_placeholder1
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanic);


        img_add = (ImageView) findViewById(R.id.img_add);

        img_add.setVisibility(View.VISIBLE);

        viewPager = (ViewPager) findViewById(R.id.viewpager1);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs1);
        tabLayout.setupWithViewPager(viewPager);

        mechanicViewPagerAdapter = new MechanicViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(mechanicViewPagerAdapter);
        setupTabIcons();


        img_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                popup();

            }
        });

    }

    public void popup() {

        myDialog = new Dialog(MechanicActivity.this);
        myDialog.getWindow();
        myDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        myDialog.setCancelable(true);
        myDialog.setContentView(R.layout.activity_add_popup);
        myDialog.show();
    }

    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);

    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new ListFragment(), "");
      //  adapter.addFrag(new MapFragment(), "");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}
