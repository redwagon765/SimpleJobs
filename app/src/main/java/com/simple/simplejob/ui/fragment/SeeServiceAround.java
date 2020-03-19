package com.simple.simplejob.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.simple.simplejob.R;
import com.simple.simplejob.ui.activity.HomePage;
import com.simple.simplejob.ui.activity.VendorHome;

public class SeeServiceAround extends Fragment implements View.OnClickListener {
    Button currnt;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.seeservice_around, container, false);
        findId(view);

        currnt.setOnClickListener(this);
        return view;
    }

    private void findId(View view) {
        currnt=view.findViewById(R.id.currnt);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.currnt){
            Intent intent=new Intent(getActivity(), VendorHome.class);
            startActivity(intent);
        }
    }
}
