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
public class Fragment_Add_Cart2 extends Fragment {

    private View view;

    Spinner sp_yom,sp_miles;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_add_car2, container, false);
        sp_yom = (Spinner)view.findViewById(R.id.sp_yom);
        sp_miles = (Spinner)view.findViewById(R.id.sp_miles);

        List<String> list = new ArrayList<String>();
        list.add("2016");
        list.add("2012");
        list.add("2015");
        list.add("2017");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(), R.layout.spinner_item, R.id.spinner_text, list);
        sp_yom.setAdapter(dataAdapter);


        List<String> list1 = new ArrayList<String>();
        list1.add("Miles");
        list1.add("Miles");
        list1.add("Miles");
        list1.add("Miles");


        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<String>(getActivity(), R.layout.spinner_item, R.id.spinner_text, list);
        sp_miles.setAdapter(dataAdapter1);



        return view;

    }
    }
