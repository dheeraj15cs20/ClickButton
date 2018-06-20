package com.example.adc.clickbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {
    Button button;
    ImageView iv;
    Boolean res= true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button=(Button) findViewById(R.id.button);
        iv=(ImageView)findViewById(R.id.iv);


    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (res==true){
                iv.setImageResource(R.drawable.dm);
                res=false;
            }
            else{
                iv.setImageResource(R.drawable.ad);
                res=true;
            }
        }
    });
    }
}
