package Adapter;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



import java.util.ArrayList;

import ModelClass.BeanClassForBrandName;
import com.design.PyMe.R;


/**
 * Created by praja on 16-May-17.
 */

public class BrandNameAdapter extends RecyclerView.Adapter<BrandNameAdapter.MyViewHolder> {

    public Context mContext;
    public ArrayList<BeanClassForBrandName> brandNameArrayList;


    public BrandNameAdapter(ArrayList<BeanClassForBrandName> brandNameArrayList, Context mContext) {
        this.mContext = mContext;
        this.brandNameArrayList = brandNameArrayList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_brand_name_list, parent, false);

        BrandNameAdapter.MyViewHolder vh = new BrandNameAdapter.MyViewHolder(itemView);
        return vh;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {

        holder.txtbrand_name.setText(brandNameArrayList.get(position).getBrand_name());


/*        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if (holder.img_check.getVisibility()==View.VISIBLE){
                   holder.img_check.setVisibility(View.GONE);
                   holder.grey_check.setVisibility(View.VISIBLE);

               }else {
                   holder.img_check.setVisibility(View.VISIBLE);
                   holder.grey_check.setVisibility(View.GONE);
               }
            }


        });*/


    }

    @Override
    public int getItemCount() {
        return brandNameArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView txtbrand_name, txtcount;
        public ImageView grey_check, img_check;


        public MyViewHolder(View itemView) {
            super(itemView);

            txtbrand_name = (TextView) itemView.findViewById(R.id.txtbrand_name);


        }
    }


}
