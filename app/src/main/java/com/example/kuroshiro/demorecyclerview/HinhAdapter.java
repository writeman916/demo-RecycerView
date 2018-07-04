package com.example.kuroshiro.demorecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HinhAdapter extends RecyclerView.Adapter<HinhAdapter.ViewHolder> {


    private ArrayList<DataHinh> mList;

    HinhAdapter(ArrayList<DataHinh> dataHinhs)
    {
        mList = dataHinhs;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        View itemV = layoutInflater.inflate(R.layout.item_recycler,parent,false);

        ViewHolder mView = new ViewHolder(itemV);

        return mView;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.tw.setText(mList.get(position).getName());
        holder.im.setImageResource(mList.get(position).getHinh());

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView tw;
        ImageView im;
        ViewHolder(@NonNull View itemView) {

            super(itemView);
            tw =  itemView.findViewById(R.id.twName);
            im =  itemView.findViewById(R.id.imgHinh);
        }
    }
}
