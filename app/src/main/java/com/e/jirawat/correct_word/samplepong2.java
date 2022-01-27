package com.e.jirawat.correct_word;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toolbar;

public class samplepong2 extends AppCompatActivity {

        TextView text, text2;
        Toolbar mtoolbar;
        Button bt;
        Button bt2;
        MediaPlayer mp;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_samplepong2);

            mtoolbar = (Toolbar) findViewById(R.id.toolbar211);
            text = (TextView) findViewById(R.id.tvtub11);
            bt = (Button) findViewById(R.id.bb11);
            bt2 = (Button) findViewById(R.id.bttt11);


            Bundle bundel = getIntent().getExtras();
            if (bundel != null) {
                mtoolbar.setTitle(bundel.getString("correct"));
                if (mtoolbar.getTitle().toString().equalsIgnoreCase("กรี")) {
                    text.setText(getResources().getText(R.string.expong1));

                    mp = MediaPlayer.create(this, R.raw.sp1);
                    bt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mp.start();

                        }
                    });
                } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("กรอด")) {
                    text.setText(getResources().getText(R.string.expong2));

                    mp = MediaPlayer.create(this, R.raw.sp2);
                    bt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mp.start();

                        }
                    });
                } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("เกราะ")) {
                    text.setText(getResources().getText(R.string.expong3));
                    mp = MediaPlayer.create(this, R.raw.sp3);
                    bt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mp.start();

                        }
                    });
                } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("เขมา")) {
                    text.setText(getResources().getText(R.string.expong4));

                    mp = MediaPlayer.create(this, R.raw.sp4);
                    bt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mp.start();

                        }
                    });
                } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("แขม")) {
                    text.setText(getResources().getText(R.string.expong5));

                    mp = MediaPlayer.create(this, R.raw.sp15);
                    bt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mp.start();

                        }
                    });
                } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("ครุ")) {
                    text.setText(getResources().getText(R.string.expong6));

                    mp = MediaPlayer.create(this, R.raw.sound6);
                    bt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mp.start();

                        }
                    });
                } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("ตนุ")) {
                    text.setText(getResources().getText(R.string.expong7));

                    mp = MediaPlayer.create(this, R.raw.sound7);
                    bt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mp.start();

                        }
                    });
                } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("ตรุ")) {
                    text.setText(getResources().getText(R.string.expong8));

                    mp = MediaPlayer.create(this, R.raw.sp8);
                    bt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mp.start();

                        }
                    });
                } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("ทิว")) {
                    text.setText(getResources().getText(R.string.expong9));

                    mp = MediaPlayer.create(this, R.raw.sp9);
                    bt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mp.start();

                        }
                    });
                } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("เทว")) {
                    text.setText(getResources().getText(R.string.expong10));

                    mp = MediaPlayer.create(this, R.raw.sp10);
                    bt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mp.start();

                        }
                    });
                } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("ปถวี")) {
                    text.setText(getResources().getText(R.string.expong11));

                    mp = MediaPlayer.create(this, R.raw.sp11);
                    bt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mp.start();

                        }
                    });
                } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("ปรัก")) {
                    text.setText(getResources().getText(R.string.expong12));

                    mp = MediaPlayer.create(this, R.raw.sp12);
                    bt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mp.start();

                        }
                    });
                } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("ปรามาส")) {
                    text.setText(getResources().getText(R.string.expong13));

                    mp = MediaPlayer.create(this, R.raw.sp13);
                    bt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mp.start();

                        }
                    });
                } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("ปละ")) {
                    text.setText(getResources().getText(R.string.expong14));

                    mp = MediaPlayer.create(this, R.raw.sp14);
                    bt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mp.start();

                        }
                    });
                } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("ปักเป้า")) {
                    text.setText(getResources().getText(R.string.expong15));

                    mp = MediaPlayer.create(this, R.raw.sp15);
                    bt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mp.start();

                        }
                    });
                }else if (mtoolbar.getTitle().toString().equalsIgnoreCase("กาน")) {
                    text.setText(getResources().getText(R.string.expong16));

                    mp = MediaPlayer.create(this, R.raw.sp16);
                    bt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mp.start();

                        }
                    });
                } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("กาน")) {
                    text.setText(getResources().getText(R.string.expong17));

                    mp = MediaPlayer.create(this, R.raw.sp16);
                    bt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mp.start();

                        }
                    });
                } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("เกด")) {
                    text.setText(getResources().getText(R.string.expong18));

                    mp = MediaPlayer.create(this, R.raw.sp18);
                    bt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mp.start();

                        }
                    });
                } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("รัด")) {
                    text.setText(getResources().getText(R.string.expong19));

                    mp = MediaPlayer.create(this, R.raw.sp19);
                    bt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mp.start();

                        }
                    });
                } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("สัน")) {
                    text.setText(getResources().getText(R.string.expong20));

                    mp = MediaPlayer.create(this, R.raw.sp20);
                    bt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mp.start();

                        }
                    });
                }else if (mtoolbar.getTitle().toString().equalsIgnoreCase("พัน")) {
                    text.setText(getResources().getText(R.string.expong21));

                    mp = MediaPlayer.create(this, R.raw.sp21);
                    bt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mp.start();

                        }
                    });
                } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("ประสบ")) {
                    text.setText(getResources().getText(R.string.expong22));

                    mp = MediaPlayer.create(this, R.raw.sp22);
                    bt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mp.start();

                        }
                    });
                } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("พัด")) {
                    text.setText(getResources().getText(R.string.expong23));

                    mp = MediaPlayer.create(this, R.raw.sp23);
                    bt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mp.start();

                        }
                    });
                } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("บาด")) {
                    text.setText(getResources().getText(R.string.expong24));

                    mp = MediaPlayer.create(this, R.raw.sp24);
                    bt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mp.start();

                        }
                    });
                } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("นาด")) {
                    text.setText(getResources().getText(R.string.expong25));

                    mp = MediaPlayer.create(this, R.raw.sp25);
                    bt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mp.start();

                        }
                    });
                }else if (mtoolbar.getTitle().toString().equalsIgnoreCase("โจด")) {
                    text.setText(getResources().getText(R.string.expong26));

                    mp = MediaPlayer.create(this, R.raw.sp25);
                    bt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mp.start();

                        }
                    });
                } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("จัน ")) {
                    text.setText(getResources().getText(R.string.expong27));

                    mp = MediaPlayer.create(this, R.raw.sp25);
                    bt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mp.start();

                        }
                    });
                } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("คัน")) {
                    text.setText(getResources().getText(R.string.expong28));

                    mp = MediaPlayer.create(this, R.raw.sp24);
                    bt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mp.start();

                        }
                    });
                } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("เกียด")) {
                    text.setText(getResources().getText(R.string.expong29));

                    mp = MediaPlayer.create(this, R.raw.sp29);
                    bt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            mp.start();

                        }
                    });
                } else if (mtoolbar.getTitle().toString().equalsIgnoreCase("โกด")) {
                    text.setText(getResources().getText(R.string.expong30));

                    mp = MediaPlayer.create(this, R.raw.sp30);
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
                        Intent bt2 = new Intent(samplepong2.this,samplepong.class);
                    }
                });


            }
        }
    }


