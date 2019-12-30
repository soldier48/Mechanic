package com.design.PyMe;

import android.app.DatePickerDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import Adapter.RecycleAdapter_Upload_Image;
import ModelClass.BeanClassForImage;

public class AddCarDetailActivity extends AppCompatActivity implements  View.OnTouchListener{

    TextView title;

    RecyclerView upload_recycleview;
    RecycleAdapter_Upload_Image adapter_upload_image;
    Spinner sp_year, sp_manufacturer, sp_car_model, sp_transmission, sp_register_year, sp_fuel, sp_color, sp_accident, sp_insuarance_provider, sp_policy;
    EditText edt_reg_number,date,edt_odometer;
    private int mMonth, mYear, mDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_car_detail);

        title = findViewById(R.id.title);
        title.setText("Add Car");

        sp_year = (Spinner) findViewById(R.id.sp_year);
        sp_manufacturer = (Spinner) findViewById(R.id.sp_manufacturer);
        sp_car_model = (Spinner) findViewById(R.id.sp_car_model);
        sp_transmission = (Spinner) findViewById(R.id.sp_transmission);
        sp_register_year = (Spinner) findViewById(R.id.sp_register_year);
        sp_fuel = (Spinner) findViewById(R.id.sp_fuel);
        sp_color = (Spinner) findViewById(R.id.sp_color);
        sp_accident = (Spinner) findViewById(R.id.sp_accident);
        sp_insuarance_provider = (Spinner) findViewById(R.id.sp_insuarance_provider);
        sp_policy = (Spinner) findViewById(R.id.sp_policy);

        date = (EditText) findViewById(R.id.date);
        edt_odometer = (EditText) findViewById(R.id.edt_odometer);


        sp_year.setOnTouchListener(this);
        sp_manufacturer.setOnTouchListener(this);
        sp_car_model.setOnTouchListener(this);
        sp_transmission.setOnTouchListener(this);
        sp_register_year.setOnTouchListener(this);
        sp_fuel.setOnTouchListener(this);
        sp_color.setOnTouchListener(this);
        sp_accident.setOnTouchListener(this);
        sp_insuarance_provider.setOnTouchListener(this);


        sp_policy.setOnTouchListener(this);
        edt_odometer.setOnTouchListener(this);


        upload_recycleview = (RecyclerView) findViewById(R.id.upload_recycleview);


        BeanClassForImage classForImages[] = {

                new BeanClassForImage(R.drawable.car_img1),
                new BeanClassForImage(R.drawable.car_img1),

        };


        adapter_upload_image = new RecycleAdapter_Upload_Image(classForImages, AddCarDetailActivity.this);
        upload_recycleview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        upload_recycleview.setAdapter(adapter_upload_image);


        List<String> list = new ArrayList<String>();
        list.add("Select");
        list.add("2017");
        list.add("2016");
        list.add("2014");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinner_item, R.id.spinner_text, list);
        sp_year.setAdapter(dataAdapter);


        List<String> list1 = new ArrayList<String>();
        list1.add("Select ");
        list1.add("BMW ");
        list1.add("BMW ");
        list1.add("BMW ");

        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this, R.layout.spinner_item, R.id.spinner_text, list1);
        sp_manufacturer.setAdapter(dataAdapter1);


        List<String> list2 = new ArrayList<String>();
        list2.add("Select ");
        list2.add("BMW D800 ");
        list2.add("BMW D800 ");
        list2.add("BMW D800 ");

        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, R.layout.spinner_item, R.id.spinner_text, list2);
        sp_car_model.setAdapter(dataAdapter2);

        List<String> list3 = new ArrayList<String>();
        list3.add("Select");
        list3.add("6");
        list3.add("6");
        list3.add("6");


        ArrayAdapter<String> dataAdapter3 = new ArrayAdapter<String>(this, R.layout.spinner_item, R.id.spinner_text, list3);
        sp_transmission.setAdapter(dataAdapter3);

        List<String> list4 = new ArrayList<String>();
        list4.add("Select");
        list4.add("Auto");
        list4.add("Auto");
        list4.add("Auto");

        ArrayAdapter<String> dataAdapter4 = new ArrayAdapter<String>(this, R.layout.spinner_item, R.id.spinner_text, list4);
        sp_register_year.setAdapter(dataAdapter4);

        List<String> list5 = new ArrayList<String>();
        list5.add("Select");
        list5.add("Petrol");
        list5.add("Disel");
        list5.add("CNG");

        ArrayAdapter<String> dataAdapter5 = new ArrayAdapter<String>(this, R.layout.spinner_item, R.id.spinner_text, list5);
        sp_fuel.setAdapter(dataAdapter5);

        List<String> list6 = new ArrayList<String>();
        list6.add("Select");
        list6.add("Orange");
        list6.add("Orange");
        list6.add("Orange");
        list6.add("Orange");


        ArrayAdapter<String> dataAdapter6 = new ArrayAdapter<String>(this, R.layout.spinner_item, R.id.spinner_text, list6);
        sp_color.setAdapter(dataAdapter6);

        List<String> list7 = new ArrayList<String>();
        list7.add("Select");
        list7.add("Yes");
        list7.add("No");


        ArrayAdapter<String> dataAdapter7 = new ArrayAdapter<String>(this, R.layout.spinner_item, R.id.spinner_text, list7);
        sp_accident.setAdapter(dataAdapter7);


        List<String> list8 = new ArrayList<String>();
        list8.add("Select");
        list8.add("Reliance");
        list8.add("Reliance");
        list8.add("Reliance");
        list8.add("Reliance");
        list8.add("Reliance");



        ArrayAdapter<String> dataAdapter8 = new ArrayAdapter<String>(this, R.layout.spinner_item, R.id.spinner_text, list8);
        sp_insuarance_provider.setAdapter(dataAdapter8);

        List<String> list9 = new ArrayList<String>();
        list9.add("Select");
        list9.add("policy1");
        list9.add("policy1");
        list9.add("policy1");
        list9.add("policy1");


        ArrayAdapter<String> dataAdapter9 = new ArrayAdapter<String>(this, R.layout.spinner_item, R.id.spinner_text, list8);
        sp_policy.setAdapter(dataAdapter9);



        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Calendar c = Calendar.getInstance();
                mYear = c.get(Calendar.YEAR);
                mMonth = c.get(Calendar.MONTH);
                mDay = c.get(Calendar.DAY_OF_MONTH);
                final DatePickerDialog datePickerDialog = new DatePickerDialog(AddCarDetailActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                date.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis() - 1000);
                datePickerDialog.show();
                int coMonth = c.get(Calendar.MONTH);
                int coDay = c.get(Calendar.DAY_OF_MONTH);

                date.setBackground(getDrawable(R.drawable.green_round_border));
                date.setPadding(44,0,0,0);
            }
        });


    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {

        switch (view.getId()) {

            case R.id.edt_reg_number:

                edt_reg_number.setBackground(getDrawable(R.drawable.green_round_border));
                edt_reg_number.setPadding(44, 0, 0, 0);
                break;


            case R.id.sp_year:

                sp_year.setBackground(getDrawable(R.drawable.green_round_border));
                break;

            case R.id.sp_manufacturer:

                sp_manufacturer.setBackground(getDrawable(R.drawable.green_round_border));

                break;

            case R.id.sp_car_model:

                sp_car_model.setBackground(getDrawable(R.drawable.green_round_border));

                break;


            case R.id.sp_transmission:

                sp_transmission.setBackground(getDrawable(R.drawable.green_round_border));

                break;


            case R.id.sp_register_year:

                sp_register_year.setBackground(getDrawable(R.drawable.green_round_border));

                break;


            case R.id.sp_fuel:

                sp_fuel.setBackground(getDrawable(R.drawable.green_round_border));

                break;


            case R.id.sp_color:

                sp_color.setBackground(getDrawable(R.drawable.green_round_border));

                break;


            case R.id.sp_accident:

                sp_accident.setBackground(getDrawable(R.drawable.green_round_border));

                break;


            case R.id.sp_insuarance_provider:

                sp_insuarance_provider.setBackground(getDrawable(R.drawable.green_round_border));

                break;


            case R.id.sp_policy:

                sp_policy.setBackground(getDrawable(R.drawable.green_round_border));

                break;

            case R.id.edt_odometer:

                edt_odometer.setBackground(getDrawable(R.drawable.green_round_border));

                break;



        }
        return false;
    }
}
