package Adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ModelClass.BeanClassForCar_clubs;
import com.design.PyMe.CarClubActivity;
import com.design.PyMe.R;


/**
 * Created by Rp on 6/14/2016.
 */
public class RecycleAdapter_Car_Clubs extends RecyclerView.Adapter<RecycleAdapter_Car_Clubs.MyViewHolder> {
Context context;

    boolean showingFirst = true;

    private List<BeanClassForCar_clubs> moviesList;


    ImageView NormalImageView;
    Bitmap ImageBit;
    float ImageRadius = 40.0f;




    public class MyViewHolder extends RecyclerView.ViewHolder {




        ImageView logo_image;
        TextView member;
        TextView brand_name;
        ImageView car_image;




        public MyViewHolder(View view) {
            super(view);

            logo_image = (ImageView) view.findViewById(R.id.logo_image);
            member = (TextView) view.findViewById(R.id.member);
            car_image = (ImageView) view.findViewById(R.id.car_image);
            brand_name = (TextView) view.findViewById(R.id.brand_name);

        }

    }



    public RecycleAdapter_Car_Clubs(CarClubActivity mainActivityContacts, List<BeanClassForCar_clubs> moviesList) {
        this.moviesList = moviesList;
       this.context = mainActivityContacts;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_car_club_list, parent, false);



        return new MyViewHolder(itemView);


    }




    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {

        if (position % 2 == 0  ){

            holder.itemView.setBackgroundColor(Color.parseColor("#ffffff"));
        }else
        {
            holder.itemView.setBackgroundColor(Color.parseColor("#b9dcf3"));
        }

        BeanClassForCar_clubs movie = moviesList.get(position);
        holder.logo_image.setImageResource(movie.getLogo_image());
        holder.member.setText(movie.getMembers());
        holder.brand_name.setText(movie.getBrand_name());
        holder.car_image.setImageResource(movie.getCar_image());



    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }






}


