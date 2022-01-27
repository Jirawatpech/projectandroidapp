package com.e.jirawat.correct_word;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page3_1 extends AppCompatActivity {
    Button back,next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3_1);

        back = (Button) findViewById(R.id.back);
        next = (Button) findViewById(R.id.next);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(page3_1.this,MainActivity.class);
                startActivity(back);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(page3_1.this,page3_2.class);
                startActivity(next);
            }
        });
    }
}