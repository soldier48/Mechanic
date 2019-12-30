package com.design.PyMe;

import android.content.Context;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import Adapter.Add_Cart_PageAdapter;


public class AddCarActivity extends AppCompatActivity {


    ImageView iv_next;
    ImageView iv_done;
    LinearLayout previous;
    LinearLayout linear, linear1, linear2, linear3;
    TextView txt1, txt2, txt3, txt1_1, txt1_2, txt1_3, txt3_1, txt3_2, txt3_3;
    int CURRENTPAGE = 0;
    private Add_Cart_PageAdapter add_cart_pageAdapter;
    private ViewPager viewPager;
    private Context context = AddCarActivity.this;

    ImageView next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_car);

        linear1 = (LinearLayout) findViewById(R.id.linear1);

        txt1 = (TextView) findViewById(R.id.text1);
        txt2 = (TextView) findViewById(R.id.text2);
        txt3 = (TextView) findViewById(R.id.text3);

        iv_next = findViewById(R.id.iv_next);
        iv_done = findViewById(R.id.iv_done);
        previous = findViewById(R.id.previous);

        iv_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (CURRENTPAGE < 2) {
                    CURRENTPAGE++;
                    viewPager.setCurrentItem(CURRENTPAGE);
                    setcompletedStates(CURRENTPAGE);
                    Log.e("CURRENTPAGE", CURRENTPAGE + "");
                }
                if (CURRENTPAGE != 2) {
                    iv_done.setVisibility(View.GONE);
                    iv_next.setVisibility(View.VISIBLE);
                } else {
                    iv_done.setVisibility(View.VISIBLE);
                    iv_next.setVisibility(View.GONE);
                }

            }
        });


        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (CURRENTPAGE < 3 && CURRENTPAGE != 0) {
                    CURRENTPAGE--;
                    viewPager.setCurrentItem(CURRENTPAGE);
                    setcompletedStates(CURRENTPAGE);
                    Log.e("CURRENTPAGE", CURRENTPAGE + "");

                    iv_done.setVisibility(View.GONE);
                    iv_next.setVisibility(View.VISIBLE);
                }
            }
        });


        viewPager = (ViewPager) findViewById(R.id.viewpager);
        add_cart_pageAdapter = new Add_Cart_PageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(add_cart_pageAdapter);

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                CURRENTPAGE = position;
                setcompletedStates(CURRENTPAGE);
                if (CURRENTPAGE == 0) {
                    previous.setVisibility(View.GONE);
                } else {
                    previous.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }



    private void setcompletedStates(int CURRENTPAGE) {
        if (CURRENTPAGE == 0) {
            txt1.setTextColor(ContextCompat.getColor(context, R.color.white));
            txt2.setTextColor(ContextCompat.getColor(context, R.color.green));
            txt3.setTextColor(ContextCompat.getColor(context, R.color.green));


            txt1.setBackground(ContextCompat.getDrawable(context, R.drawable.dark_green_circle));
            txt2.setBackground(ContextCompat.getDrawable(context, R.drawable.border_green_circle));
            txt3.setBackground(ContextCompat.getDrawable(context, R.drawable.border_green_circle));
        }
        if (CURRENTPAGE == 1) {

            txt1.setTextColor(ContextCompat.getColor(context, R.color.white));
            txt2.setTextColor(ContextCompat.getColor(context, R.color.white));
            txt3.setTextColor(ContextCompat.getColor(context, R.color.green));

            txt1.setBackground(ContextCompat.getDrawable(context, R.drawable.dark_green_circle));
            txt2.setBackground(ContextCompat.getDrawable(context, R.drawable.dark_green_circle));
            txt3.setBackground(ContextCompat.getDrawable(context, R.drawable.border_green_circle));
        }
        if (CURRENTPAGE == 2) {

            txt1.setTextColor(ContextCompat.getColor(context, R.color.white));
            txt2.setTextColor(ContextCompat.getColor(context, R.color.white));
            txt3.setTextColor(ContextCompat.getColor(context, R.color.white));

            txt1.setBackground(ContextCompat.getDrawable(context, R.drawable.dark_green_circle));
            txt2.setBackground(ContextCompat.getDrawable(context, R.drawable.dark_green_circle));
            txt3.setBackground(ContextCompat.getDrawable(context, R.drawable.dark_green_circle));
        }
    }
}
