package com.example.array_adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayAdapter arrayAdapter;
    ListView listView;
    String names[]={"sanskar","rohit","ravi","dev","ritik"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayAdapter=new ArrayAdapter(this,R.layout.activity_items,R.id.item,names);
        listView=(ListView) findViewById(R.id.listview);
        listView.setAdapter(arrayAdapter);

    }
}