package com.example.skinsenty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menskin extends AppCompatActivity {
    Button skin_1,skin_2,skin_3,skin_4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menskin);
        skin_1=(Button)findViewById(R.id.skin_1);
        skin_2=(Button)findViewById(R.id.skin_2);
        skin_3=(Button)findViewById(R.id.skin_3);
        skin_4=(Button)findViewById(R.id.skin_4);
        skin_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(menskin.this,oilyskinmen.class));
            }
        });
        skin_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(menskin.this,men_dryskin.class));
            }
        });
        skin_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(menskin.this,men_combinationskin.class));
            }
        });
        skin_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(menskin.this,men_sensitiveskin.class));
            }
        });

    }

}