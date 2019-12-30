package com.design.PyMe;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import Adapter.RecycleAdapter_My_Listings;
import ModelClass.BeanClassForListings;

public class MyListingActivity extends AppCompatActivity {

    TextView title;

    RecyclerView listing_recyclerview;
    RecycleAdapter_My_Listings adapter_my_listings;
    LinearLayout linear_add_car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_listing);

        title = findViewById(R.id.title);
        title.setText("My Listing");


        listing_recyclerview = (RecyclerView) findViewById(R.id.listing_recyclerview);
        linear_add_car = (LinearLayout) findViewById(R.id.linear_add_car);


        BeanClassForListings listingses[] = {

                new BeanClassForListings("Challenger RT"),
                new BeanClassForListings("Challenger RT"),

        };


        adapter_my_listings = new RecycleAdapter_My_Listings(listingses, MyListingActivity.this);
        listing_recyclerview.setLayoutManager(new LinearLayoutManager(this));
        listing_recyclerview.setAdapter(adapter_my_listings);

        linear_add_car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MyListingActivity.this, AddCarDetailActivity.class);
                startActivity(i);

            }
        });


    }
}
