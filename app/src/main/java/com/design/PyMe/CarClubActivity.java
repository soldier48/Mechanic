package com.design.PyMe;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

import Adapter.RecycleAdapter_Car_Clubs;
import ModelClass.BeanClassForCar_clubs;

public class CarClubActivity extends AppCompatActivity {

    TextView title;

    private int logo_symbole[] = {R.drawable.ic_jaguar_symbol,R.drawable.ic_jaguar_symbol,R.drawable.ic_jaguar_symbol,
            R.drawable.ic_jaguar_symbol,R.drawable.ic_jaguar_symbol,R.drawable.ic_jaguar_symbol,R.drawable.ic_jaguar_symbol};
    private String member[] = {"42 Members","33 Members","53 Members","52 Members","22 Members","20 Members","12 Members"};
    private String brand_name[] = {"Jaguar","Mitsubishi","Jaguar","Mitsubishi","Jaguar","Mitsubishi","Jaguar"};
    private int car_image[] = {R.drawable.yellow_audi,R.drawable.yellow_audi,R.drawable.yellow_audi,
            R.drawable.yellow_audi,R.drawable.yellow_audi,R.drawable.yellow_audi,R.drawable.yellow_audi};

    private ArrayList<BeanClassForCar_clubs> beanClassForCar_clubses;

    private RecyclerView recyclerView;
    private RecycleAdapter_Car_Clubs mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_club);

        title = findViewById(R.id.title);
        title.setText("Car Club");


        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        beanClassForCar_clubses = new ArrayList<>();



        for (int i = 0; i < logo_symbole.length; i++) {
            BeanClassForCar_clubs beanClassForRecyclerView_contacts = new BeanClassForCar_clubs(logo_symbole[i],brand_name[i],member[i],car_image[i]);

            beanClassForCar_clubses.add(beanClassForRecyclerView_contacts);
        }


        mAdapter = new RecycleAdapter_Car_Clubs(CarClubActivity.this,beanClassForCar_clubses);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(CarClubActivity.this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
    }
}
