package fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import Adapter.BrandNameAdapter;

import ModelClass.BeanClassForBrandName;
import com.design.PyMe.R;

/**
 * Created by praja on 19-06-17.
 */

public class BrandNameFragment extends Fragment {


    public Context mContext;
    private RecyclerView brand_name_recycleview;
    private BrandNameAdapter brandNameAdapter;
    private ArrayList<BeanClassForBrandName> brandNameArrayList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_brand_name, container, false);


        brand_name_recycleview = (RecyclerView) view.findViewById(R.id.brand_name_recycleview);


        brandNameArrayList = new ArrayList<>();

        brandNameArrayList.add(new BeanClassForBrandName("BMW"));
        brandNameArrayList.add(new BeanClassForBrandName("Jaguar"));
        brandNameArrayList.add(new BeanClassForBrandName("Toyoto"));
        brandNameArrayList.add(new BeanClassForBrandName("Audi"));
        brandNameArrayList.add(new BeanClassForBrandName("Celio"));
        brandNameArrayList.add(new BeanClassForBrandName("Gant"));
        brandNameArrayList.add(new BeanClassForBrandName("Maruti"));
        brandNameArrayList.add(new BeanClassForBrandName("Toyoto"));
        brandNameArrayList.add(new BeanClassForBrandName("Audi"));
        brandNameArrayList.add(new BeanClassForBrandName("Celio"));


        brandNameAdapter = new BrandNameAdapter(brandNameArrayList, mContext);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        brand_name_recycleview.setLayoutManager(layoutManager);
        brand_name_recycleview.setAdapter(brandNameAdapter);
        return view;

    }
}
