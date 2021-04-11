package com.example.diacare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class calculateright extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculateright);
    }

    public void finalactivity(View view) {
        Intent i=new Intent(calculateright.this,fianlresult.class);
        startActivity(i);
    }
}
