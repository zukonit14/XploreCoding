package com.kunalapps.xplorecoding;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class website extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Best Websites");
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
                Intent intent=new Intent(website.this,about.class);
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

    public void ggeeksforgeeks(View clearn)
    {
        Intent intent=new Intent(website.this,webview.class);
        intent.putExtra("i","https://www.geeksforgeeks.org/");
        startActivity(intent);
    }

    public void w3school(View clearn)
    {
        Intent intent=new Intent(website.this,webview.class);
        intent.putExtra("i","https://www.w3schools.com/");
        startActivity(intent);
    }
    public void stack(View clearn)
    {
        Intent intent=new Intent(website.this,webview.class);
        intent.putExtra("i","https://stackoverflow.com/");
        startActivity(intent);
    }
    public void freecode(View clearn)
    {
        Intent intent=new Intent(website.this,webview.class);
        intent.putExtra("i","https://www.freecodecamp.org/");
        startActivity(intent);
    }
    public void github(View clearn)
    {
        Intent intent=new Intent(website.this,webview.class);
        intent.putExtra("i","https://github.com/");
        startActivity(intent);
    }
    public void codeac(View clearn)
    {
        Intent intent=new Intent(website.this,webview.class);
        intent.putExtra("i","https://www.codecademy.com/");
        startActivity(intent);
    }
    public void tutopt(View clearn)
    {
        Intent intent=new Intent(website.this,webview.class);
        intent.putExtra("i","https://www.codecademy.com/");
        startActivity(intent);
    }
    public void khan(View clearn)
    {
        Intent intent=new Intent(website.this,webview.class);
        intent.putExtra("i","https://www.khanacademy.org/computing/computer-programming");
        startActivity(intent);
    }

    public void javapt(View clearn)
    {
        Intent intent=new Intent(website.this,webview.class);
        intent.putExtra("i","https://www.javatpoint.com/");
        startActivity(intent);
    }

    public void programiz(View clearn)
    {
        Intent intent=new Intent(website.this,webview.class);
        intent.putExtra("i","https://www.programiz.com/");
        startActivity(intent);
    }

    public void codepen(View clearn)
    {
        Intent intent=new Intent(website.this,webview.class);
        intent.putExtra("i","https://codepen.io/");
        startActivity(intent);
    }


    public void youtube(View viewfb)
    {
        Uri uri= Uri.parse("https://www.youtube.com/channel/UCgNXTepSee_4s9Heiylj1EQ/channels?view_as=subscriber");
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}
