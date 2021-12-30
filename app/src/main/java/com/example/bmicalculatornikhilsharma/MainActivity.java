package com.example.bmicalculatornikhilsharma;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button b,spotify;
    private TextView answer;
    private TextView answer2;
    private EditText h,w;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spotify = (Button)findViewById(R.id.button2);
        h=(EditText) findViewById(R.id.editTextNumberDecimal);
        w=(EditText) findViewById(R.id.editTextNumberDecimal2);
        answer=(TextView) findViewById(R.id.textView5);
        answer2=(TextView) findViewById(R.id.textView6);
        b=(Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener()
        {
            @Override

            public void onClick(View v) {
                float weight = Integer.parseInt(w.getText().toString());
                float height = Integer.parseInt(h.getText().toString());
                float bmi = weight / (height / 100 * height / 100);
                answer.setText(String.valueOf("BMI = " + bmi));
                if (bmi < 16) {
                    answer2.setText("Underweight");
                } else if (bmi > 40) {
                    answer2.setText("Over weight class 2");
                } else if (bmi > 16 && bmi < 26) {
                    answer2.setText("Normal Weight");
                } else {
                    answer2.setText("Over weight class 1");
                }
            }

        }
        );
        spotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openspotify();
            }
        });
    }
    public void openspotify()
    {
        Intent spo = new Intent(this,spotify.class);
        startActivity(spo);
    }
}