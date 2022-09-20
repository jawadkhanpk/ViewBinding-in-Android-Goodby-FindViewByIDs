package com.example.viewbindinginandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.viewbindinginandroid.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activityMainBinding.getRoot());

        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());

        activityMainBinding.t1.setText("Hello this is the feature of ViewBinding");
        activityMainBinding.btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Button Working", Toast.LENGTH_SHORT).show();
            }
        });


    }
}