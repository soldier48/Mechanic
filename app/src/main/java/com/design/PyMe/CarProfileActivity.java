package com.design.PyMe;

import android.content.Context;
import android.graphics.Color;
import com.google.android.material.appbar.AppBarLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import Adapter.TagAdapter;
import ModelClass.BeanClassForTagData;

public class CarProfileActivity extends AppCompatActivity {

    ImageView img_logo, logo_botswana, backArrow, img_star, img_share, img_star1, img_share1, backArrow1;
    TextView txtheading, textview1;
    Context context;
    RecyclerView tag_recycle;
    TagAdapter tagAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_profile);

        tag_recycle = (RecyclerView) findViewById(R.id.tag_recycle);

        img_logo = (ImageView) findViewById(R.id.img_logo);
        backArrow = (ImageView) findViewById(R.id.backArrow);
        backArrow1 = (ImageView) findViewById(R.id.backArrow1);
        txtheading = (TextView) findViewById(R.id.txtheading);

        img_star = (ImageView) findViewById(R.id.img_star);
        img_share = (ImageView) findViewById(R.id.img_share);
        img_star1 = (ImageView) findViewById(R.id.img_star1);
        img_share1 = (ImageView) findViewById(R.id.img_share1);

        BeanClassForTagData tagDatas[] = {

                new BeanClassForTagData("Car repair"),
                new BeanClassForTagData("Car repair")


        };


        tagAdapter = new TagAdapter(tagDatas, CarProfileActivity.this);
        tag_recycle.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
        tag_recycle.setAdapter(tagAdapter);


        logo_botswana = (ImageView) findViewById(R.id.logo_botswana);
        textview1 = (TextView) findViewById(R.id.textview1);


        AppBarLayout mAppBarLayout = (AppBarLayout) findViewById(R.id.mainappbar);
        mAppBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow = false;
            int scrollRange = -1;

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
                if (scrollRange + verticalOffset == 0) {

                    //is collapsed
                    logo_botswana.setVisibility(View.GONE);
                    textview1.setVisibility(View.GONE);
                    txtheading.setVisibility(View.VISIBLE);
                    txtheading.setTextColor(Color.parseColor("#4d4d4d"));
                    img_star1.setVisibility(View.VISIBLE);
                    img_share1.setVisibility(View.VISIBLE);
                    img_logo.setVisibility(View.VISIBLE);
                    backArrow1.setVisibility(View.VISIBLE);
                    isShow = true;
//                    toolbar.setBackgroundColor(Color.parseColor("#FFFFFF"));
                } else if (isShow) {
                    isShow = false;

                    //is not collapsed
                    logo_botswana.setVisibility(View.VISIBLE);
                    textview1.setVisibility(View.VISIBLE);
                    txtheading.setVisibility(View.GONE);
                    img_logo.setVisibility(View.GONE);

                    img_star1.setVisibility(View.GONE);
                    img_share1.setVisibility(View.GONE);
                    backArrow1.setVisibility(View.GONE);

                    //   toolbar.setBackgroundColor(getResources().getColor(R.color.transperent));
                }
            }
        });

    }
}
