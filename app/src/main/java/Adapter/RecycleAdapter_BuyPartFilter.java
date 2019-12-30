package Adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



import java.util.List;

import ModelClass.BeanClassForBuyPartsFilter;
import com.design.PyMe.BuyPartsFilterActivity;
import com.design.PyMe.R;


/**
 * Created by Rp on 6/14/2016.
 */
public class RecycleAdapter_BuyPartFilter extends RecyclerView.Adapter<RecycleAdapter_BuyPartFilter.MyViewHolder> {
    Context context;

    boolean showingFirst = true;
    ImageView NormalImageView;
    Bitmap ImageBit;
    float ImageRadius = 40.0f;
    private List<BeanClassForBuyPartsFilter> moviesList;


    public RecycleAdapter_BuyPartFilter(BuyPartsFilterActivity mainActivityContacts, List<BeanClassForBuyPartsFilter> moviesList) {
        this.moviesList = moviesList;
        this.context = mainActivityContacts;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_parts_filter_grid_list, parent, false);


        return new MyViewHolder(itemView);


    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {


        BeanClassForBuyPartsFilter movie = moviesList.get(position);
        holder.image.setImageResource(movie.getImage());
        holder.name.setText(movie.getName());
        holder.sub_name.setText(movie.getSubtitle());
        holder.discount_price.setText(movie.getDiscount_price());
        holder.price.setText(movie.getPrice());
        holder.discount.setText(movie.getDiscount());

        holder.price.setPaintFlags(holder.price.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);

        if (position % 2 == 0) {

            holder.discount.setVisibility(View.GONE);
        } else {

            holder.discount.setVisibility(View.VISIBLE);
        }


    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {


        ImageView image;
        TextView name;
        TextView sub_name;
        TextView discount_price;
        TextView price;
        TextView discount;


        public MyViewHolder(View view) {
            super(view);

            image = (ImageView) view.findViewById(R.id.image);
            name = (TextView) view.findViewById(R.id.name);
            sub_name = (TextView) view.findViewById(R.id.sub_name);
            discount_price = (TextView) view.findViewById(R.id.discount_price);
            price = (TextView) view.findViewById(R.id.price);
            discount = (TextView) view.findViewById(R.id.discount);


        }

    }


}


