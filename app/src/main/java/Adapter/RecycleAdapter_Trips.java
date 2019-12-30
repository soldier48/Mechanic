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

import ModelClass.BeanClassForTrips;
import com.design.PyMe.R;
import com.design.PyMe.TripActivity;


/**
 * Created by Rp on 6/14/2016.
 */
public class RecycleAdapter_Trips extends RecyclerView.Adapter<RecycleAdapter_Trips.MyViewHolder> {
Context context;

    boolean showingFirst = true;

    private List<BeanClassForTrips> moviesList;


    ImageView NormalImageView;
    Bitmap ImageBit;
    float ImageRadius = 40.0f;




    public class MyViewHolder extends RecyclerView.ViewHolder {


        TextView from;
        TextView destination;


        public MyViewHolder(View view) {
            super(view);

            from = (TextView) view.findViewById(R.id.from);
            destination = (TextView) view.findViewById(R.id.destination);


        }

    }



    public RecycleAdapter_Trips(TripActivity mainActivityContacts, List<BeanClassForTrips> moviesList) {
        this.moviesList = moviesList;
       this.context = mainActivityContacts;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_trip_list, parent, false);



        return new MyViewHolder(itemView);


    }




    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {


        BeanClassForTrips movie = moviesList.get(position);
        holder.from.setText(movie.getFrom());
        holder.destination.setText(movie.getDestination());




    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }



}


