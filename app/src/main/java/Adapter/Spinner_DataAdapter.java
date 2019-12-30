package Adapter;

/**
 * Created by Wolf Soft on 2/1/2017.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import ModelClass.ItemData;
import com.design.PyMe.R;


public class Spinner_DataAdapter extends ArrayAdapter<ItemData> {
    int groupid;
    Context context;
    ArrayList<ItemData> list;
    LayoutInflater inflater;

    public Spinner_DataAdapter(Context context, int groupid, int id, ArrayList<ItemData>
            list) {
        super(context, id, list);
        this.list = list;
        this.context = context;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.groupid = groupid;
    }

    public View getView(final int position, View convertView, ViewGroup parent) {
        View itemView = inflater.inflate(groupid, parent, false);
        TextView textView = (TextView) itemView.findViewById(R.id.data);
        textView.setText(list.get(position).getText());

        return itemView;
    }

    public View getDropDownView(int position, View convertView, ViewGroup
            parent) {
        return getView(position, convertView, parent);

    }
}
