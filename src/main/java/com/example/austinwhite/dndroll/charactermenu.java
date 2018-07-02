package com.example.austinwhite.dndroll;

import java.lang.String;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;
import android.content.res.Resources;



public class charactermenu extends MainActivity {
    TextView name;
    Button Button1;
    private String[] myString;
    private static final Random rgenerator = new Random();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.charactermenu);
        name = (TextView) findViewById(R.id.textView6);



        Button1 = (Button) findViewById(R.id.button20);


        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Resources res = getResources();

                myString = res.getStringArray(R.array.myArray);

                String q = myString[rgenerator.nextInt(myString.length)];



                TextView output1 = (TextView) findViewById(R.id.textView6);
                output1.setText(q);

            }
        });
    }

}


