package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ListView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ImageButton addTaskBtn;

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
        addTaskBtn = (ImageButton) findViewById(R.id.addTask);

        addTaskBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.customtoast,(ViewGroup)findViewById(R.id.customtoast));

                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                toast.setView(layout);
                toast.show();

            }
        });

        listView.setAdapter(adapter);

    }


}