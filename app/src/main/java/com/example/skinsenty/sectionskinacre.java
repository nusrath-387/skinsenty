package com.example.skinsenty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sectionskinacre extends AppCompatActivity {
    Button skin_1,skin_2,skin_3,skin_4,skin_5,skin_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sectionskinacre);
        skin_1=(Button)findViewById(R.id.skin_1);
        skin_2=(Button)findViewById(R.id.skin_2);
        skin_3=(Button)findViewById(R.id.skin_3);
        skin_4=(Button)findViewById(R.id.skin_4);
        skin_5=(Button)findViewById(R.id.skin_5);
        skin_6=(Button)findViewById(R.id.skin_6);
        skin_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(sectionskinacre.this,sunscream.class));
            }
        });
        skin_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(sectionskinacre.this,facepack.class));
            }
        });
        skin_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(sectionskinacre.this,toner.class));
            }
        });
        skin_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(sectionskinacre.this,moistuzers.class));
            }
        });

        skin_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(sectionskinacre.this,facewash_female.class));
            }
        });
        skin_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(sectionskinacre.this,serum.class));
            }
        });
    }
}