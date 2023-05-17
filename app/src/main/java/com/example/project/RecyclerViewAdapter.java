package com.example.project;

import android.content.Context;
import android.view.LayoutInflater;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter {

    public List<Drinks> items;
    private LayoutInflater layoutInflater;

    RecyclerViewAdapter(Context context) {
        this.layoutInflater = LayoutInflater.from(context);
        this.items = new ArrayList<>();

    }


}
