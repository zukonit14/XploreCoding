package com.kunalapps.xplorecoding;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;
import android.widget.TextView;

public class progress_bar extends Activity {

    ProgressBar Progressbar;
    TextView ShowText;
    int progressBarValue = 0;
    Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        Progressbar = (ProgressBar)findViewById(R.id.progressBar1);
        ShowText = (TextView)findViewById(R.id.textView1);

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
                            ShowText.setText(progressBarValue +"/"+Progressbar.getMax());

                        }
                    });try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                }
            }
        }).start();
    }

}