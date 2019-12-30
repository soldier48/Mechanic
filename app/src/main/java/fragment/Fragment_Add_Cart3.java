
package fragment;

import android.app.DatePickerDialog;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;



import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.design.PyMe.R;

/**
 * Created by Rp on 8/30/2016.
 */
public class Fragment_Add_Cart3 extends Fragment {

    Spinner sp_insuarance;

    TextView checkin, checkout;
    private int mMonth, mYear, mDay;

    TextView txt_check_ino, txt_check_out;
    private View view;
    private Calendar myCalendar;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_add_car3, container, false);


        checkin = (TextView) view.findViewById(R.id.checkin);
        checkout = (TextView) view.findViewById(R.id.checkout);

        sp_insuarance = (Spinner)view.findViewById(R.id.sp_insuarance);

        List<String> list = new ArrayList<String>();
        list.add("UAP Insuarance");
        list.add("UAP Insuarance");
        list.add("UAP Insuarance");
        list.add("UAP Insuarance");


        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(), R.layout.spinner_item, R.id.spinner_text, list);
        sp_insuarance.setAdapter(dataAdapter);
        final Calendar myCalendar = Calendar.getInstance();

        checkin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Calendar c = Calendar.getInstance();
                mYear = c.get(Calendar.YEAR);
                mMonth = c.get(Calendar.MONTH);
                mDay = c.get(Calendar.DAY_OF_MONTH);
                final DatePickerDialog datePickerDialog = new DatePickerDialog(getActivity(),
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                checkin.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis() - 1000);
                datePickerDialog.show();
                int coMonth = c.get(Calendar.MONTH);
                int coDay = c.get(Calendar.DAY_OF_MONTH);



            }
        });


        checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Calendar c = Calendar.getInstance();
                mYear = c.get(Calendar.YEAR);
                mMonth = c.get(Calendar.MONTH);
                mDay = c.get(Calendar.DAY_OF_MONTH);
                final DatePickerDialog datePickerDialog = new DatePickerDialog(getActivity(),
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                checkout.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.getDatePicker().setMinDate(System.currentTimeMillis() - 1000);
                datePickerDialog.show();
                int coMonth = c.get(Calendar.MONTH);
                int coDay = c.get(Calendar.DAY_OF_MONTH);


            }
        });



        return view;
    }





}

