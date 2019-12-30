package com.design.PyMe;

import android.graphics.Typeface;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import Adapter.Spinner_DataAdapter;
import ModelClass.ItemData;

public class AddressActivity extends AppCompatActivity {

    TextView title;
    RadioButton rb_office, rb_home, rb_other;
    Spinner sp1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);

        title = findViewById(R.id.title);
        title.setText("Address");


        rb_office = (RadioButton) findViewById(R.id.rb_office);
        rb_home = (RadioButton) findViewById(R.id.rb_home);
        rb_other = (RadioButton) findViewById(R.id.rb_other);


        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner_state);

        Typeface font = Typeface.createFromAsset(AddressActivity.this.getAssets(), "fonts/OpenSans-Regular.ttf");

        rb_office.setText("Office");
        rb_home.setText("Home");
        rb_other.setText("Other");

        rb_office.setTypeface(font);
        rb_home.setTypeface(font);
        rb_other.setTypeface(font);


        ArrayList<ItemData> list = new ArrayList<>();


        list.add(new ItemData("City*"));
        list.add(new ItemData("Ahmedabad"));
        list.add(new ItemData("Vadodara"));
        list.add(new ItemData("Surat"));
        list.add(new ItemData("Rajkot"));

        Spinner sp = (Spinner) findViewById(R.id.spinner_city);
        Spinner_DataAdapter adapter = new Spinner_DataAdapter(AddressActivity.this, R.layout.spinner_list, R.id.data, list);
        sp.setAdapter(adapter);


        ArrayList<ItemData> list1 = new ArrayList<>();


        list1.add(new ItemData("State*"));
        list1.add(new ItemData("Gujarat"));
        list1.add(new ItemData("Maharashtra"));
        list1.add(new ItemData("Bihar"));
        list1.add(new ItemData("Goa"));
        Spinner sp1 = (Spinner) findViewById(R.id.spinner_state);
        Spinner_DataAdapter adapter1 = new Spinner_DataAdapter(this, R.layout.spinner_list, R.id.data, list1);
        sp1.setAdapter(adapter1);
        spinner1.setAdapter(adapter1);


        rb_office.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                rb_office.setChecked(true);
                rb_home.setChecked(false);
                rb_other.setChecked(false);

            }
        });

        rb_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                rb_office.setChecked(false);
                rb_home.setChecked(true);
                rb_other.setChecked(false);

            }
        });

        rb_other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                rb_office.setChecked(false);
                rb_home.setChecked(false);
                rb_other.setChecked(true);

            }
        });
    }
}
