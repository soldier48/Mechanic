package Adapter;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import ModelClass.BeanClassForImage;
import com.design.PyMe.R;


/**
 * Created by praja on 22-05-17.
 */

public class RecycleAdapter_Upload_Image extends RecyclerView.Adapter<RecycleAdapter_Upload_Image.MyViewHolder> {


    public Context mContext;
    public BeanClassForImage[] beanClassForImages;

    public RecycleAdapter_Upload_Image(BeanClassForImage[] beanClassForImages, Context mContext) {
        this.mContext = mContext;
        this.beanClassForImages = beanClassForImages;
    }

    @Override
    public RecycleAdapter_Upload_Image.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_upload_photos, parent, false);
        RecycleAdapter_Upload_Image.MyViewHolder vh = new RecycleAdapter_Upload_Image.MyViewHolder(itemView);
        return vh;
    }

    @Override
    public void onBindViewHolder(RecycleAdapter_Upload_Image.MyViewHolder holder, int position) {
        holder.img.setImageResource(beanClassForImages[position].getImage());


    }

    @Override
    public int getItemCount() {
        return beanClassForImages.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public ImageView img;

        public MyViewHolder(View itemView) {
            super(itemView);

            img = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }


}
