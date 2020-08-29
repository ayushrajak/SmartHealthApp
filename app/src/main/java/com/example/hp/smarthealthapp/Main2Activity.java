package com.example.hp.blooddonorapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.sql.*;


public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button b4=(Button)findViewById(R.id.button);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x=new Intent(Main2Activity.this,all.class);
                startActivity(x);
            }
        });
    }
    public void regclick(View v)
    {
        EditText t1=(EditText)findViewById(R.id.editText);
        EditText t2=(EditText)findViewById(R.id.editText2);
        Spinner s1=(Spinner)findViewById(R.id.spinner);
        Spinner s2=(Spinner)findViewById(R.id.spinner2);

        String name=t1.getText().toString();
        String mob=t2.getText().toString();
        String city=s1.getSelectedItem().toString();
        String bg=s2.getSelectedItem().toString();
        if(name.length()==0 || mob.length()==0)
        {
            Toast.makeText(this,"Value Cannot Be Empty",Toast.LENGTH_SHORT).show();
        }
        try{
            String sql="insert into regblood values('"+name+"','"+mob+"','"+bg+"','"+city+"')";
            ConnectionClass c=new ConnectionClass();
            Connection conn=c.CONN();
            Statement stat=conn.createStatement();
            stat.execute(sql);
            conn.close();
            Toast.makeText(this,"Record Saved",Toast.LENGTH_SHORT).show();
        }
        catch(Exception e)
        {

            Toast.makeText(this,e.toString(),Toast.LENGTH_SHORT).show();
        }
    }
}
