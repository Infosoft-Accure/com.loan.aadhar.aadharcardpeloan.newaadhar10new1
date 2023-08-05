package com.loan.newaadhar10.loanonaadharp1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

public class newaadhar10_view_adap extends RecyclerView.Adapter< newaadhar10_view_adap.SliderViewHolder> {
    int[] list;

    public newaadhar10_view_adap(int[] iArr) {
        this.list = iArr;
    }

    public SliderViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new SliderViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.newaadhar10_custom_css_slide, viewGroup, false));
    }

    public void onBindViewHolder(SliderViewHolder sliderViewHolder, int i) {
        sliderViewHolder.view.setImageResource(this.list[i]);
    }

    public int getItemCount() {
        return this.list.length;
    }

    public class SliderViewHolder extends RecyclerView.ViewHolder {
        ImageView view;

        public SliderViewHolder(View view2) {
            super(view2);
            this.view = (ImageView) view2.findViewById(R.id.view);
        }
    }
}
