package com.example.listview_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listVw);

        String[] colors = {"Blue", "Green", "Red", "Black", "Pink", "Orange", "Brown"};

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, R.layout.list_item, R.id.textView, colors);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                TextView textView = (TextView) view;
                Log.d("CLICK", colors[i]);
            }
        });
    }
}