package com.design.PyMe;

import android.app.Dialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RadioButton;

import java.util.ArrayList;

import Adapter.BuySellGridAdapter;
import ModelClass.BeanClassForBuySellData;

public class BuySellActivity extends AppCompatActivity {


    GridView buysell_gridview;
    Dialog slideDialog;
    ImageView img_sort_by1;
    RadioButton radio1, radio2, radio3, radio4;
    private ArrayList<BeanClassForBuySellData> buySellDataArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_sell);


        img_sort_by1 = (ImageView) findViewById(R.id.img_sort_by1);


        buySellDataArrayList = new ArrayList<>();
        buySellDataArrayList.add(new BeanClassForBuySellData("Challenger RT"));
        buySellDataArrayList.add(new BeanClassForBuySellData("Challenger RT"));
        buySellDataArrayList.add(new BeanClassForBuySellData("Challenger RT"));
        buySellDataArrayList.add(new BeanClassForBuySellData("Challenger RT"));
        buySellDataArrayList.add(new BeanClassForBuySellData("Challenger RT"));
        buySellDataArrayList.add(new BeanClassForBuySellData("Challenger RT"));
        buySellDataArrayList.add(new BeanClassForBuySellData("Challenger RT"));
        buySellDataArrayList.add(new BeanClassForBuySellData("Challenger RT"));


        final BuySellGridAdapter buySellGridAdapter = new BuySellGridAdapter(BuySellActivity.this, buySellDataArrayList);
        buysell_gridview = (GridView) findViewById(R.id.buysell_gridview);
        buysell_gridview.setAdapter(buySellGridAdapter);


        img_sort_by1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                slideDialog = new Dialog(BuySellActivity.this, R.style.CustomDialogAnimation);
                slideDialog.setContentView(R.layout.activity_buy_sell__sort_by);

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
