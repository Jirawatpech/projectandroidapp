package com.e.jirawat.correct_word;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

public class tub2 extends AppCompatActivity {
    TextView text, text2;
    Toolbar mtoolbar;
    Button bt;
    Button bt2;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tub2);

        mtoolbar = (Toolbar) findViewById(R.id.toolbar2);
        text = (TextView) findViewById(R.id.tt1);
        bt = (Button) findViewById(R.id.bb);
        bt2 = (Button) findViewById(R.id.bttt);
        text2 = (TextView) findViewById(R.id.tvtub);

      Bundle bundel = getIntent().getExtras();
        if (bundel != null) {
            mtoolbar.setTitle(bundel.getString("correct"));
            if (mtoolbar.getTitle().toString().equalsIgnoreCase("ต่าง ๆ นานา")) {
                text.setText(getResources().getText(R.string.ec1));
                text2.setText(getResources().getText(R.string.ec1_1));
                mp = MediaPlayer.create(this, R.raw.sound1);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("โควต้า")) {
                text.setText(getResources().getText(R.string.ec2));
                text2.setText(getResources().getText(R.string.ec2_1));
                mp = MediaPlayer.create(this, R.raw.sound2);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("ผัดวันประกันพรุ่ง")) {
                text.setText(getResources().getText(R.string.ec3));
                text2.setText(getResources().getText(R.string.ec3_1));
                mp = MediaPlayer.create(this, R.raw.sound3);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("ผาสุก")) {
                text.setText(getResources().getText(R.string.ec4));
                text2.setText(getResources().getText(R.string.ec4_1));
                mp = MediaPlayer.create(this, R.raw.sound4);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("พะแนง")) {
                text.setText(getResources().getText(R.string.ec5));
                text2.setText(getResources().getText(R.string.ec5_1));
                mp = MediaPlayer.create(this, R.raw.sound5);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("หย่าร้าง")) {
                text.setText(getResources().getText(R.string.ec6));
                text2.setText(getResources().getText(R.string.ec6_1));
                mp = MediaPlayer.create(this, R.raw.sound6);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("อนุญาต")) {
                text.setText(getResources().getText(R.string.ec7));
                text2.setText(getResources().getText(R.string.ec7_1));
                mp = MediaPlayer.create(this, R.raw.sound7);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("ขี้เกียจ")) {
                text.setText(getResources().getText(R.string.ec8));
                text2.setText(getResources().getText(R.string.ec8_1));
                mp = MediaPlayer.create(this, R.raw.sound8);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("ศีรษะ")) {
                text.setText(getResources().getText(R.string.ec9));
                text2.setText(getResources().getText(R.string.ec9_1));
                mp = MediaPlayer.create(this, R.raw.sound9);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("คลินิก")) {
                text.setText(getResources().getText(R.string.ec10));
                text2.setText(getResources().getText(R.string.ec10_1));
                mp = MediaPlayer.create(this, R.raw.sound10);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("ใบกะเพรา")) {
                text.setText(getResources().getText(R.string.ec11));
                text2.setText(getResources().getText(R.string.ec11_1));
                mp = MediaPlayer.create(this, R.raw.sound11);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("สัปปะรด")) {
                text.setText(getResources().getText(R.string.ec12));
                text2.setText(getResources().getText(R.string.ec12_1));
                mp = MediaPlayer.create(this, R.raw.sound12);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("รถเมล์")) {
                text.setText(getResources().getText(R.string.ec13));
                text2.setText(getResources().getText(R.string.ec13_1));
                mp = MediaPlayer.create(this, R.raw.sound13);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("สังเกต")) {
                text.setText(getResources().getText(R.string.ec14));
                text2.setText(getResources().getText(R.string.ec14_1));
                mp = MediaPlayer.create(this, R.raw.sound14);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("แอปพลิเคชัน")) {
                text.setText(getResources().getText(R.string.ec15));
                text2.setText(getResources().getText(R.string.ec15_1));
                mp = MediaPlayer.create(this, R.raw.sound15);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            }
            bt2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent bt2 = new Intent(tub2.this,tub.class);
                }
            });


        }
    }
}

