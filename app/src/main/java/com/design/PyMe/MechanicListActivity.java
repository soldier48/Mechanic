package com.design.PyMe;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import Adapter.RecycleAdapterMechanicList;
import ModelClass.MechanicListModelClass;

public class MechanicListActivity extends AppCompatActivity {

    private ArrayList<MechanicListModelClass> mechanicListModelClasses;

    private RecyclerView recyclerView;
    private RecycleAdapterMechanicList mAdapter;


    private String Name[] = {"1. SignIn With Social","2. SignIn Activity","3. SignUp Activity","4. Add Mechanic Activity","5. Chat Activity",
    "6. Car Club Activity","7. Add Car Activity","8. Trip Activity","9. Mechanic Activity","10. Chat Messenger Activity","11 Car Profile Activity",
    "12 Rating Activity","13. Car Insurance Activity","14. CompaniesBrocker Activity","15. Bank Finance Activity","16. BuySell Activity","17. MyListing Activity",
    "18. BuyParts Activity","19. FilterCategory Activity","20. Buy Car Part Activity","21. BuyPartFilter Activity","22. Cart Activity","23. Address Activity",
    "24. Review Order Activity","25. Confirmation Activity","26. Order Activity","27. Order Detail Activity"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanic_list);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        mechanicListModelClasses = new ArrayList<>();



        for (int i = 0; i < Name.length; i++) {
            MechanicListModelClass beanClassForRecyclerView_contacts = new MechanicListModelClass(Name[i]);

            mechanicListModelClasses.add(beanClassForRecyclerView_contacts);
        }


        mAdapter = new RecycleAdapterMechanicList(MechanicListActivity.this,mechanicListModelClasses);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(MechanicListActivity.this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
    }
}
