package com.christ.inputcontroldemo;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Menu extends AppCompatActivity {

    RadioGroup rg;
    RadioButton veg;
    RadioButton nveg;
    FNveg nv = new FNveg();
    Fveg ve = new Fveg();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        rg=(RadioGroup)findViewById(R.id.radioGroup);
        veg=(RadioButton)findViewById(R.id.vegB);
        nveg=(RadioButton)findViewById(R.id.nonvegB);
        final Fveg ve = new Fveg();
        final FNveg nv = new FNveg();
        veg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment,ve);
                fragmentTransaction.commit();
            }
        });
        nveg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment,nv);
                fragmentTransaction.commit();
            }
        });
    }
}
