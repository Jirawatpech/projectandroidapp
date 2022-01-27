package com.e.jirawat.correct_word;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

public class sampletub2 extends AppCompatActivity {

    TextView text, text2;
    Toolbar mtoolbar;
    Button bt;
    Button bt2;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sampletub2);

        mtoolbar = (Toolbar) findViewById(R.id.toolbar21);
        text = (TextView) findViewById(R.id.tvtub1);
        bt = (Button) findViewById(R.id.bb1);
        bt2 = (Button) findViewById(R.id.bttt1);


        Bundle bundel = getIntent().getExtras();
        if (bundel != null) {
            mtoolbar.setTitle(bundel.getString("correct"));
            if (mtoolbar.getTitle().toString().equalsIgnoreCase("แอปเปิ้ล")) {
                text.setText(getResources().getText(R.string.tub1));

                mp = MediaPlayer.create(this, R.raw.t1);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("อารบิก")) {
                text.setText(getResources().getText(R.string.tub2));

                mp = MediaPlayer.create(this, R.raw.t2);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("บอล")) {
                text.setText(getResources().getText(R.string.tub3));
                mp = MediaPlayer.create(this, R.raw.t3);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("แบงก์")) {
                text.setText(getResources().getText(R.string.tub4));

                mp = MediaPlayer.create(this, R.raw.t4);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("เคเบิล")) {
                text.setText(getResources().getText(R.string.tub5));

                mp = MediaPlayer.create(this, R.raw.t5);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("การ์ด")) {
                text.setText(getResources().getText(R.string.tub6));

                mp = MediaPlayer.create(this, R.raw.t6);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("เซลล์")) {
                text.setText(getResources().getText(R.string.tub7));

                mp = MediaPlayer.create(this, R.raw.t7);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("เซลล์")) {
                text.setText(getResources().getText(R.string.tub8));

                mp = MediaPlayer.create(this, R.raw.t8);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("เช็ก")) {
                text.setText(getResources().getText(R.string.tub9));

                mp = MediaPlayer.create(this, R.raw.t9);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("คุกกี้")) {
                text.setText(getResources().getText(R.string.tub10));

                mp = MediaPlayer.create(this, R.raw.t10);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("ก๊อปปี้")) {
                text.setText(getResources().getText(R.string.tub11));

                mp = MediaPlayer.create(this, R.raw.t11);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("ดาวน์โหลด")) {
                text.setText(getResources().getText(R.string.tub12));

                mp = MediaPlayer.create(this, R.raw.t12);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("ไดร์ฟ")) {
                text.setText(getResources().getText(R.string.tub13));

                mp = MediaPlayer.create(this, R.raw.t13);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("อิเล็กทรอนิกส์")) {
                text.setText(getResources().getText(R.string.tub14));

                mp = MediaPlayer.create(this, R.raw.t14);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("ไฟร์วอลล์")) {
                text.setText(getResources().getText(R.string.tub15));

                mp = MediaPlayer.create(this, R.raw.t14);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            }else if (mtoolbar.getTitle().toString().equalsIgnoreCase("เฟิร์มแวร์")) {
                text.setText(getResources().getText(R.string.tub16));

                mp = MediaPlayer.create(this, R.raw.t17);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("เก้าอี้")) {
                text.setText(getResources().getText(R.string.tub17));

                mp = MediaPlayer.create(this, R.raw.t17);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("เกี๊ยว")) {
                text.setText(getResources().getText(R.string.tub18));

                mp = MediaPlayer.create(this, R.raw.t18);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("จับกัง")) {
                text.setText(getResources().getText(R.string.tub19));

                mp = MediaPlayer.create(this, R.raw.t19);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("โจ๊ก")) {
                text.setText(getResources().getText(R.string.tub20));

                mp = MediaPlayer.create(this, R.raw.t20);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            }else if (mtoolbar.getTitle().toString().equalsIgnoreCase("เฉาก๊วย")) {
                text.setText(getResources().getText(R.string.tub21));

                mp = MediaPlayer.create(this, R.raw.t1);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("ตังโอ๋")) {
                text.setText(getResources().getText(R.string.tub22));

                mp = MediaPlayer.create(this, R.raw.t22);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("เต้าทึง")) {
                text.setText(getResources().getText(R.string.tub23));

                mp = MediaPlayer.create(this, R.raw.t2);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("เถ้าแก่")) {
                text.setText(getResources().getText(R.string.tub24));

                mp = MediaPlayer.create(this, R.raw.t27);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("บะหมี่")) {
                text.setText(getResources().getText(R.string.tub25));

                mp = MediaPlayer.create(this, R.raw.sound15);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            }else if (mtoolbar.getTitle().toString().equalsIgnoreCase("ยี่ห้อ")) {
                text.setText(getResources().getText(R.string.tub26));

                mp = MediaPlayer.create(this, R.raw.sound11);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("อั้งโล่")) {
                text.setText(getResources().getText(R.string.tub27));

                mp = MediaPlayer.create(this, R.raw.t27);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("ปาท่องโก๋")) {
                text.setText(getResources().getText(R.string.tub28));

                mp = MediaPlayer.create(this, R.raw.t28);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("แฮ่กึ๊น")) {
                text.setText(getResources().getText(R.string.tub29));

                mp = MediaPlayer.create(this, R.raw.t29);
                bt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start();

                    }
                });
            } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("เต่า")) {
                text.setText(getResources().getText(R.string.tub30));

                mp = MediaPlayer.create(this, R.raw.t30);
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
                    Intent bt2 = new Intent(sampletub2.this,sampletub.class);
                }
            });


        }
    }
}
