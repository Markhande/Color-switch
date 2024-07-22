package com.example.justpractice;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class swamiJi extends AppCompatActivity {
    LinearLayout layout;
    Button red;
    Button green;
    Button yellow;
    Button blue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swami_ji);

        this.layout = findViewById(R.id.My_Layout);
        this.red  = findViewById(R.id.red_button);
        this.green = findViewById(R.id.green_btn);
        this.yellow = findViewById(R.id.yellow_btn);
        this.blue =  findViewById(R.id.blue_btn);


        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setBackgroundResource(R.color.color_one);
            }
        });

        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setBackgroundResource(R.color.color_two);
            }
        });

        blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setBackgroundResource(R.color.color_tree);
            }
        });

        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setBackgroundResource(R.color.color_four);
            }
        });
    }
}