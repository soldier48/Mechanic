package com.design.PyMe;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

import Adapter.RecycleAdapter_Car_Parts;
import ModelClass.BeanClassForCarParts;

public class BuyPartsCarActivity extends AppCompatActivity {

    TextView title1;

    private int image[] = {R.drawable.engine, R.drawable.transmission, R.drawable.ac, R.drawable.lights, R.drawable.brakes,
            R.drawable.interior, R.drawable.engine, R.drawable.transmission, R.drawable.ac, R.drawable.lights, R.drawable.brakes,
            R.drawable.interior, R.drawable.engine, R.drawable.transmission, R.drawable.ac, R.drawable.lights, R.drawable.brakes,
            R.drawable.interior};

    private String title[] = {"Engine", "Transmission", "AC/Heater", "Light Parts", "Breaks", "Interior", "Engine",
            "Transmission", "AC/Heater", "Light Parts", "Breaks", "Interior",
            "Engine", "Transmission", "AC/Heater", "Light Parts", "Breaks", "Interior"};


    private ArrayList<BeanClassForCarParts> beanClassForCarPartses;

    private RecyclerView recyclerView;
    private RecycleAdapter_Car_Parts mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_parts_car);

        title1 = findViewById(R.id.title);
        title1.setText("Buy Parts");

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        beanClassForCarPartses = new ArrayList<>();


        for (int i = 0; i < image.length; i++) {
            BeanClassForCarParts beanClassForCar_clubs = new BeanClassForCarParts(image[i], title[i]);

            beanClassForCarPartses.add(beanClassForCar_clubs);
        }


        mAdapter = new RecycleAdapter_Car_Parts(BuyPartsCarActivity.this, beanClassForCarPartses);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(BuyPartsCarActivity.this, 3);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
    }
}
