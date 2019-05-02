package com.kunalapps.xplorecoding;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;
import android.widget.TextView;

public class KR extends AppCompatActivity {
    private static int splash = 2800;
    ProgressBar progressBar;
    int progress=0;
    ProgressBar Progressbar;
    TextView ShowText,ShowText1;
    int progressBarValue = 0;
    Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kr);
        Progressbar = (ProgressBar)findViewById(R.id.progressBar1);
       // ShowText = (TextView)findViewById(R.id.textView1);
        //ShowText1 = (TextView)findViewById(R.id.textView18);

        new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                while(progressBarValue < 100)
                {
                    progressBarValue++;

                    handler.post(new Runnable() {

                        @Override
                        public void run() {

                            Progressbar.setProgress(progressBarValue);


                        }
                    });try {
                    Thread.sleep(28);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                }
            }
        }).start();



        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent intent = new Intent(KR.this, mainmenu.class);
                startActivity(intent);
                finish();
            }
        }, splash);
    }

}
