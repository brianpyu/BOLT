package com.example.bolt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class readCardActivity extends AppCompatActivity {
    static final int REQUEST_CODE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_card);
    }

    public void initTxn(View view) {
        Uri webpage = Uri.parse("http://www.google.com");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        PackageManager packageManager = getPackageManager();
        List<ResolveInfo> activities = packageManager.queryIntentActivities(webIntent,
                PackageManager.MATCH_DEFAULT_ONLY);
        boolean isIntentSafe = activities.size() > 0;
        if(isIntentSafe){
            startActivityForResult(webIntent, REQUEST_CODE);
        }
        /*
        try {
            URL myURL = new URL("http://example.com/");
            URLConnection myURLConnection = myURL.openConnection();
            myURLConnection.connect();
        }
        catch (MalformedURLException e) {
            // new URL() failed
            // ...
        }
        catch (IOException e) {
            // openConnection() failed
            // ...
        } */
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data){

    }
}
