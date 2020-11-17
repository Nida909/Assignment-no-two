package com.example.mynew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity3 extends AppCompatActivity {
        String strn;
        int j=0;
        ListView lt;
        TextView te;

        String[] arr;
        List<String> lis=new ArrayList<>();
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent it = getIntent();
        strn = it.getStringExtra("val");
        arr = getResources().getStringArray(R.array.Country);
        lt = (ListView) findViewById(R.id.lv);
        te=(TextView)findViewById(R.id.text);
        for (int i = 0; i < arr.length; i++) {
        if (arr[i].startsWith(strn)) {
            lis.add(arr[i]);
            j++;
        }
        }
        if(j>=0) {
            te.setText("Country names starting with "+strn+" are :");

            ArrayAdapter<String> adapt = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lis);
            lt.setAdapter(adapt);
        }
        else
        {
            te.setText("There are no such Country name Starting with "+strn+" . ");
        }

        }
        }