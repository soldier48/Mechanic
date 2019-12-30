package Adapter;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ModelClass.BeanClassForListData;
import com.design.PyMe.R;


/**
 * Created by praja on 22-05-17.
 */

public class MechanicListAdapter extends RecyclerView.Adapter<MechanicListAdapter.MyViewHolder>{


public Context mContext;
public BeanClassForListData[] listDatas;

public MechanicListAdapter(BeanClassForListData[] listDatas, Context mContext) {
        this.mContext = mContext;
        this.listDatas = listDatas;
        }

public class MyViewHolder extends RecyclerView.ViewHolder{

    public TextView txtname;

    public MyViewHolder(View itemView) {
        super(itemView);

        txtname = (TextView) itemView.findViewById(R.id.txtname);
    }
}


    @Override
    public MechanicListAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_mechanic_list1, parent, false);
        MechanicListAdapter.MyViewHolder vh = new MechanicListAdapter.MyViewHolder(itemView);
        return vh;
    }

    @Override
    public void onBindViewHolder(MechanicListAdapter.MyViewHolder holder, int position) {
        holder.txtname.setText(listDatas[position].getName());


    }

    @Override
    public int getItemCount() {
        return listDatas.length;
    }


}
