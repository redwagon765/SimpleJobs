package com.simple.simplejob.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.simple.simplejob.R;
import com.simple.simplejob.ui.fragment.OtpScreen;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    Button login_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findId();
        login_button.setOnClickListener(this);
    }

    private void findId() {

        login_button = findViewById(R.id.login_button);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.login_button) {

            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.login_frame, new OtpScreen(), "Otp Screen");
            transaction.addToBackStack(null);
            transaction.commit();
        }
    }
}
