package com.simple.simplejob.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.simple.simplejob.R;
import com.simple.simplejob.ui.activity.HomePage;

public class SlideBarAdapter extends RecyclerView.Adapter<SlideBarAdapter.MyHolder> {
    HomePage context;
    int[] image;
    public SlideBarAdapter(HomePage homePage, int[] image) {
        context=homePage;
        this.image=image;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.slide_pager,parent,false);
        MyHolder myHolder=new MyHolder(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.indicator_image.setImageResource(image[position]);
    }

    @Override
    public int getItemCount() {
        return image.length;
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        ImageView indicator_image;
        public MyHolder(View view) {
            super(view);
            indicator_image=view.findViewById(R.id.indicator_image);

        }
    }
}
