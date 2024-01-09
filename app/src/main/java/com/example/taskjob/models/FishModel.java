package com.example.taskjob.models;

public class FishModel {

    private int imageResource;
    private String title;
    private String description;
    private String date;

    public FishModel(int imageResource, String title, String description, String date) {
        this.imageResource = imageResource;
        this.title = title;
        this.description = description;
        this.date = date;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }
}
