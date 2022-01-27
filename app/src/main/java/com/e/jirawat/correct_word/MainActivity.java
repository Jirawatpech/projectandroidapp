package com.e.jirawat.correct_word;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bt1,bt2,bt3,bt4,bt5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);
        bt4 = (Button) findViewById(R.id.bt4);
        bt5 =  (Button) findViewById(R.id.bt5);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Bt1 = new Intent(MainActivity.this,page2_1.class);
                startActivity(Bt1);
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Bt5 = new Intent(MainActivity.this,page3_1.class);
                startActivity(Bt5);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Bt4 = new Intent(MainActivity.this,dragndrop.class);
                startActivity(Bt4);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Bt2 = new Intent(MainActivity.this,page4_1.class);
                startActivity(Bt2);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Bt3 = new Intent(MainActivity.this,page4_2.class);
                startActivity(Bt3);
            }
        });
    }
}