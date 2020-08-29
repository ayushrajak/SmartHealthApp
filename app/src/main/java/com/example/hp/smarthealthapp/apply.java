package com.example.hp.blooddonorapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class apply extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply);
        Button b1=(Button)findViewById(R.id.button11);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x=new Intent(apply.this,apply1.class);
                startActivity(x);
            }
        });
        Spinner p1=(Spinner)findViewById(R.id.spinner5);
        String spec=p1.getSelectedItem().toString();
    }
}
