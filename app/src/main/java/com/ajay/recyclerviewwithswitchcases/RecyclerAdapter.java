package com.ajay.recyclerviewwithswitchcases;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Avi Hacker on 10/6/2016.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {
    String[] country_names, country_capitals;
    int value;
    int[] numbers;

    public RecyclerAdapter(String[] counry_names, String[] country_capitals, int[] numbers, int mCase) {

        this.country_names = counry_names;
        this.country_capitals = country_capitals;
        value = mCase;
        this.numbers = numbers;

    }

    // if you have 3 different files (differnt desgin ,layout  or different purpose )
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerViewHolder recyclerViewHolder = null;
        View view;
        switch (value) {
            case 1:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);
                recyclerViewHolder = new RecyclerViewHolder(view);
                break;
            case 2:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.country_layout, parent, false);
                recyclerViewHolder = new RecyclerViewHolder(view);
                break;


            case 3:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.state_layout, parent, false);
                recyclerViewHolder = new RecyclerViewHolder(view);
                break;

        }

        return recyclerViewHolder;
    }

    // different data comming setting onto different layouts
    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        switch (value) {
            case 1:
                holder.tx_country_names.setText(String.valueOf(numbers[position]));
                break;
            case 2:
                holder.tx_country_names.setText(country_names[position]);
                break;
            case 3:
                holder.tx_country_names.setText(country_capitals[position]);
                break;

        }

    }

    // if lenght are different for data comming
    @Override
    public int getItemCount() {

        int length = 0;
        switch (value) {
            case 1:
                length = numbers.length;
                break;
            case 2:
                length = country_names.length;
                break;
            case 3:
                length = country_capitals.length;
                break;


        }
        return length;
    }

        public static class RecyclerViewHolder extends RecyclerView.ViewHolder {
            TextView tx_country_names, tx_country_capitals;


            // if are layout have views with the sanme name..
            public RecyclerViewHolder(View itemView) {
                super(itemView);
                tx_country_names = (TextView) itemView.findViewById(R.id.country_name);
            }
        }
    }
