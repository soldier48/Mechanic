package Adapter;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import ModelClass.BeanClassForBrokersList;
import com.design.PyMe.R;


/**
 * Created by praja on 22-05-17.
 */

public class RecycleAdapter_Brokers_list extends RecyclerView.Adapter<RecycleAdapter_Brokers_list.MyViewHolder> {


    public Context mContext;
    public BeanClassForBrokersList[] brokersLists;

    public RecycleAdapter_Brokers_list(BeanClassForBrokersList[] brokersLists, Context mContext) {
        this.mContext = mContext;
        this.brokersLists = brokersLists;
    }

    @Override
    public RecycleAdapter_Brokers_list.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_brokers_list, parent, false);
        RecycleAdapter_Brokers_list.MyViewHolder vh = new RecycleAdapter_Brokers_list.MyViewHolder(itemView);
        return vh;
    }

    @Override
    public void onBindViewHolder(RecycleAdapter_Brokers_list.MyViewHolder holder, int position) {
        holder.txt_broker_name.setText(brokersLists[position].getBroker_name());


    }

    @Override
    public int getItemCount() {
        return brokersLists.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView txt_broker_name;

        public MyViewHolder(View itemView) {
            super(itemView);

            txt_broker_name = (TextView) itemView.findViewById(R.id.txt_broker_name);
        }
    }


}
