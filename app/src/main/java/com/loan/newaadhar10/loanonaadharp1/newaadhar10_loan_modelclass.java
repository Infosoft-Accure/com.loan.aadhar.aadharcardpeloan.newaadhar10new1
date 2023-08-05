package com.loan.newaadhar10.loanonaadharp1;

import java.io.Serializable;

public class newaadhar10_loan_modelclass implements Serializable {
    String Amount;
    String Detail;
    int Icon;
    String MonthlyIntrest;
    String Name;
    String ProcessingFees;
    String Tenure;
    String Url;

    public newaadhar10_loan_modelclass(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7) {
        this.Name = str;
        this.Amount = str2;
        this.Icon = i;
        this.Tenure = str3;
        this.MonthlyIntrest = str4;
        this.ProcessingFees = str5;
        this.Url = str6;
        this.Detail = str7;
    }

    public String getDetail() {
        return this.Detail;
    }

    public void setDetail(String str) {
        this.Detail = str;
    }

    public String getUrl() {
        return this.Url;
    }

    public void setUrl(String str) {
        this.Url = str;
    }

    public int getIcon() {
        return this.Icon;
    }

    public void setIcon(int i) {
        this.Icon = i;
    }

    public newaadhar10_loan_modelclass(String str, String str2, String str3, String str4, String str5) {
        this.Name = str;
        this.Amount = str2;
        this.Tenure = str3;
        this.MonthlyIntrest = str4;
        this.ProcessingFees = str5;
    }

    public String getTenure() {
        return this.Tenure;
    }

    public void setTenure(String str) {
        this.Tenure = str;
    }

    public String getMonthlyIntrest() {
        return this.MonthlyIntrest;
    }

    public void setMonthlyIntrest(String str) {
        this.MonthlyIntrest = str;
    }

    public String getProcessingFees() {
        return this.ProcessingFees;
    }

    public void setProcessingFees(String str) {
        this.ProcessingFees = str;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String str) {
        this.Name = str;
    }

    public String getAmount() {
        return this.Amount;
    }

    public void setAmount(String str) {
        this.Amount = str;
    }
}
