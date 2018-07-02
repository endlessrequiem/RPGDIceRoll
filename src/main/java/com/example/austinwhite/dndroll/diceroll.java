package com.example.austinwhite.dndroll;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import java.util.Random;
import java.lang.String;


public class diceroll extends MainActivity {
    TextView mTextview;
    private String[] myString;
    private static final Random rgenerator = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diceroll);
        mTextview = (TextView) findViewById(R.id.textView3);


        Button Button1 = (Button) findViewById(R.id.button4);
        Button Button2 = (Button) findViewById(R.id.button5);
        Button Button3 = (Button) findViewById(R.id.button6);
        Button Button4 = (Button) findViewById(R.id.button7);
        Button Button5 = (Button) findViewById(R.id.button8);
        Button Button6 = (Button) findViewById(R.id.button9);
        Button Button7 = (Button) findViewById(R.id.button10);
        Button Button8 = (Button) findViewById(R.id.button11);
        Button Button9 = (Button) findViewById(R.id.button12);
        Button Button10 = (Button) findViewById(R.id.button13);
        Button Button11 = (Button) findViewById(R.id.button14);
        Button Button12 = (Button) findViewById(R.id.button15);
        Button Button13 = (Button) findViewById(R.id.button16);


        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int dice1 = (int) (Math.random() * 4 + 1);
                    int dice2 = (int) (Math.random() * 4 + 1);
                    int sum = dice1 + dice2;
                    StringBuilder sb = new StringBuilder();
                    String strI = Integer.toString(sum);
                    TextView output = (TextView) findViewById(R.id.textView3);
                    output.setText (strI);

            }
        });
        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int dice1 = (int) (Math.random() * 6 + 1);
                int dice2 = (int) (Math.random() * 6 + 1);
                int sum = dice1 + dice2;
                StringBuilder sb = new StringBuilder();
                String strI = Integer.toString(sum);
                TextView output = (TextView) findViewById(R.id.textView3);
                output.setText (strI);
            }
        });
        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int dice1 = (int) (Math.random() * 8 + 1);
                int dice2 = (int) (Math.random() * 8 + 1);
                int sum = dice1 + dice2;
                StringBuilder sb = new StringBuilder();
                String strI = Integer.toString(sum);
                TextView output = (TextView) findViewById(R.id.textView3);
                output.setText (strI);
            }
        });
        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int dice1 = (int) (Math.random() * 10 + 1);
                int dice2 = (int) (Math.random() * 10 + 1);
                int sum = dice1 + dice2;
                StringBuilder sb = new StringBuilder();
                String strI = Integer.toString(sum);
                TextView output = (TextView) findViewById(R.id.textView3);
                output.setText (strI);
            }
        });
        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int dice1 = (int) (Math.random() * 12 + 1);
                int dice2 = (int) (Math.random() * 12 + 1);
                int sum = dice1 + dice2;
                StringBuilder sb = new StringBuilder();
                String strI = Integer.toString(sum);
                TextView output = (TextView) findViewById(R.id.textView3);
                output.setText (strI);
            }
        });
        Button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int dice1 = (int) (Math.random() * 20 + 1);
                int dice2 = (int) (Math.random() * 20 + 1);
                int sum = dice1 + dice2;
                StringBuilder sb = new StringBuilder();
                String strI = Integer.toString(sum);
                TextView output = (TextView) findViewById(R.id.textView3);
                output.setText (strI);
            }
        });
        Button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int dice1 = (int) (Math.random() * 50 + 1);
                int dice2 = (int) (Math.random() * 50 + 1);
                int sum = dice1 + dice2;
                StringBuilder sb = new StringBuilder();
                String strI = Integer.toString(sum);
                TextView output = (TextView) findViewById(R.id.textView3);
                output.setText (strI);
            }
        });
        Button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Resources res = getResources();
                int dice1 = (int) (Math.random() * 4 + 1);
                StringBuilder sb = new StringBuilder();
                String strI = Integer.toString(dice1);
                if (dice1 == 1) {
                    myString = res.getStringArray(R.array.criticalmiss);

                    String w = myString[rgenerator.nextInt(myString.length)];

                    TextView output = (TextView) findViewById(R.id.textView3);
                    output.setText(w);

                } else if (dice1 == 4) {
                    myString = res.getStringArray(R.array.criticalhit);

                    String x = myString[rgenerator.nextInt(myString.length)];

                    TextView output = (TextView) findViewById(R.id.textView3);
                    output.setText(x);

                } else {
                    TextView output = (TextView) findViewById(R.id.textView3);
                    output.setText(strI);
                }
            }
        });
        Button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int dice1 = (int) (Math.random() * 6 + 1);
                StringBuilder sb = new StringBuilder();
                String strI = Integer.toString(dice1);
                Resources res = getResources();
                if (dice1 == 1) {
                    myString = res.getStringArray(R.array.criticalmiss);

                    String w = myString[rgenerator.nextInt(myString.length)];

                    TextView output = (TextView) findViewById(R.id.textView3);
                    output.setText(w);

                } else if (dice1 == 6) {
                    myString = res.getStringArray(R.array.criticalhit);

                    String x = myString[rgenerator.nextInt(myString.length)];

                    TextView output = (TextView) findViewById(R.id.textView3);
                    output.setText(x);

                } else {
                    TextView output = (TextView) findViewById(R.id.textView3);
                    output.setText(strI);
                }
            }
        });
        Button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int dice1 = (int) (Math.random() * 8 + 1);
                StringBuilder sb = new StringBuilder();
                String strI = Integer.toString(dice1);
                Resources res = getResources();
                if (dice1 == 1) {
                    myString = res.getStringArray(R.array.criticalmiss);

                    String w = myString[rgenerator.nextInt(myString.length)];

                    TextView output = (TextView) findViewById(R.id.textView3);
                    output.setText(w);

                } else if (dice1 == 8) {
                    myString = res.getStringArray(R.array.criticalhit);

                    String x = myString[rgenerator.nextInt(myString.length)];

                    TextView output = (TextView) findViewById(R.id.textView3);
                    output.setText(x);

                } else {
                    TextView output = (TextView) findViewById(R.id.textView3);
                    output.setText(strI);
                }
            }
        });
        Button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int dice1 = (int) (Math.random() * 10 + 1);
                StringBuilder sb = new StringBuilder();
                String strI = Integer.toString(dice1);
                Resources res = getResources();
                if (dice1 == 1) {
                    myString = res.getStringArray(R.array.criticalmiss);

                    String w = myString[rgenerator.nextInt(myString.length)];

                    TextView output = (TextView) findViewById(R.id.textView3);
                    output.setText(w);

                } else if (dice1 == 10) {
                    myString = res.getStringArray(R.array.criticalhit);

                    String x = myString[rgenerator.nextInt(myString.length)];

                    TextView output = (TextView) findViewById(R.id.textView3);
                    output.setText(x);

                } else {
                    TextView output = (TextView) findViewById(R.id.textView3);
                    output.setText(strI);
                }
            }
        });
        Button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int dice1 = (int) (Math.random() * 12 + 1);
                StringBuilder sb = new StringBuilder();
                String strI = Integer.toString(dice1);
                Resources res = getResources();
                if (dice1 == 1) {
                    myString = res.getStringArray(R.array.criticalmiss);

                    String w = myString[rgenerator.nextInt(myString.length)];

                    TextView output = (TextView) findViewById(R.id.textView3);
                    output.setText(w);

                } else if (dice1 == 12) {
                    myString = res.getStringArray(R.array.criticalhit);

                    String x = myString[rgenerator.nextInt(myString.length)];

                    TextView output = (TextView) findViewById(R.id.textView3);
                    output.setText(x);

                } else {
                    TextView output = (TextView) findViewById(R.id.textView3);
                    output.setText(strI);
                }
            }
        });
        Button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int dice1 = (int) (Math.random() * 20 + 1);
                StringBuilder sb = new StringBuilder();
                String strI = Integer.toString(dice1);
                Resources res = getResources();
                if (dice1 == 1) {
                    myString = res.getStringArray(R.array.criticalmiss);

                    String w = myString[rgenerator.nextInt(myString.length)];

                    TextView output = (TextView) findViewById(R.id.textView3);
                    output.setText(w);

                } else if (dice1 == 20) {
                    myString = res.getStringArray(R.array.criticalhit);

                    String x = myString[rgenerator.nextInt(myString.length)];

                    TextView output = (TextView) findViewById(R.id.textView3);
                    output.setText(x);

                } else {
                    TextView output = (TextView) findViewById(R.id.textView3);
                    output.setText(strI);
                }
            }
        });
    }
}
