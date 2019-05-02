package com.kunalapps.xplorecoding;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webview extends AppCompatActivity {
        private WebView webView;
        private String iwebview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);


        Intent intent=getIntent();
        iwebview=intent.getStringExtra("i");
        webView = (WebView) findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl(iwebview);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setBuiltInZoomControls(true);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Xplore Coding");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_file,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.item1:
                Intent intent=new Intent(webview.this,about.class);
                startActivity(intent);
                return true;
            case R.id.item2:
                Uri uri= Uri.parse("https://www.instagram.com/kunal_raut_apps/");
                Intent intent1=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent1);
                return true;
            case R.id.item4:
                Uri uri1= Uri.parse("https://play.google.com/store/apps/details?id=com.kunalapps.xplorecoding");
                Intent intent11=new Intent(Intent.ACTION_VIEW,uri1);
                startActivity(intent11);
                return true;
            case R.id.item3:
                Intent intent2=new Intent(Intent.ACTION_SEND);
                intent2.setType("text/plain");
                String sharebody="Download the best Coding app 'XPLORE CODING' : https://play.google.com/store/apps/details?id=com.kunalapps.xplorecoding";
                //String sharesub="subject here";
                //intent2.putExtra(Intent.EXTRA_SUBJECT,sharesub);
                intent2.putExtra(Intent.EXTRA_TEXT,sharebody);
                startActivity(Intent.createChooser(intent2,"share using"));
                return true;
        }
        return true;
    }




    @Override
    public void onBackPressed() {
        if(webView.canGoBack())
        {
            webView.goBack();
        }
        else {


            super.onBackPressed();
        }
    }
}
