package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> tasks =  new ArrayList<String>();
        tasks.add("Task 1 Added");


        ArrayAdapter adapter = new ArrayAdapter<String>(this,
               android.R.layout.simple_list_item_1, tasks);

        listView = (ListView) findViewById(R.id.tasks);
        textview = (TextView) findViewById(R.id.editText);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String txt = "Item " + (position + 1) + " : " + ((TextView) view).getText().toString() ;
                Toast toast  = Toast.makeText(MainActivity.this, txt , Toast.LENGTH_LONG);
                toast.show();
            }
        });


        textview.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                tasks.add(textview.getText().toString());
                adapter.notifyDataSetChanged();
                textview.setText("");
                return false;
            }}
        );




    }


}