package com.example.myapplication;

public class Task {
    int img;
    String TaskHeading;
    String TaskDetail;

    public Task(int img, String taskHeading, String taskDetail) {
        this.img = img;
        TaskHeading = taskHeading;
        TaskDetail = taskDetail;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public void setTaskHeading(String taskHeading) {
        TaskHeading = taskHeading;
    }

    public void setTaskDetail(String taskDetail) {
        TaskDetail = taskDetail;
    }

    public int getImg() {
        return img;
    }

    public String getTaskHeading() {
        return TaskHeading;
    }

    public String getTaskDetail() {
        return TaskDetail;
    }
}
