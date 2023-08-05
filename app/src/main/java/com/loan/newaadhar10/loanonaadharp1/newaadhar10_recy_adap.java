package com.loan.newaadhar10.loanonaadharp1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class newaadhar10_recy_adap extends RecyclerView.Adapter< newaadhar10_recy_adap.ViewHolder> {
    private ArrayList<newaadhar10_loan_modelclass> arrayList;
    private ClickListener clickListener;
    private Context context;

    public interface ClickListener {
        void onClickEvent(newaadhar10_loan_modelclass loan_modelclass);
    }

    public newaadhar10_recy_adap(Context context2, ArrayList<newaadhar10_loan_modelclass> arrayList2, ClickListener clickListener2) {
        this.context = context2;
        this.clickListener = clickListener2;
        this.arrayList = arrayList2;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(this.context).inflate(R.layout.newaadhar10_cs_recycler, viewGroup, false));
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.tvAmount.setText(this.arrayList.get(i).getAmount());
        viewHolder.tvName.setText(this.arrayList.get(i).getName());
        viewHolder.btnApply.setOnClickListener(new newaadhar10_recy_adap$$ExternalSyntheticLambda0(this, i));
        viewHolder.itemView.setOnClickListener(new newaadhar10_recy_adap$$ExternalSyntheticLambda1(this, i));
    }

    public /* synthetic */ void m10133lambda$onBindViewHolder$0$commoneeyloanAdaprecy_adap(int i, View view) {
        this.clickListener.onClickEvent(this.arrayList.get(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onBindViewHolder$1$com-moneey-loan-Adap-newaadhar10_recy_adap  reason: not valid java name */
    public /* synthetic */ void m10134lambda$onBindViewHolder$1$commoneeyloanAdaprecy_adap(int i, View view) {
        this.clickListener.onClickEvent(this.arrayList.get(i));
    }

    public int getItemCount() {
        return this.arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public Button btnApply;
        public TextView tvAmount;
        public TextView tvName;

        public ViewHolder(View view) {
            super(view);
            this.tvAmount = (TextView) view.findViewById(R.id.csRv_tvAmount);
            this.tvName = (TextView) view.findViewById(R.id.csRv_tvName);
            this.btnApply = (Button) view.findViewById(R.id.csRv_btnApply);
        }
    }
}
