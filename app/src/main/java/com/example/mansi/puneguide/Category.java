package com.example.mansi.puneguide;

public class Category {
    private String name = null;
    private String location = null;
    private String description = null;
    private int imageResId = -1;

    public Category(String name, String location, String description, int imageResId) {
        this.name = name;
        this.location = location;
        this.description = description;
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }
}
