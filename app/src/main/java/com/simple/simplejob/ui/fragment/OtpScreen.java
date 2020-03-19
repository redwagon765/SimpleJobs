package com.simple.simplejob.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.simple.simplejob.R;

public class OtpScreen extends Fragment implements View.OnClickListener {
    TextView next_text,text_title;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.otpscreen, container, false);
        findId(view);
        next_text.setOnClickListener(this);
        text_title.setText("Enter Code");
        next_text.setText("Next");
        return view;


    }

    private void findId(View view) {
        next_text = view.findViewById(R.id.entercode);
        text_title = view.findViewById(R.id.text_title);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.entercode) {
            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.otp_frame, new SeeServiceAround(), "service around");
            transaction.addToBackStack(null);
            transaction.commit();
        }
    }
}
