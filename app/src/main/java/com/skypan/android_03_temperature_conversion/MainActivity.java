package com.skypan.android_03_temperature_conversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num;
    private Button tempChange;
    private TextView temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num = (EditText)findViewById(R.id.num);
        tempChange = (Button)findViewById(R.id.tempChange);
        temp = (TextView)findViewById(R.id.temp);
    }
    int i=0;
    public void temp(View view) {
        if(i==0){
            temp.setText(num.getEditableText().toString()+"°C");
            tempChange.setText("華氏");
            i=1;
        }
        else{
            int change = (Integer.parseInt(num.getEditableText().toString())*9/5)+32;
            temp.setText(Integer.toString(change)+"°F");
            tempChange.setText("攝氏");
            i=0;
        }
    }
}