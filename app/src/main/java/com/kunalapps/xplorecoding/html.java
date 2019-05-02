package com.kunalapps.xplorecoding;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class html extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("HTML");
        if(getSupportActionBar()!=null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_file,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home)
        {
            finish();
            return super.onOptionsItemSelected(item);
        }
        switch (item.getItemId())
        {
            case R.id.item1:
                Intent intent=new Intent(html.this,about.class);
                startActivity(intent);
                return true;
            case R.id.item4:
                Uri uri1= Uri.parse("https://play.google.com/store/apps/details?id=com.kunalapps.xplorecoding");
                Intent intent11=new Intent(Intent.ACTION_VIEW,uri1);
                startActivity(intent11);
                return true;
            case R.id.item2:
                Uri uri= Uri.parse("https://www.instagram.com/kunal_raut_apps/");
                Intent intent1=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent1);
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

    public void htmllearn(View htmllearn)
    {
        Intent intent=new Intent(html.this,webview.class);
        intent.putExtra("i","https://www.w3schools.com/html/default.asp");
        startActivity(intent);
    }
    public void cide(View cide)
    {
        Intent intent=new Intent(html.this,webview.class);
        intent.putExtra("i","https://www.onlinegdb.com/");
        startActivity(intent);
    }
    public void quiz(View cide)
    {
        Intent intent=new Intent(html.this,webview.class);
        intent.putExtra("i","https://www.geeksforgeeks.org/html-and-xml-gq/");
        startActivity(intent);
    }
    public void books(View cide)
    {
        Uri uri= Uri.parse("https://books.goalkicker.com/HTML5Book/");

        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        //intent.putExtra("i","https://www.codechef.com/ide");
        startActivity(intent);
    }
    public void sample(View cide)
    {
        Intent intent=new Intent(html.this,webview.class);
        intent.putExtra("i","https://www.w3schools.com/html/html_examples.asp");
        startActivity(intent);
    }
}
