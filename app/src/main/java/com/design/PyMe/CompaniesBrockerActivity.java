package com.design.PyMe;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import Adapter.RecycleAdapter_Brokers_list;
import Adapter.RecycleAdapter_Companies_list;
import ModelClass.BeanClassForBrokersList;
import ModelClass.BeanClassForCompaniesList;

public class CompaniesBrockerActivity extends AppCompatActivity {

    Context mContext;
    RadioButton radio1, radio2, radio3, radio4;
    Dialog slideDialog;
    ImageView img_sort_by;
    TextView txt_companies, txt_brokers;
    Toolbar toolbar;
    private RecyclerView companies_recycleview, brokers_recycleview;
    private RecycleAdapter_Companies_list adapterCompaniesList;
    private RecycleAdapter_Brokers_list adapter_brokers_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_companies_brocker);

        txt_companies = (TextView) findViewById(R.id.txt_companies);
        txt_brokers = (TextView) findViewById(R.id.txt_brokers);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        img_sort_by = (ImageView) findViewById(R.id.img_sort_by);


        companies_recycleview = (RecyclerView) findViewById(R.id.companies_recycleview);
        brokers_recycleview = (RecyclerView) findViewById(R.id.brokers_recycleview);


        BeanClassForCompaniesList companiesLists[] = {

                new BeanClassForCompaniesList(R.drawable.elephant),
                new BeanClassForCompaniesList(R.drawable.aviva1),
                new BeanClassForCompaniesList(R.drawable.reliance_insurance1),
                new BeanClassForCompaniesList(R.drawable.elephant),
                new BeanClassForCompaniesList(R.drawable.aviva1),
                new BeanClassForCompaniesList(R.drawable.reliance_insurance1)


        };


        adapterCompaniesList = new RecycleAdapter_Companies_list(companiesLists, CompaniesBrockerActivity.this);
        companies_recycleview.setLayoutManager(new LinearLayoutManager(this));
        companies_recycleview.setAdapter(adapterCompaniesList);


        BeanClassForBrokersList brokersLists[] = {

                new BeanClassForBrokersList("Federico Homes", R.drawable.natural),
                new BeanClassForBrokersList("Jhone Key", R.drawable.img2),
                new BeanClassForBrokersList("Federico Homes", R.drawable.img3),
                new BeanClassForBrokersList("Federico Homes", R.drawable.img1),
                new BeanClassForBrokersList("Jhone Key", R.drawable.img2),
                new BeanClassForBrokersList("Federico Homes", R.drawable.img3)


        };


        adapter_brokers_list = new RecycleAdapter_Brokers_list(brokersLists, CompaniesBrockerActivity.this);
        brokers_recycleview.setLayoutManager(new LinearLayoutManager(this));
        brokers_recycleview.setAdapter(adapter_brokers_list);


        txt_companies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txt_companies.setBackground(getDrawable(R.drawable.left_fill_half_round1));
                txt_companies.setTextColor(Color.parseColor("#FFFFFF"));
                brokers_recycleview.setVisibility(View.GONE);
                companies_recycleview.setVisibility(View.VISIBLE);
                txt_brokers.setBackground(getDrawable(R.drawable.right_half_round1));
                txt_brokers.setTextColor(Color.parseColor("#3498DB"));


            }
        });

        txt_brokers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_brokers.setBackground(getDrawable(R.drawable.right_fill_half_round1));
                txt_brokers.setTextColor(Color.parseColor("#FFFFFF"));
                brokers_recycleview.setVisibility(View.VISIBLE);
                companies_recycleview.setVisibility(View.GONE);
                txt_companies.setBackground(getDrawable(R.drawable.left_half_round1));
                txt_companies.setTextColor(Color.parseColor("#3498DB"));


            }
        });


        img_sort_by.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                slideDialog = new Dialog(CompaniesBrockerActivity.this, R.style.CustomDialogAnimation);
                slideDialog.setContentView(R.layout.activity_car_insuarance_sort_by);

                radio1 = (RadioButton) slideDialog.findViewById(R.id.radio11);
                radio2 = (RadioButton) slideDialog.findViewById(R.id.radio12);
                radio3 = (RadioButton) slideDialog.findViewById(R.id.radio13);
                radio4 = (RadioButton) slideDialog.findViewById(R.id.radio14);

                radio1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        radio1.setChecked(true);
                        radio2.setChecked(false);
                        radio3.setChecked(false);
                        radio4.setChecked(false);

                    }
                });

                radio2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        radio1.setChecked(false);
                        radio2.setChecked(true);
                        radio3.setChecked(false);
                        radio4.setChecked(false);

                    }
                });

                radio3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        radio1.setChecked(false);
                        radio2.setChecked(false);
                        radio3.setChecked(true);
                        radio4.setChecked(false);

                    }
                });


                radio4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        radio1.setChecked(false);
                        radio2.setChecked(false);
                        radio3.setChecked(false);
                        radio4.setChecked(true);

                    }
                });


                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                slideDialog.getWindow().getAttributes().windowAnimations = R.style.CustomDialogAnimation;
                layoutParams.copyFrom(slideDialog.getWindow().getAttributes());

                int width = (int) (getResources().getDisplayMetrics().widthPixels * 0.90);
                int height = (int) (getResources().getDisplayMetrics().heightPixels * 0.30);

                layoutParams.width = WindowManager.LayoutParams.MATCH_PARENT;
                layoutParams.height = height;
                layoutParams.gravity = Gravity.BOTTOM;

                slideDialog.getWindow().setAttributes(layoutParams);
                slideDialog.setCancelable(true);
                slideDialog.setCanceledOnTouchOutside(true);
                slideDialog.show();

            }
        });
    }
}
