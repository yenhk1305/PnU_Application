package com.example.adapter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.example.model.Banner;
import com.example.pnu_application.R;

import java.util.ArrayList;

public class BannerAdapter extends RecyclerView.Adapter<BannerAdapter.ViewHolder> {
    Context context;
    ArrayList<Banner> banners;

    public BannerAdapter(Context context, ArrayList<Banner> banners){
        this.context=context;
        this.banners=banners;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View customView=inflater.inflate(R.layout.banner,parent,false);
        return new ViewHolder(customView);
    }

    @Override
    public void onBindViewHolder(@NonNull BannerAdapter.ViewHolder holder, int position) {
        holder.imvThumb.setImageResource(banners.get(position).getBannerThumb());
    }

    @Override
    public int getItemCount() {
        return banners.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imvThumb;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //Link view
            imvThumb=itemView.findViewById(R.id.imvThumb);
        }
    }
}
