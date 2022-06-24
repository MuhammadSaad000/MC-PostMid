package com.example.myapplication;

public class Task {

    String TaskHeading;
    String TaskDetail;

    public Task(String taskHeading, String taskDetail) {

        TaskHeading = taskHeading;
        TaskDetail = taskDetail;
    }

    public void setTaskHeading(String taskHeading) {
        TaskHeading = taskHeading;
    }

    public void setTaskDetail(String taskDetail) {
        TaskDetail = taskDetail;
    }

    public String getTaskHeading() {
        return TaskHeading;
    }

    public String getTaskDetail() {
        return TaskDetail;
    }

}
