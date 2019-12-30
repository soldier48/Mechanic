package com.design.PyMe;

import android.app.DatePickerDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CarInsuranceActivity extends AppCompatActivity implements  View.OnTouchListener {

    TextView title;

    Spinner sp_manufacturer, sp_model, sp_year, sp_previous_insu, sp_policy_ex_date, sp_claimed;
    TextView date;
    private int mMonth, mYear, mDay;
    EditText edt_reg_number,edt_city;
    LinearLayout linear_manufacture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_insurance);

        title = findViewById(R.id.title);
        title.setText("Car Insurance");


        sp_manufacturer = (Spinner) findViewById(R.id.sp_manufacturer);
        sp_model = (Spinner) findViewById(R.id.sp_model);
        sp_year = (Spinner) findViewById(R.id.sp_year);
        sp_previous_insu = (Spinner) findViewById(R.id.sp_previous_insu);
        sp_claimed = (Spinner) findViewById(R.id.sp_claimed);

        linear_manufacture = (LinearLayout) findViewById(R.id.linear_manufacture);

        sp_manufacturer.setOnTouchListener(this);
        sp_model.setOnTouchListener(this);
        sp_year.setOnTouchListener(this);
        sp_previous_insu.setOnTouchListener(this);
        sp_claimed.setOnTouchListener(this);

        edt_reg_number = (EditText) findViewById(R.id.edt_reg_number);
        edt_reg_number.setOnTouchListener(this);

        edt_city = (EditText) findViewById(R.id.edt_city);
        edt_city.setOnTouchListener(this);

        date = (TextView) findViewById(R.id.date);

        edt_reg_number.setPadding(44,0,0,0);
        edt_city.setPadding(44,0,0,0);
        date.setPadding(44,0,0,0);



        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final Calendar c = Calendar.getInstance();
                mYear = c.get(Calendar.YEAR);
                mMonth = c.get(Calendar.MONTH);
                mDay = c.get(Calendar.DAY_OF_MONTH);
                final DatePickerDialog datePickerDialog = new DatePickerDialog(CarInsuranceActivity.this,
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


        List<String> list = new ArrayList<String>();
        list.add("Select ");
        list.add("BMW ");
        list.add("AUDI ");
        list.add("BMW ");
        list.add("AUDI ");
        list.add("BMW ");
        list.add("AUDI ");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.spinner_item, R.id.spinner_text, list);
        sp_manufacturer.setAdapter(dataAdapter);

        List<String> list1 = new ArrayList<String>();
        list1.add("Select");
        list1.add("800 - AC 4 SPEED (796 Cc");
        list1.add("800 - AC 4 SPEED (796 Cc");
        list1.add("800 - AC 4 SPEED (796 Cc");
        list1.add("800 - AC 4 SPEED (796 Cc");
        list1.add("800 - AC 4 SPEED (796 Cc");

        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(this, R.layout.spinner_item, R.id.spinner_text, list);
        sp_model.setAdapter(dataAdapter1);

        List<String> list2 = new ArrayList<String>();
        list2.add("Select");
        list2.add("2015");
        list2.add("2016");
        list2.add("2017");
        list2.add("2014");
        list2.add("2013");
        list2.add("2015");

        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, R.layout.spinner_item, R.id.spinner_text, list);
        sp_year.setAdapter(dataAdapter2);


        List<String> list3 = new ArrayList<String>();
        list3.add("SELECT");
        list3.add("ELEPHANT AUTO INSURANCE");
        list3.add("AVIVA INSURANCE");
        list3.add("RELIANCE GENERAL INSURANCE");
        list3.add("ELEPHANT AUTO INSURANCE");
        list3.add("AVIVA INSURANCE");
        list3.add("RELIANCE GENERAL INSURANCE");

        ArrayAdapter<String> dataAdapter3 = new ArrayAdapter<String>(this, R.layout.spinner_item, R.id.spinner_text, list);
        sp_previous_insu.setAdapter(dataAdapter3);


        List<String> list4 = new ArrayList<String>();
        list3.add("SELECT");
        list3.add("BAJAJ INSURANCE");
        list3.add("BAJAJ INSURANCE");
        list3.add("BAJAJ INSURANCE");
        list3.add("BAJAJ INSURANCE");

        ArrayAdapter<String> dataAdapter4 = new ArrayAdapter<String>(this, R.layout.spinner_item, R.id.spinner_text, list);
        sp_claimed.setAdapter(dataAdapter4);


    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {

        switch (view.getId()){

            case R.id.edt_reg_number:

                edt_reg_number.setBackground(getDrawable(R.drawable.green_round_border));
                edt_reg_number.setPadding(44,0,0,0);
                break;

            case R.id.edt_city:

                edt_city.setBackground(getDrawable(R.drawable.green_round_border));
                edt_city.setPadding(44,0,0,0);
                break;

            case R.id.sp_manufacturer:

                sp_manufacturer.setBackground(getDrawable(R.drawable.green_round_border));

                break;

            case R.id.sp_model:

                sp_model.setBackground(getDrawable(R.drawable.green_round_border));

                break;


            case R.id.sp_year:

                sp_year.setBackground(getDrawable(R.drawable.green_round_border));

                break;


            case R.id.sp_previous_insu:

                sp_previous_insu.setBackground(getDrawable(R.drawable.green_round_border));

                break;


            case R.id.sp_claimed:

                sp_claimed.setBackground(getDrawable(R.drawable.green_round_border));

                break;



        }

        return false;
    }
}
