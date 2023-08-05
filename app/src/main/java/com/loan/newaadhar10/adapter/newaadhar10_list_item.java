package com.loan.newaadhar10.adapter;

public class newaadhar10_list_item {

    String list_text;
    int list_image;

    public newaadhar10_list_item(int img, String text){
        list_image=img;
        this.list_text=text;

    }

    public String getList_text() {
        return list_text;
    }

    public void setList_text(String list_text) {
        this.list_text = list_text;
    }

    public int getList_image() {
        return list_image;
    }

    public void setList_image(int list_image) {
        this.list_image = list_image;
    }
}
