package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;


import java.util.ArrayList;
import java.util.List;

public class addTask extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        EditText taskHeading = (EditText) findViewById(R.id.AddTaskHeading);
        EditText taskDetail = (EditText) findViewById(R.id.AddTaskDetail);

        Button addBtn = (Button) findViewById(R.id.addTaskBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(addTask.this,MainActivity.class);
                intent.putExtra(Intent.EXTRA_TEXT , taskHeading.toString());
                intent.putExtra(Intent.EXTRA_TEXT, taskDetail.toString());
                startActivity(intent);

            }
        });



    }
}