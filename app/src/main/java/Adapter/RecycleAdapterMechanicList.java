package Adapter;

import android.content.Context;
import android.content.Intent;
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

import ModelClass.MechanicListModelClass;
import com.design.PyMe.AddCarActivity;
import com.design.PyMe.AddMechanicActivity;
import com.design.PyMe.AddressActivity;
import com.design.PyMe.BankFinanceDetailsActivity;
import com.design.PyMe.BuyPartsActivity;
import com.design.PyMe.BuyPartsCarActivity;
import com.design.PyMe.BuyPartsFilterActivity;
import com.design.PyMe.BuySellActivity;
import com.design.PyMe.CarClubActivity;
import com.design.PyMe.CarInsuranceActivity;
import com.design.PyMe.CarProfileActivity;
import com.design.PyMe.CartActivity;
import com.design.PyMe.ChatActivity;
import com.design.PyMe.ChatMessangerActivity;
import com.design.PyMe.CompaniesBrockerActivity;
import com.design.PyMe.ConfirmationActivity;
import com.design.PyMe.FilterCategoryActivity;
import com.design.PyMe.MechanicActivity;
import com.design.PyMe.MechanicListActivity;
import com.design.PyMe.MyListingActivity;
import com.design.PyMe.OrderActivity;
import com.design.PyMe.OrderDetailActivity;
import com.design.PyMe.R;
import com.design.PyMe.RatingActivity;
import com.design.PyMe.ReviewOderActivity;
import com.design.PyMe.SignInActivity;
import com.design.PyMe.SignInWithSocialActivity;
import com.design.PyMe.SignUpActivity;
import com.design.PyMe.TripActivity;


/**
 * Created by Rp on 6/14/2016.
 */
public class RecycleAdapterMechanicList extends RecyclerView.Adapter<RecycleAdapterMechanicList.MyViewHolder> {
Context context;

    boolean showingFirst = true;
    ImageView NormalImageView;
    Bitmap ImageBit;
    float ImageRadius = 40.0f;
    private List<MechanicListModelClass> moviesList;




    public RecycleAdapterMechanicList(MechanicListActivity mainActivityContacts, List<MechanicListModelClass> moviesList) {
        this.moviesList = moviesList;
       this.context = mainActivityContacts;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_mechanic_list, parent, false);



        return new MyViewHolder(itemView);


    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        MechanicListModelClass movie = moviesList.get(position);
        holder.name.setText(movie.getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (position == 0)
                {
                    Intent i = new Intent(context, SignInWithSocialActivity.class);
                    context.startActivity(i);
                }else if(position == 1){
                    Intent i = new Intent(context, SignInActivity.class);
                    context.startActivity(i);
                }else if(position == 2){
                    Intent i = new Intent(context, SignUpActivity.class);
                    context.startActivity(i);
                }else if(position == 3){
                    Intent i = new Intent(context, AddMechanicActivity.class);
                    context.startActivity(i);
                }else if(position == 4){
                    Intent i = new Intent(context, ChatActivity.class);
                    context.startActivity(i);
                }else if(position == 5){
                    Intent i = new Intent(context, CarClubActivity.class);
                    context.startActivity(i);
                }else if(position == 6){
                    Intent i = new Intent(context, AddCarActivity.class);
                    context.startActivity(i);
                }else if(position == 7){
                    Intent i = new Intent(context, TripActivity.class);
                    context.startActivity(i);
                }else if(position == 8){
                    Intent i = new Intent(context, MechanicActivity.class);
                    context.startActivity(i);
                }else if(position == 9){
                    Intent i = new Intent(context, ChatMessangerActivity.class);
                    context.startActivity(i);
                }else if(position == 10){
                    Intent i = new Intent(context, CarProfileActivity.class);
                    context.startActivity(i);
                }else if(position == 11){
                    Intent i = new Intent(context, RatingActivity.class);
                    context.startActivity(i);
                }else if(position == 12){
                    Intent i = new Intent(context, CarInsuranceActivity.class);
                    context.startActivity(i);
                }else if(position == 13){
                    Intent i = new Intent(context, CompaniesBrockerActivity.class);
                    context.startActivity(i);
                }else if(position == 14){
                    Intent i = new Intent(context, BankFinanceDetailsActivity.class);
                    context.startActivity(i);
                }else if(position == 15){
                    Intent i = new Intent(context, BuySellActivity.class);
                    context.startActivity(i);
                }else if(position == 16){
                    Intent i = new Intent(context, MyListingActivity.class);
                    context.startActivity(i);
                }else if(position == 17){
                    Intent i = new Intent(context, BuyPartsActivity.class);
                    context.startActivity(i);
                }else if(position == 18){
                    Intent i = new Intent(context, FilterCategoryActivity.class);
                    context.startActivity(i);
                }else if(position == 19){
                    Intent i = new Intent(context, BuyPartsCarActivity.class);
                    context.startActivity(i);
                }else if(position == 20){
                    Intent i = new Intent(context, BuyPartsFilterActivity.class);
                    context.startActivity(i);
                }else if(position == 21){
                    Intent i = new Intent(context, CartActivity.class);
                    context.startActivity(i);
                }else if(position == 22){
                    Intent i = new Intent(context, AddressActivity.class);
                    context.startActivity(i);
                }else if(position == 23){
                    Intent i = new Intent(context, ReviewOderActivity.class);
                    context.startActivity(i);
                }else if(position == 24){
                    Intent i = new Intent(context, ConfirmationActivity.class);
                    context.startActivity(i);
                }else if(position == 25){
                    Intent i = new Intent(context, OrderActivity.class);
                    context.startActivity(i);
                }else if(position == 26){
                    Intent i = new Intent(context, OrderDetailActivity.class);
                    context.startActivity(i);
                }





            }
        });
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {


        TextView name;


        public MyViewHolder(View view) {
            super(view);


            name = (TextView) view.findViewById(R.id.txt);

        }

    }






}


