package com.example.mynew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

public class confirm extends AppCompatActivity {
TextView tv;
    String ml,pp;
    String str=" ";
    boolean bb=false;
    boolean bool=false;
    String[] alphabets;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_confirm);
        Intent inten = getIntent();

        ml = inten.getStringExtra("v1");

        pp = inten.getStringExtra("v2");
        intent = new Intent(this, MainActivity3.class);
        String[] mail = getResources().getStringArray(R.array.email);
        String[] pord= getResources().getStringArray(R.array.password);
        GridView gv=(GridView)findViewById(R.id.gd);

        tv=(TextView)findViewById(R.id.tt) ;
        for(int j=0;j<10;j++)
        {
            if((ml.equals(mail[j]))&&(pp.equals(pord[j]))) {
                bb = true;
            }
        }
        if(bb==false) {
            tv.setVisibility(View.VISIBLE);
            tv.setText("Invalid email address or password");



        }
        else
        {

            alphabets = getResources().getStringArray(R.array.Alpha);
            ArrayAdapter<String> adpt=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,alphabets);
            gv.setVisibility(View.VISIBLE);
            gv.setAdapter(adpt);
            gv.setOnItemClickListener(new AdapterView.OnItemClickListener()

            {

                public void onItemClick(AdapterView<?> parent, View v, int position, long id)
                {
                     str=alphabets[position];

                    intent.putExtra("val", str);
                    startActivity(intent);

                }

            });


        }

    }
}