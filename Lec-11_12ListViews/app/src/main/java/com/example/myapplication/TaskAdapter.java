package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;


public class TaskAdapter extends ArrayAdapter<Task> {

    private Context context;
    private int mResource;

    public TaskAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Task> objects) {
        super(context, resource, objects);
        this.context = context;
        this.mResource = resource;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        convertView = layoutInflater.inflate(mResource,parent,false);

        ListView tasks;
        TextView taskName = convertView.findViewById(R.id.taskHeading);
        TextView taskDet = convertView.findViewById(R.id.taskDet);
        ImageButton delBtn = convertView.findViewById(R.id.delBtn);

        taskName.setText(getItem(position).getTaskHeading());
        taskDet.setText(getItem(position).getTaskDetail());




        return convertView;
    }
}
