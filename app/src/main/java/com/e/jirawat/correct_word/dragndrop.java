package com.e.jirawat.correct_word;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.DragEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class dragndrop extends AppCompatActivity {
    Button ansl,ansr;
    TextView score;
    ImageView quiz;
    private Question mQuiz=new Question();
    private String mAns;
    private int mscore = 0;
    private int mquizelen = mQuiz.imq.length;
    Random r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dragndrop);
        r=new Random();

        ansl = (Button) findViewById(R.id.ansl);
        ansr = (Button) findViewById(R.id.ansr);
        score = (TextView) findViewById(R.id.score);
        quiz = (ImageView) findViewById(R.id.quizz);
        upquiz(r.nextInt(mquizelen));
        ansr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ansr.getText()== mAns){
                    mscore++;
                    score.setText("Score: "+mscore);
                    upquiz(r.nextInt(mquizelen));
                }else
                    gameover();
            }
        });
        ansl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ansl.getText()== mAns){
                    mscore++;
                    score.setText("Score: "+mscore);
                    upquiz(r.nextInt(mquizelen));
                }else
                    gameover();
            }
        });
    }

    private void upquiz (int num){
        quiz.setImageResource(mQuiz.getquiz(num));
        ansr.setText(mQuiz.getans(num));
        ansl.setText(mQuiz.getans2(num));
        mAns = mQuiz.getCorans(num);
    }
    private void gameover(){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(dragndrop.this);
        alertDialog
                .setMessage("GameOver Your score is "+ mscore +" points")
                .setCancelable(false)
                .setPositiveButton("New Game",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                startActivity(new Intent(getApplicationContext(),dragndrop.class));
                                finish();
                            }
                        })
                .setNegativeButton("Exit",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        });
        AlertDialog alertDialog1 = alertDialog.create();
        alertDialog1.show();

    }
}