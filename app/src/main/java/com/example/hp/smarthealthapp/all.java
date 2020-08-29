package com.example.hp.blooddonorapp;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class all extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all);
        Button b1=(Button)findViewById(R.id.button7);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent x=new Intent(all.this,apply.class);
                Intent x=new Intent(all.this,apply.class);
                startActivity(x);
            }
        });
        Button b8=(Button)findViewById(R.id.button8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x=new Intent(all.this,doctor.class);
                startActivity(x);
            }
        });
        Button b10=(Button)findViewById(R.id.button10);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x=new Intent(all.this,ambu.class);
                startActivity(x);
            }
        });
    }
}
