package com.simple.simplejob.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.simple.simplejob.R;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);


        Thread t=new Thread()
        {
            public void run()
            {
                try {

                    sleep(2000);
                    finish();
                    Intent cv=new Intent(SplashScreen.this,LoginActivity.class);
                    startActivity(cv);
                }

                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();
    }
}
