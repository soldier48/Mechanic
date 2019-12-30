package Adapter;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import ModelClass.BeanClassForCompaniesList;
import com.design.PyMe.R;


/**
 * Created by praja on 22-05-17.
 */

public class RecycleAdapter_Companies_list extends RecyclerView.Adapter<RecycleAdapter_Companies_list.MyViewHolder> {


    public Context mContext;
    public BeanClassForCompaniesList[] companiesLists;

    public RecycleAdapter_Companies_list(BeanClassForCompaniesList[] companiesLists, Context mContext) {
        this.mContext = mContext;
        this.companiesLists = companiesLists;
    }

    @Override
    public RecycleAdapter_Companies_list.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_companies_insuarnce_list, parent, false);
        RecycleAdapter_Companies_list.MyViewHolder vh = new RecycleAdapter_Companies_list.MyViewHolder(itemView);
        return vh;
    }

    @Override
    public void onBindViewHolder(RecycleAdapter_Companies_list.MyViewHolder holder, int position) {
        holder.img.setImageResource(companiesLists[position].getImg());


    }

    @Override
    public int getItemCount() {
        return companiesLists.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public ImageView img;

        public MyViewHolder(View itemView) {
            super(itemView);

            img = (ImageView) itemView.findViewById(R.id.img);
        }
    }


}
