package Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;



import java.util.ArrayList;

import ModelClass.BeanClassForBuySellData;
import com.design.PyMe.R;

/**
 * Created by praja on 16-06-17.
 */

public class BuySellGridAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<BeanClassForBuySellData> buySellDataArrayList;


    public BuySellGridAdapter(Context mContext, ArrayList<BeanClassForBuySellData> buySellDataArrayList) {
        this.mContext = mContext;
        this.buySellDataArrayList = buySellDataArrayList;
    }

    @Override
    public int getCount() {
        return buySellDataArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View gridViewAndroid;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        gridViewAndroid = new View(mContext);
        gridViewAndroid = inflater.inflate(R.layout.item_buy_sell_gridview_list, null);
        TextView txt_challanger = (TextView) gridViewAndroid.findViewById(R.id.txt_challanger);
        final ImageView heart = (ImageView) gridViewAndroid.findViewById(R.id.heart);
        final ImageView heart2 = (ImageView) gridViewAndroid.findViewById(R.id.heart2);

        txt_challanger.setText(buySellDataArrayList.get(position).getChallange());

        heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                heart2.setVisibility(View.VISIBLE);
                heart.setVisibility(View.GONE);
              /*  if (heart2.getVisibility()==View.VISIBLE){
                    heart2.setVisibility(View.GONE);
                    heart.setVisibility(View.VISIBLE);
                }else {
                    heart2.setVisibility(View.VISIBLE);
                    heart.setVisibility(View.GONE);
                }*/
            }

        });

        heart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                heart.setVisibility(View.VISIBLE);
                heart2.setVisibility(View.GONE);
              /*  if (heart2.getVisibility()==View.VISIBLE){
                    heart2.setVisibility(View.GONE);
                    heart.setVisibility(View.VISIBLE);
                }else {
                    heart2.setVisibility(View.VISIBLE);
                    heart.setVisibility(View.GONE);
                }*/
            }

        });

//        gridViewAndroid.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(mContext, BuySellDetailActivity.class);
//                mContext.startActivity(i);
//
//            }
//        });

        return gridViewAndroid;
    }
}
