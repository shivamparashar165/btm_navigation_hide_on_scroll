package com.example.gfgapp;

public class ModelClass {
    String pic;
    String text;

    public ModelClass(String pic, String text) {
        this.pic = pic;
        this.text = text;
    }



    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
