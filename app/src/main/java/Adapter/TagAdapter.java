package Adapter;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import ModelClass.BeanClassForTagData;
import com.design.PyMe.R;




public class TagAdapter extends RecyclerView.Adapter<TagAdapter.MyViewHolder> {


    public Context mContext;
    public BeanClassForTagData[] tagDatas;

    public TagAdapter(BeanClassForTagData[] tagDatas, Context mContext) {
        this.mContext = mContext;
        this.tagDatas = tagDatas;
    }

    @Override
    public TagAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_round_tag, parent, false);
        TagAdapter.MyViewHolder vh = new TagAdapter.MyViewHolder(itemView);
        return vh;
    }

    @Override
    public void onBindViewHolder(TagAdapter.MyViewHolder holder, int position) {
        holder.txttag.setText(tagDatas[position].getTag_name());


    }

    @Override
    public int getItemCount() {
        return tagDatas.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView txttag;

        public MyViewHolder(View itemView) {
            super(itemView);

            txttag = (TextView) itemView.findViewById(R.id.txttag);
        }
    }


}
