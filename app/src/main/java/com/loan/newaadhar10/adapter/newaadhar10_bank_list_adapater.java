package com.loan.newaadhar10.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.loan.newaadhar10.loanonaadharp1.R;

import java.util.List;

public class newaadhar10_bank_list_adapater extends ArrayAdapter<newaadhar10_bank_list> {

    List<newaadhar10_bank_list> list_items;
    int custom_layout;

    public newaadhar10_bank_list_adapater(Context context, int resource, List<newaadhar10_bank_list> object){
        super(context,resource,object);
        list_items=object;
        custom_layout = resource;

    }
    @Override public int getCount() {
        return list_items.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            // getting reference to the main layout and initializing
            LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(custom_layout, null);
        }

        // initializing the imageview and textview and setting data
        TextView textView = v.findViewById(R.id.money);
        TextView textView1 = v.findViewById(R.id.text1);

        // get the item using the  position param
        newaadhar10_bank_list item = list_items.get(position);

        textView.setText(item.getList_text());
        textView1.setText(item.getList_text1());
        return v;
    }
}
