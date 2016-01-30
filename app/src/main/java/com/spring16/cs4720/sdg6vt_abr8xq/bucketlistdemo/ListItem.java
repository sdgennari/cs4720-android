package com.spring16.cs4720.sdg6vt_abr8xq.bucketlistdemo;

/**
 * Created by alexramey on 1/30/16.
 */
public class ListItem {
    public int id;
    public String name;
    public String shortDescription;
    public String longDescription;
    public boolean isComplete;

    // default constructor
    public ListItem() {
        this.id = 0;
        this.name = "Item";
        this.shortDescription = "short description";
        this.longDescription = "long description";
        this.isComplete = false;
    }

    // full constructor
    public ListItem(int id, String name, String shortDescription, String longDescription, boolean isComplete) {
        this.id = id;
        this.name = name;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.isComplete = isComplete;
    }


}
