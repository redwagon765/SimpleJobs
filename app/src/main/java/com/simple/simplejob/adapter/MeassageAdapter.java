package com.simple.simplejob.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.simple.simplejob.R;
import com.simple.simplejob.ui.activity.ChatDetailsActivity;

public class MeassageAdapter extends RecyclerView.Adapter<MeassageAdapter.MyMessageHolder> {
    FragmentActivity activity;

    public MeassageAdapter(FragmentActivity activity) {
        this.activity = activity;

    }

    @NonNull
    @Override
    public MyMessageHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.meassageadapter, parent, false);

        MyMessageHolder meassageadapter = new MyMessageHolder(view);

        return meassageadapter;
    }

    @Override
    public void onBindViewHolder(@NonNull MyMessageHolder holder, int position) {

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(activity, ChatDetailsActivity.class);
                activity.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class MyMessageHolder extends RecyclerView.ViewHolder {
        public MyMessageHolder(View view) {
            super(view);


        }
    }
}
