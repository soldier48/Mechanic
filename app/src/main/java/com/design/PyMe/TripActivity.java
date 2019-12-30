package com.design.PyMe;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

import Adapter.RecycleAdapter_Trips;
import ModelClass.BeanClassForTrips;

public class TripActivity extends AppCompatActivity {

    TextView title;

    private String from[]  = {"India","Kenya","Dubai"};
    private String destination[] = {"Saudi","Canada","Africa"};


    private ArrayList<BeanClassForTrips> beanClassForTripses;

    private RecyclerView recyclerView;
    private RecycleAdapter_Trips mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip);

        title = findViewById(R.id.title);
        title.setText("Trip");

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        beanClassForTripses = new ArrayList<>();


        for (int i = 0; i < from.length; i++) {
            BeanClassForTrips beanClassForCar_clubs = new BeanClassForTrips(from[i],destination[i]);

            beanClassForTripses.add(beanClassForCar_clubs);
        }


        mAdapter = new RecycleAdapter_Trips(TripActivity.this,beanClassForTripses);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(TripActivity.this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
    }
}
