package com.example.viewbindinginandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.viewbindinginandroid.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activityMainBinding.getRoot());

        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());


    }
}