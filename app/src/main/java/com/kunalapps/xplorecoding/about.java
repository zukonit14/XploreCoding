package com.kunalapps.xplorecoding;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

    }
    public void fb(View viewfb)
    {
        Uri uri= Uri.parse("https://www.facebook.com/kunalraut.1401");
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
    public void insta(View viewfb)
    {
        Uri uri= Uri.parse("https://www.instagram.com/kunal_raut_apps/");
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
    public void playstore(View viewfb)
    {
        Uri uri= Uri.parse("https://play.google.com/store/apps/details?id=com.kunalapps.xplorecoding");
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }

}
