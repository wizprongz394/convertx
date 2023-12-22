package com.example.convertx;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
       TextView textView = findViewById(R.id.textView);
       EditText editText = findViewById(R.id.editText);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(MainActivity.this, "IN PROGRESS", Toast.LENGTH_SHORT).show();
               String s = editText.getText().toString();
               int cel=Integer.parseInt(s);
               double fah= (cel*1.8)+32;
               textView.setText("temperarture in fahrenheit is: " + fah);


           }
       });
    }
}