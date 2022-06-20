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

        ArrayList<Task> tasks =  new ArrayList<Task>();

        // Creating a data source
        tasks.add(new Task(R.drawable.hat , "Hat" , "I have to buy this before yesterday"));
        tasks.add(new Task(R.drawable.calculator , "Calculator" , "I have to return it to Ali"));



        TaskAdapter adapter = new TaskAdapter(this,R.layout.listrow,tasks);

        listView = (ListView) findViewById(R.id.tasks);

        listView.setAdapter(adapter);




    }


}