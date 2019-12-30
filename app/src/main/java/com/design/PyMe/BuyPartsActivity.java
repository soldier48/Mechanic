package com.design.PyMe;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class BuyPartsActivity extends AppCompatActivity implements  View.OnTouchListener {

    Spinner sp_car_maker, sp_model_line, sp_year, sp_modification;


    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_parts);

        title = findViewById(R.id.title);
        title.setText("Buy Parts");

        sp_car_maker = (Spinner) findViewById(R.id.sp_car_maker);
        sp_model_line = (Spinner) findViewById(R.id.sp_model_line);
        sp_year = (Spinner) findViewById(R.id.sp_year);
        sp_modification = (Spinner) findViewById(R.id.sp_modification);


        sp_car_maker.setOnTouchListener(this);
        sp_model_line.setOnTouchListener(this);
        sp_year.setOnTouchListener(this);
        sp_modification.setOnTouchListener(this);




        List<String> list = new ArrayList<String>();
        list.add("Select");
        list.add("2017");
        list.add("2016");
        list.add("2014");
        list.add("2014");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinner_item, R.id.spinner_text, list);
        sp_year.setAdapter(dataAdapter);


        List<String> list1 = new ArrayList<String>();
        list1.add("Select");
        list1.add("Audi");
        list1.add("BMW");
        list1.add("Audi");
        list1.add("BMW");

        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this, R.layout.spinner_item, R.id.spinner_text, list);
        sp_car_maker.setAdapter(dataAdapter1);


        List<String> list2 = new ArrayList<String>();
        list2.add("Select");
        list2.add("A3");
        list2.add("A6");
        list2.add("Q6");
        list2.add("A3");


        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, R.layout.spinner_item, R.id.spinner_text, list2);
        sp_model_line.setAdapter(dataAdapter2);


        List<String> list3 = new ArrayList<String>();
        list3.add("Select");
        list3.add("1.6/L Petrol");
        list3.add("1.6/L Petrol");
        list3.add("1.6/L Petrol");
        list3.add("1.6/L Petrol");


        ArrayAdapter<String> dataAdapter3 = new ArrayAdapter<String>(this, R.layout.spinner_item, R.id.spinner_text, list3);
        sp_modification.setAdapter(dataAdapter3);


    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {


        switch (view.getId()) {

            case R.id.sp_car_maker:

                sp_car_maker.setBackground(getDrawable(R.drawable.green_round_border));
                break;

            case R.id.sp_model_line:

                sp_model_line.setBackground(getDrawable(R.drawable.green_round_border));
                break;

            case R.id.sp_year:

                sp_year.setBackground(getDrawable(R.drawable.green_round_border));

                break;

            case R.id.sp_modification:

                sp_modification.setBackground(getDrawable(R.drawable.green_round_border));

                break;
        }
        return false;

    }
}
