package com.loan.newaadhar10.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.loan.newaadhar10.loanonaadharp1.R;

import java.util.List;

public class newaadhar10_AdapterMap extends RecyclerView.Adapter< newaadhar10_AdapterMap.ViewHolder> {
    List<newaadhar10_NearByModel> mData;
    Context context;

    public newaadhar10_AdapterMap(Context context, List<newaadhar10_NearByModel> data){
        this.context = context;
        this.mData = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.newaadhar10_near_by_item, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        newaadhar10_NearByModel model = mData.get(position);

        holder.item.setText(model.item);

        holder.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uri = "https://www.google.com/maps/search/" + holder.item.getText().toString()+"Near Me";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                intent.putExtra(holder.item.getTransitionName(), holder.item.getText().toString());
                holder.item.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ExtendedFloatingActionButton item;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            item = itemView.findViewById(R.id.item_txt);

        }
    }
}
