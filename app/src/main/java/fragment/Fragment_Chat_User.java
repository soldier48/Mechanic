package fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



import java.util.ArrayList;

import Adapter.RecycleAdapter_Chat_User;
import ModelClass.BeanClassForChatUser;
import com.design.PyMe.ChatActivity;
import com.design.PyMe.R;


/**
 * Created by Wolf Soft on 9/6/2017.
 */

public class Fragment_Chat_User extends Fragment {

    private int image[] = {R.drawable.men,R.drawable.men,R.drawable.men, R.drawable.men};
    private String name[] = {"Sumit Key","Roger","Sumit Key","Roger","Sumit Key"};
    private String time[] ={"2.15 PM","3.30 PM","1.25 AM","5.21 AM","4.21 AM"};


    private ArrayList<BeanClassForChatUser> beanClassForChatUsers;

    private RecyclerView recyclerView;
    private RecycleAdapter_Chat_User mAdapter;



    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_chat_user, container, false);



        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview);

        beanClassForChatUsers = new ArrayList<>();


        for (int i = 0; i < image.length; i++) {
            BeanClassForChatUser beanClassForListView = new BeanClassForChatUser(image[i],name[i],time[i]);

            beanClassForChatUsers.add(beanClassForListView);
        }


        mAdapter = new RecycleAdapter_Chat_User((ChatActivity) getActivity(),beanClassForChatUsers);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);





        return view;
    }
}