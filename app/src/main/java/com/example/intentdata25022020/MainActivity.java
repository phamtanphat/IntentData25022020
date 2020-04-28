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

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    Button mBtnString,mBtnArray,mBtnArrayList,mBtnObject,mBtnSerializable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnString = findViewById(R.id.buttonString);
        mBtnArray = findViewById(R.id.buttonArray);
        mBtnArrayList = findViewById(R.id.buttonArrayList);
        mBtnObject = findViewById(R.id.buttonObject);
        mBtnSerializable = findViewById(R.id.buttonSerializable);

        mBtnString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
//                intent.putExtra("chuoi","Xin chao main 2");
//                startActivity(intent);
                sendIntentData("chuoi","Xin chao main 2");
            }
        });

        mBtnArray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] strings = {"A","B","C","D","E","F"};
//                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
//                intent.putExtra("array",strings);
//                startActivity(intent);
                sendIntentData("array",strings);
            }
        });

        mBtnArrayList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<String> arrayList = new ArrayList<>(
                        Arrays.asList("A","B","C","D")
                );
//                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
//                intent.putExtra("arraylist",arrayList);
//                startActivity(intent);
                sendIntentData("arraylist",arrayList);
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
        mBtnSerializable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Business business = new Business();
                business.address = "Quan 1";
                business.name = "Cong ty trach nhiem huu han 1 thanh vien";
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("serializable", business);
                startActivity(intent);
            }
        });
    }
    //generate type
    public <T> void sendIntentData(String key , T value){
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        if (value instanceof String){
            intent.putExtra(key, (String) value);
        }
        if (value instanceof String[]){
            intent.putExtra(key, (String[]) value);
        }
        if (value instanceof ArrayList<?>){
            if (value instanceof Object){
                intent.putExtra(key, (ArrayList<String>) value);
            }
        }
        startActivity(intent);
    }


}
