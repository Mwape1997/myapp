package com.example.mwape.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


   TextView text = (TextView) findViewById(R.id.textView);
    Button button  = (Button) findViewById(R.id.button);
    EditText edit = (EditText) findViewById(R.id.editText);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {

        if(button.isActivated()){
            text.setText("hahjashbhdsahdbashdkasjhd");
        }

    }
}
