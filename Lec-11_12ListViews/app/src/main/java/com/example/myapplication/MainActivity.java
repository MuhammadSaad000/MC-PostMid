package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ImageButton addTaskBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Task> tasks =  new ArrayList<Task>();

        // Creating a data source
        tasks.add(new Task("Hat" , "I have to buy this before yesterday"));
        tasks.add(new Task("Calculator" , "I have to return it to Ali"));


        TaskAdapter adapter = new TaskAdapter(this,R.layout.listrow,tasks);

        listView = (ListView) findViewById(R.id.tasks);
        addTaskBtn = (ImageButton) findViewById(R.id.addTask);

        addTaskBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,addTask.class);
                startActivity(intent);
            }
        });
        Intent intent = getIntent();
        String taskHeading = intent.getStringExtra(Intent.EXTRA_TEXT);
        String taskDetail = intent.getStringExtra(Intent.EXTRA_TEXT);
        tasks.add(new Task(taskHeading,taskDetail));

        adapter.notifyDataSetChanged();
        listView.setAdapter(adapter);

    }


}