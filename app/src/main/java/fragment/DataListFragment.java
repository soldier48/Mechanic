package fragment;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import Adapter.MechanicListAdapter;
import ModelClass.BeanClassForListData;
import com.design.PyMe.R;


public class DataListFragment extends Fragment {

    LinearLayout linear_filter, linear_sort_by;
    RadioGroup radio_group1;
    RadioButton radio1, radio2, radio3, radio4;
    private RecyclerView recycle;
    private MechanicListAdapter listAdapter;
    private Dialog slideDialog;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
      View  view = inflater.inflate(R.layout.fragment_list, container, false);

        recycle = (RecyclerView) view.findViewById(R.id.recycle);
        linear_filter = (LinearLayout) view.findViewById(R.id.linear_filter);
        linear_sort_by = (LinearLayout) view.findViewById(R.id.linear_sort_by);


        BeanClassForListData listDatas[] = {

                new BeanClassForListData("Ketan Car Point"),
                new BeanClassForListData("Ketan Car Point"),
                new BeanClassForListData("Ketan Car Point"),
                new BeanClassForListData("Ketan Car Point")

        };


        listAdapter = new MechanicListAdapter(listDatas, getActivity());
        recycle.setLayoutManager(new LinearLayoutManager(getActivity()));
        recycle.setAdapter(listAdapter);


//        linear_filter.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(getActivity(), Filter_Activity.class);
//                startActivity(i);
//            }
//        });


        linear_sort_by.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                slideDialog = new Dialog(getActivity(), R.style.CustomDialogAnimation);
                slideDialog.setContentView(R.layout.activity_sort_by);

                radio1 = (RadioButton) slideDialog.findViewById(R.id.radio1);
                radio2 = (RadioButton) slideDialog.findViewById(R.id.radio2);
                radio3 = (RadioButton) slideDialog.findViewById(R.id.radio3);
                radio4 = (RadioButton) slideDialog.findViewById(R.id.radio4);


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

                int width = (int) (getActivity().getResources().getDisplayMetrics().widthPixels * 0.90);
                int height = (int) (getActivity().getResources().getDisplayMetrics().heightPixels * 0.30);

                layoutParams.width = WindowManager.LayoutParams.MATCH_PARENT;
                layoutParams.height = height;
                layoutParams.gravity = Gravity.BOTTOM;

                slideDialog.getWindow().setAttributes(layoutParams);
                slideDialog.setCancelable(true);
                slideDialog.setCanceledOnTouchOutside(true);
                slideDialog.show();

            }
        });


/*
        radio_group1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                switch (checkedId){

                    case R.id.radio1:

                        radio1.setButtonDrawable(R.drawable.radio_checked);
                        radio2.setButtonDrawable(R.drawable.radio_unchecked);
                        radio3.setButtonDrawable(R.drawable.radio_unchecked);
                        radio4.setButtonDrawable(R.drawable.radio_unchecked);
                        break;


                }


            }
        });
*/





        return view;
    }
}
