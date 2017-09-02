package com.example.a4.animatebulb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void animateBlue(View view)
    {
        ImageView i=(ImageView)findViewById(R.id.blueBulb);
        ImageView j=(ImageView)findViewById(R.id.greenBulb);

        i.animate().alpha(1).setDuration(1000);
        j.animate().alpha(0).setDuration(1000);
    }

    public void animateGreen(View view)
    {
        ImageView i=(ImageView)findViewById(R.id.blueBulb);
        ImageView j=(ImageView)findViewById(R.id.greenBulb);

        i.animate().alpha(0).setDuration(1000);
        j.animate().alpha(1).setDuration(1000);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

