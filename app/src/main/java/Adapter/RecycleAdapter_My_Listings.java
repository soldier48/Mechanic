package Adapter;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import ModelClass.BeanClassForListings;
import com.design.PyMe.R;


/**
 * Created by praja on 22-05-17.
 */

public class RecycleAdapter_My_Listings extends RecyclerView.Adapter<RecycleAdapter_My_Listings.MyViewHolder> {


    public Context mContext;
    public BeanClassForListings[] classForListingses;

    public RecycleAdapter_My_Listings(BeanClassForListings[] classForListingses, Context mContext) {
        this.mContext = mContext;
        this.classForListingses = classForListingses;
    }

    @Override
    public RecycleAdapter_My_Listings.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_listing, parent, false);
        RecycleAdapter_My_Listings.MyViewHolder vh = new RecycleAdapter_My_Listings.MyViewHolder(itemView);
        return vh;
    }

    @Override
    public void onBindViewHolder(RecycleAdapter_My_Listings.MyViewHolder holder, int position) {
        holder.txtname.setText(classForListingses[position].getLising_name());


    }

    @Override
    public int getItemCount() {
        return classForListingses.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView txtname;

        public MyViewHolder(View itemView) {
            super(itemView);

            txtname = (TextView) itemView.findViewById(R.id.txt_name);
        }
    }


}
