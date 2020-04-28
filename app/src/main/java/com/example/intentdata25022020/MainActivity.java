package com.example.intentdata25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Person;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button mBtnString,mBtnArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnString = findViewById(R.id.buttonString);
        mBtnArray = findViewById(R.id.buttonArray);

        mBtnString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("chuoi","Xin chao main 2");
                startActivity(intent);
            }
        });

        mBtnArray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] strings = {"A","B","C","D","E","F"};
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("array",strings);
                startActivity(intent);
            }
        });

    }

}
