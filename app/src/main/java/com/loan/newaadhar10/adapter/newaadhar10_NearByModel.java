package com.loan.newaadhar10.adapter;

import java.io.Serializable;

public class newaadhar10_NearByModel implements Serializable {

    public String item, itemName;

    public newaadhar10_NearByModel(){

    }

    public newaadhar10_NearByModel(String item, String itemName) {
        this.item = item;
        this.itemName = itemName;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
