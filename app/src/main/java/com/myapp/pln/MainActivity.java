package com.myapp.pln;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button Inc, Dic;
    public TextView TView;
    int number =0 ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Inc= (Button)findViewById(R.id.Inc);
        Dic= (Button)findViewById(R.id.Dic);
        TView = (TextView)findViewById(R.id.textView);

        Inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number++;

                TView.setText(Integer.toString(number));

            }
        });

        Dic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number--;
                TView.setText(Integer.toString(number));
            }
        });

    }


}