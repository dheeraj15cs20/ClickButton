package com.example.adc.clickbutton;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    int x;
    Button b1,b2 ;
    LinearLayout ll1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.b1);
        ll1 = (LinearLayout) findViewById(R.id.ll1);
        b2 = (Button)findViewById(R.id.b2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x++;
                if (x==1)
                {
                    ll1.setBackgroundColor(Color.RED);
                }
                else if(x==2)
                {
                    ll1.setBackgroundColor(Color.BLUE);
                }
                else if (x==3)
                {
                    ll1.setBackgroundColor(Color.CYAN);
                }
                else {
                    ll1.setBackgroundColor(Color.WHITE);
                    x=0;
                }

            }
        });

     b2.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent i = new Intent(MainActivity.this,Main2Activity.class);
             startActivity(i);
         }
     });
    }

}