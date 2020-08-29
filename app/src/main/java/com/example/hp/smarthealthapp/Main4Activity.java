package com.example.hp.blooddonorapp;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import java.sql.*;
import java.util.ArrayList;

import android.view.*;

import com.example.hp.blooddonorapp.ConnectionClass;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public void searchclick(View v)
    {
        //Spinner s1=(Spinner)findViewById(R.id.spinner3);
        //Spinner s2=(Spinner)findViewById(R.id.spinner4);
        GridView gv=(GridView)findViewById(R.id.abc);
        //String city =s1.getSelectedItem().toString();
        //String bg=s2.getSelectedItem().toString();
        try
        {
            String sql="select * from t_input1";
            ConnectionClass c=new ConnectionClass();
            Connection conn=c.CONN();
            Statement stat=conn.createStatement();
            ResultSet rs=stat.executeQuery(sql);
            ArrayList data=new ArrayList();
            data.add("ID");
            data.add("Impacts");
            while(rs.next())
            {
                data.add(rs.getString(1));
                data.add(rs.getString(2));
            }
            gv.setNumColumns(2);
            ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
            gv.setAdapter(adapter);
        }
        catch(Exception e)
        {
            Toast.makeText(this,e.toString(),Toast.LENGTH_LONG).show();
        }

    }

}