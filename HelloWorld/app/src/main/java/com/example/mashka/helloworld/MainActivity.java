package com.example.mashka.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Integer> names = new ArrayList();
    private String[] namesStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        names.add(1);
        names.add(4);

        ListView IvMain = (ListView) findViewById(R.id.listView);

        ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>(this,
                android.R.layout.simple_list_item_1, names);
        IvMain.setAdapter(adapter);


    }

    public void onClick(View v) {

        String strHello = "Hello";
        String strWorld = "World";

        ((TextView) findViewById(R.id.textView)).setText(strHello + " " + strWorld);

    }
}
