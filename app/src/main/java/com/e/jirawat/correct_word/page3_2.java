package com.e.jirawat.correct_word;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page3_2 extends AppCompatActivity {
    Button next,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3_2);

        back = (Button) findViewById(R.id.back);
        next = (Button) findViewById(R.id.next);




        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(page3_2.this,page3_1.class);
                startActivity(back);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(page3_2.this,samplepong.class);
                startActivity(next);
            }
        });
    }
}
