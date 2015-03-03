package com.example.christopher.jcccmobiletestapp;

import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;


public class MyActivity extends ActionBarActivity {
    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void searchJCCC(View view) {
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.jccc.edu/search.html?q="+message)));
    }

    public void facebookNav(View view)
    {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://www.facebook.com/JCCC411")));
    }

    public void twitterNav(View view)
    {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://twitter.com/jccctweet")));
    }

    public void linkedinNav(View view)
    {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://www.linkedin.com/company/johnson-county-community-college")));
    }

    public void youtubeNav(View view)
    {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://www.youtube.com/user/JCCCvideo")));
    }


    public void callPolice(View view)
    {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:9134692500"));
        startActivity(intent);
    }

}
