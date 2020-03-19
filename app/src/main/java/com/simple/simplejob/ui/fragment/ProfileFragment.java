package com.simple.simplejob.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.simple.simplejob.R;

public class ProfileFragment extends Fragment {
    TextView text_title;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=LayoutInflater.from(container.getContext()).inflate(R.layout.profilefragment,container,false);
        FindViewId(view);
        text_title.setText("Profile");

        return view;
    }
    private void FindViewId(View view) {

        text_title =  view.findViewById(R.id.text_title);
    }
}
