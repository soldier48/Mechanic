package com.design.PyMe;

import android.app.Fragment;
import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import fragment.BrandNameFragment;

public class FilterCategoryActivity extends AppCompatActivity implements View.OnClickListener{


    TextView title;

    TextView brand_name;
    ImageView right_arrow, model_right_arrow, price_right_arrow, discount_right_arrow, categories_right_arrow;
    LinearLayout lineaar_brand, Linear_model, linear_price, linear_discount, linear_categories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_category);

        title = findViewById(R.id.title);
        title.setText("Filter");

        brand_name = (TextView) findViewById(R.id.brand_name);
        lineaar_brand = (LinearLayout) findViewById(R.id.lineaar_brand);
        Linear_model = (LinearLayout) findViewById(R.id.Linear_model);
        linear_price = (LinearLayout) findViewById(R.id.linear_price);
        linear_discount = (LinearLayout) findViewById(R.id.linear_discount);
        linear_categories = (LinearLayout) findViewById(R.id.linear_categories);


        right_arrow = (ImageView) findViewById(R.id.right_arrow);
        model_right_arrow = (ImageView) findViewById(R.id.model_right_arrow);
        price_right_arrow = (ImageView) findViewById(R.id.price_right_arrow);
        discount_right_arrow = (ImageView) findViewById(R.id.discount_right_arrow);
        categories_right_arrow = (ImageView) findViewById(R.id.categories_right_arrow);


        lineaar_brand.setOnClickListener(this);
        Linear_model.setOnClickListener(this);
        linear_price.setOnClickListener(this);
        linear_discount.setOnClickListener(this);
        linear_categories.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.lineaar_brand:

                lineaar_brand.setBackgroundColor(Color.parseColor("#FFFFFF"));
                right_arrow.setVisibility(View.VISIBLE);


                android.app.FragmentManager fm = getFragmentManager();
                android.app.FragmentTransaction fragmentTransaction = fm.beginTransaction();

                Fragment brandNameFragment = new BrandNameFragment();
                fragmentTransaction.replace(R.id.fragment, brandNameFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();


                Linear_model.setBackgroundColor(Color.parseColor("#f6f6f6"));
                model_right_arrow.setVisibility(View.GONE);

                linear_price.setBackgroundColor(Color.parseColor("#f6f6f6"));
                price_right_arrow.setVisibility(View.GONE);

                linear_discount.setBackgroundColor(Color.parseColor("#f6f6f6"));
                discount_right_arrow.setVisibility(View.GONE);

                linear_categories.setBackgroundColor(Color.parseColor("#f6f6f6"));
                categories_right_arrow.setVisibility(View.GONE);

                break;

            case R.id.Linear_model:

                Linear_model.setBackgroundColor(Color.parseColor("#FFFFFF"));
                model_right_arrow.setVisibility(View.VISIBLE);
                android.app.FragmentManager fm1 = getFragmentManager();
                android.app.FragmentTransaction fragmentTransaction1 = fm1.beginTransaction();

                Fragment brandNameFragment1 = new BrandNameFragment();
                fragmentTransaction1.replace(R.id.fragment, brandNameFragment1);
                fragmentTransaction1.addToBackStack(null);
                fragmentTransaction1.commit();


                lineaar_brand.setBackgroundColor(Color.parseColor("#f6f6f6"));
                right_arrow.setVisibility(View.GONE);

                linear_price.setBackgroundColor(Color.parseColor("#f6f6f6"));
                price_right_arrow.setVisibility(View.GONE);

                linear_discount.setBackgroundColor(Color.parseColor("#f6f6f6"));
                discount_right_arrow.setVisibility(View.GONE);

                linear_categories.setBackgroundColor(Color.parseColor("#f6f6f6"));
                categories_right_arrow.setVisibility(View.GONE);


                break;


            case R.id.linear_price:

                linear_price.setBackgroundColor(Color.parseColor("#FFFFFF"));
                price_right_arrow.setVisibility(View.VISIBLE);


                android.app.FragmentManager fm12 = getFragmentManager();
                android.app.FragmentTransaction fragmentTransaction12 = fm12.beginTransaction();

                Fragment priceFragment = new PriceFragment();
                fragmentTransaction12.replace(R.id.fragment, priceFragment);
                fragmentTransaction12.addToBackStack(null);
                fragmentTransaction12.commit();

                lineaar_brand.setBackgroundColor(Color.parseColor("#f6f6f6"));
                right_arrow.setVisibility(View.GONE);

                Linear_model.setBackgroundColor(Color.parseColor("#f6f6f6"));
                model_right_arrow.setVisibility(View.GONE);

                linear_discount.setBackgroundColor(Color.parseColor("#f6f6f6"));
                discount_right_arrow.setVisibility(View.GONE);

                linear_categories.setBackgroundColor(Color.parseColor("#f6f6f6"));
                categories_right_arrow.setVisibility(View.GONE);


                break;

            case R.id.linear_discount:

                linear_discount.setBackgroundColor(Color.parseColor("#FFFFFF"));
                discount_right_arrow.setVisibility(View.VISIBLE);
                android.app.FragmentManager fm2 = getFragmentManager();
                android.app.FragmentTransaction fragmentTransaction2 = fm2.beginTransaction();

                Fragment brandNameFragment2 = new BrandNameFragment();
                fragmentTransaction2.replace(R.id.fragment, brandNameFragment2);
                fragmentTransaction2.addToBackStack(null);
                fragmentTransaction2.commit();


                lineaar_brand.setBackgroundColor(Color.parseColor("#f6f6f6"));
                right_arrow.setVisibility(View.GONE);

                Linear_model.setBackgroundColor(Color.parseColor("#f6f6f6"));
                model_right_arrow.setVisibility(View.GONE);

                linear_price.setBackgroundColor(Color.parseColor("#f6f6f6"));
                price_right_arrow.setVisibility(View.GONE);

                linear_categories.setBackgroundColor(Color.parseColor("#f6f6f6"));
                categories_right_arrow.setVisibility(View.GONE);


                break;


            case R.id.linear_categories:

                linear_categories.setBackgroundColor(Color.parseColor("#FFFFFF"));
                categories_right_arrow.setVisibility(View.VISIBLE);
                android.app.FragmentManager fm3 = getFragmentManager();
                android.app.FragmentTransaction fragmentTransaction3 = fm3.beginTransaction();

                Fragment brandNameFragment3 = new BrandNameFragment();
                fragmentTransaction3.replace(R.id.fragment, brandNameFragment3);
                fragmentTransaction3.addToBackStack(null);
                fragmentTransaction3.commit();


                lineaar_brand.setBackgroundColor(Color.parseColor("#f6f6f6"));
                right_arrow.setVisibility(View.GONE);

                Linear_model.setBackgroundColor(Color.parseColor("#f6f6f6"));
                model_right_arrow.setVisibility(View.GONE);

                linear_price.setBackgroundColor(Color.parseColor("#f6f6f6"));
                price_right_arrow.setVisibility(View.GONE);

                linear_discount.setBackgroundColor(Color.parseColor("#f6f6f6"));
                discount_right_arrow.setVisibility(View.GONE);


                break;

        }

    }
}
