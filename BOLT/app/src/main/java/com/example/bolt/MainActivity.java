package com.example.bolt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void readCard(View view){
        Intent intent = new Intent(this, readCardActivity.class);
        startActivity(intent);
    }
    public void emulateCard(View view){
        Intent intent = new Intent(this, emulateCardActivity.class);
        startActivity(intent);
    }
}
