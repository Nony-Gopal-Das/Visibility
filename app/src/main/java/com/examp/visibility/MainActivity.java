package com.examp.visibility;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.time.Duration;

public class MainActivity extends AppCompatActivity {
    ImageView imgView;
    Button showImg;
    Button hideImg;
    Button buttonTost;
    Button buttonNext;
    TextView textViewNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgView = findViewById(R.id.imgView);
        showImg = findViewById(R.id.showImg);
        hideImg = findViewById(R.id.hideImg);
        buttonTost = findViewById(R.id.buttonTost);
        buttonNext = findViewById(R.id.buttonNext);

        showImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgView.setVisibility(View.VISIBLE);
            }
        });

        hideImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgView.setVisibility(View.GONE);
            }
        });
        buttonTost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Toast.makeText(MainActivity.this, "Tost Operation Is SucessFull",Toast.LENGTH_LONG).show();
               
            }
        });

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, SetNewFile.class);
                startActivity(myIntent);

            }
        });

        textViewNext = findViewById(R.id.textViewNext);

        textViewNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myyIntent = new Intent(MainActivity.this, SetNewFile.class);
                startActivity(myyIntent);
                

            }
        });




    }
}