package com.example.intentdata25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Person;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Button mBtnString,mBtnArray,mBtnArrayList,mBtnObject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnString = findViewById(R.id.buttonString);
        mBtnArray = findViewById(R.id.buttonArray);
        mBtnArrayList = findViewById(R.id.buttonArrayList);
        mBtnObject = findViewById(R.id.buttonObject);

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

        mBtnArrayList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<String> arrayList = new ArrayList<>(
                        Arrays.asList("A","B","C","D")
                );
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("arraylist",arrayList);
                startActivity(intent);
            }
        });
        mBtnObject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<Animal> animals = new ArrayList<>();
                Animal meo = new Animal();
                meo.name = "Con mèo";
                meo.weight = 2;
                animals.add(meo);
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("object", animals);
                startActivity(intent);
            }
        });

    }

}
