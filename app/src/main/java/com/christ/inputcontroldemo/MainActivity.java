package com.christ.inputcontroldemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    DatePicker d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button2);
        d = (DatePicker) findViewById(R.id.datePicker);
//        new CountDownTimer(3000, 1000) {
//            @Override
//            public void onTick(long undef) {
//            }
//
//            public void onFinish() {
//
//                MainActivity.this.setContentView(R.layout.activity_main);
//            }
//        }.start();

        btn.setOnClickListener(new View.OnClickListener() {
              @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,TimeActivity.class);
                startActivity(i);
                finish();
            }
        });
        d.init(d.getYear(), d.getMonth(), d.getDayOfMonth(), new DatePicker.OnDateChangedListener() {
            public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
                Toast.makeText(getApplicationContext(),datePicker.getDayOfMonth() + "/" + datePicker.getMonth() + "/" + datePicker.getYear(),Toast.LENGTH_SHORT).show();
            }
        });
        }
}
