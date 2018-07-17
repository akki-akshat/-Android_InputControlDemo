package com.christ.inputcontroldemo;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        btn=(Button)findViewById(R.id.button2);
        new CountDownTimer(3000,1000){
            @Override
            public void onTick(long undef){}
                public void onFinish(){

                MainActivity.this.setContentView(R.layout.activity_main);
                }
        }.start();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,TimeActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
