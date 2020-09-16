package com.example.meal_plan;

public class ListItem {

    private String title;
    private String desc;

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public ListItem(String title, String desc) {
        this.title = title;
        this.desc = desc;
    }
}
