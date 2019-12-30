package fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;



import java.util.ArrayList;
import java.util.List;

import com.design.PyMe.R;

/**
 * Created by Rp on 8/30/2016.
 */
public class Fragment_Add_Cart1 extends Fragment {

    private View view;

    Spinner sp_car_name,sp_car_model;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_add_car1, container, false);

        sp_car_name = (Spinner)view.findViewById(R.id.sp_car_name);
        sp_car_model = (Spinner)view.findViewById(R.id.sp_car_model);

        List<String> list = new ArrayList<String>();
        list.add("Mercedes ");
        list.add("Innova ");
        list.add("Qualis");
        list.add("i20");
        list.add("i10");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(), R.layout.spinner_item, R.id.spinner_text, list);
        sp_car_name.setAdapter(dataAdapter);


        List<String> list1 = new ArrayList<String>();
        list1.add("C200");
        list1.add("C200");
        list1.add("C200");
        list1.add("C200");
        list1.add("C200");


        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(getActivity(), R.layout.spinner_item, R.id.spinner_text, list);
        sp_car_model.setAdapter(dataAdapter1);



        return view;

    }
    }
