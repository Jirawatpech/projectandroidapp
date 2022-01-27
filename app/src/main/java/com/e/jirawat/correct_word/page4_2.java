package com.e.jirawat.correct_word;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class page4_2 extends AppCompatActivity {
    Button back,next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4_2);
        back = (Button) findViewById(R.id.backk);
        next = (Button) findViewById(R.id.nnext);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(page4_2.this,MainActivity.class);
                startActivity(back);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(page4_2.this,page4_3.class);
                startActivity(next);
            }
        });
    }
}
