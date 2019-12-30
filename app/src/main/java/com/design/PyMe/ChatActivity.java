package com.design.PyMe;

import android.graphics.Typeface;
import com.google.android.material.tabs.TabLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import Adapter.ChatPagerAdapter;

public class ChatActivity extends AppCompatActivity {

    TextView title;
    private Toolbar toolbar;
    private ViewPager viewPager;
    Typeface mTypeface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        title = findViewById(R.id.title);
        title.setText("Chat");


        setToolbar();

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tab_layout);

        tabLayout.setTabMode(TabLayout.MODE_FIXED);

        tabLayout.addTab(tabLayout.newTab().setText("USER"));
        tabLayout.addTab(tabLayout.newTab().setText("MECANICS"));
        tabLayout.addTab(tabLayout.newTab().setText("GARAGES"));


//        tabLayout.addTab(tabLayout.newTab().setText("DESERT"));
//
//        tabLayout.addTab(tabLayout.newTab().setText("SOUP"));


        mTypeface = Typeface.createFromAsset(this.getAssets(), "fonts/OpenSans-Semibold.ttf");
        ViewGroup vg = (ViewGroup) tabLayout.getChildAt(0);
        int tabsCount = vg.getChildCount();
        for (int j = 0; j < tabsCount; j++) {
            ViewGroup vgTab = (ViewGroup) vg.getChildAt(j);
            int tabChildsCount = vgTab.getChildCount();
            for (int i = 0; i < tabChildsCount; i++) {
                View tabViewChild = vgTab.getChildAt(i);
                if (tabViewChild instanceof TextView) {
                    ((TextView) tabViewChild).setTypeface(mTypeface, Typeface.NORMAL);
                }
            }
        }





        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        viewPager = (ViewPager) findViewById(R.id.pager);
        ChatPagerAdapter adapter = new ChatPagerAdapter
                (getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);


        viewPager.setOffscreenPageLimit(4);



        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }

    public void setCurrentTab(int i) {
        viewPager.setCurrentItem(i);
    }


    private void setToolbar(){

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null)
            actionBar.setDisplayHomeAsUpEnabled(false);

        actionBar.setTitle("");
    }
}
