package com.design.PyMe;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

import Adapter.RecycleAdapter_Cart;
import ModelClass.BeanClassForCart;

public class CartActivity extends AppCompatActivity {

    TextView title;

    private int image[] = {R.drawable.guide};


    private ArrayList<BeanClassForCart> beanClassForCarts;

    private RecyclerView recyclerView;
    private RecycleAdapter_Cart mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        title = findViewById(R.id.title);
        title.setText("Cart");


        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        beanClassForCarts = new ArrayList<>();


        for (int i = 0; i < image.length; i++) {
            BeanClassForCart beanClassForCar_clubs = new BeanClassForCart(image[i]);

            beanClassForCarts.add(beanClassForCar_clubs);
        }


        mAdapter = new RecycleAdapter_Cart(CartActivity.this, beanClassForCarts);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(CartActivity.this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
    }
}
