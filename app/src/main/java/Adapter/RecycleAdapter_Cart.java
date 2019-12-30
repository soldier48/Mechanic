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
import android.widget.Spinner;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;


import ModelClass.BeanClassForCart;
import ModelClass.ItemData;
import com.design.PyMe.CartActivity;
import com.design.PyMe.R;


/**
 * Created by Rp on 6/14/2016.
 */
public class RecycleAdapter_Cart extends RecyclerView.Adapter<RecycleAdapter_Cart.MyViewHolder> {
    Context context;

    boolean showingFirst = true;
    ImageView NormalImageView;
    Bitmap ImageBit;
    float ImageRadius = 40.0f;
    private List<BeanClassForCart> moviesList;


    public RecycleAdapter_Cart(CartActivity mainActivityContacts, List<BeanClassForCart> moviesList) {
        this.moviesList = moviesList;
        this.context = mainActivityContacts;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_cart_list, parent, false);


        return new MyViewHolder(itemView);


    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {


        ArrayList<ItemData> list = new ArrayList<>();


        list.add(new ItemData("1"));
        list.add(new ItemData("2"));
        list.add(new ItemData("3"));
        list.add(new ItemData("4"));

        Spinner_DataAdapter adapter = new Spinner_DataAdapter(context, R.layout.spinner_list, R.id.data, list);
        holder.sp.setAdapter(adapter);
        holder.spinner.setAdapter(adapter);


        BeanClassForCart movie = moviesList.get(position);
        holder.imageView.setImageResource(movie.getImage());


        holder.price.setPaintFlags(holder.price.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);


    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {


        ImageView imageView;
        Spinner sp, spinner;
        TextView price;


        public MyViewHolder(View view) {
            super(view);


            imageView = (ImageView) view.findViewById(R.id.image);
            sp = (Spinner) view.findViewById(R.id.spinner);
            spinner = (Spinner) view.findViewById(R.id.spinner);
            price = (TextView) view.findViewById(R.id.price);


        }

    }


}


