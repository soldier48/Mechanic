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

import ModelClass.BeanClassForChatUser;
import com.design.PyMe.ChatActivity;
import com.design.PyMe.R;


/**
 * Created by Rp on 6/14/2016.
 */
public class RecycleAdapter_Chat_User extends RecyclerView.Adapter<RecycleAdapter_Chat_User.MyViewHolder> {
Context context;

    boolean showingFirst = true;

    private List<BeanClassForChatUser> moviesList;


    ImageView NormalImageView;
    Bitmap ImageBit;
    float ImageRadius = 40.0f;




    public class MyViewHolder extends RecyclerView.ViewHolder {




        ImageView image;
        TextView name;
        TextView time;





        public MyViewHolder(View view) {
            super(view);

            image = (ImageView) view.findViewById(R.id.image);
            name = (TextView) view.findViewById(R.id.name);
            time = (TextView) view.findViewById(R.id.time);


        }

    }



    public RecycleAdapter_Chat_User(ChatActivity mainActivityContacts, List<BeanClassForChatUser> moviesList) {
        this.moviesList = moviesList;
       this.context = mainActivityContacts;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_chat_user_list, parent, false);



        return new MyViewHolder(itemView);


    }




    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {


        BeanClassForChatUser movie = moviesList.get(position);
        holder.image.setImageResource(movie.getImage());
        holder.name.setText(movie.getName());
        holder.time.setText(movie.getTime());


    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }






}


