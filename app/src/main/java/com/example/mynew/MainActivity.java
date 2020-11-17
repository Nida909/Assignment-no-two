package com.example.mynew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ed;
    EditText et;
    TextView te;
String ss,str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onpclck(View v)
    {

        ed=(EditText)findViewById(R.id.edt);
        et=(EditText) findViewById(R.id.etd);
        ss=ed.getText().toString();
        str=et.getText().toString();
        Intent intent = new Intent(this,confirm.class);

        intent.putExtra("v1", ss);

        intent.putExtra("v2", str);
        startActivity(intent);


    }

}