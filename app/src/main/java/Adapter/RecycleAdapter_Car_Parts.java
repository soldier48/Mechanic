package Adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



import java.util.List;


import ModelClass.BeanClassForCarParts;
import com.design.PyMe.BuyPartsCarActivity;
import com.design.PyMe.R;


/**
 * Created by Rp on 6/14/2016.
 */
public class RecycleAdapter_Car_Parts extends RecyclerView.Adapter<RecycleAdapter_Car_Parts.MyViewHolder> {
    Context context;

    boolean showingFirst = true;
    ImageView NormalImageView;
    Bitmap ImageBit;
    float ImageRadius = 40.0f;
    private List<BeanClassForCarParts> moviesList;


    public RecycleAdapter_Car_Parts(BuyPartsCarActivity mainActivityContacts, List<BeanClassForCarParts> moviesList) {
        this.moviesList = moviesList;
        this.context = mainActivityContacts;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_cart_part_list, parent, false);


        return new MyViewHolder(itemView);


    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {


        BeanClassForCarParts movie = moviesList.get(position);
        holder.title.setText(movie.getTitle());
        holder.image.setImageResource(movie.getImage());


    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {


        ImageView image;
        TextView title;


        public MyViewHolder(View view) {
            super(view);

            title = (TextView) view.findViewById(R.id.title);
            image = (ImageView) view.findViewById(R.id.image);


        }

    }


}


