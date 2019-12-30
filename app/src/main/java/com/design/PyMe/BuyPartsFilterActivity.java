package com.design.PyMe;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import Adapter.RecycleAdapter_BuyPartFilter;
import ModelClass.BeanClassForBuyPartsFilter;

public class BuyPartsFilterActivity extends AppCompatActivity {

    TextView title;

    private int image[] = {R.drawable.guide, R.drawable.art37_2, R.drawable.guide, R.drawable.art37_2, R.drawable.guide, R.drawable.art37_2};
    private String name[] = {"Deflection/Guide Pulley, v-ribbed belt", "Oil Filter", "Deflection/Guide Pulley, v-ribbed belt", "Oil Filter", "Deflection/Guide Pulley, v-ribbed belt", "Oil Filter"};
    private String subname[] = {"OPTIMAL 0-N1603", "ALCO FILTER SP-997", "OPTIMAL 0-N1603", "ALCO FILTER SP-997", "OPTIMAL 0-N1603", "ALCO FILTER SP-997"};
    private String discount_price[] = {"$ 500", "$ 100", "$ 500", "$ 100", "$ 500", "$ 100"};
    private String price[] = {"$ 600", "", "", "$ 600", "", ""};
    private String discount[] = {"10% off", "10% off", "10% off", "10% off", "10% off", "10% off"};

    LinearLayout linear_filters;
    private ArrayList<BeanClassForBuyPartsFilter> beanClassForBuyPartsFilters;

    private RecyclerView recyclerView;
    private RecycleAdapter_BuyPartFilter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_parts_filter);






        title = findViewById(R.id.title);
        title.setText("Buy Parts");

        linear_filters = (LinearLayout) findViewById(R.id.linear_filters);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        beanClassForBuyPartsFilters = new ArrayList<>();


        for (int i = 0; i < image.length; i++) {
            BeanClassForBuyPartsFilter beanClassForCar_clubs = new BeanClassForBuyPartsFilter(image[i], name[i], subname[i], discount_price[i],
                    price[i], discount[i]);

            beanClassForBuyPartsFilters.add(beanClassForCar_clubs);
        }


        mAdapter = new RecycleAdapter_BuyPartFilter(BuyPartsFilterActivity.this, beanClassForBuyPartsFilters);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(BuyPartsFilterActivity.this, 2);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        linear_filters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(BuyPartsFilterActivity.this,FilterCategoryActivity.class);
                startActivity(i);

            }
        });



    }
}
