package com.simple.simplejob.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.simple.simplejob.R;
import com.simple.simplejob.adapter.MeassageAdapter;

public class MessagesFragment extends Fragment {
RecyclerView meassge_recycler;
TextView text_title;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=LayoutInflater.from(container.getContext()).inflate(R.layout.messagefragment,container,false);

        FindViewId(view);
        text_title.setText("Messages");
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity());
        meassge_recycler.setLayoutManager(linearLayoutManager);

        MeassageAdapter meassageAdapter=new MeassageAdapter(getActivity());
        meassge_recycler.setAdapter(meassageAdapter);
        return view;
    }

    private void FindViewId(View view) {
        meassge_recycler=view.findViewById(R.id.meassge_recycler);
        text_title =  view.findViewById(R.id.text_title);
    }
}
