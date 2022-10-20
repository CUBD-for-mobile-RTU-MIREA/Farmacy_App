package com.example.farmacy.data.model;

import java.util.List;

public class Category {
    private int id;
    private String title;
    private Category parent;
    private List<Category> children;
    private List<Symptom> symptoms;

    public Category(int id, String title, Category parent, List<Category> children, List<Symptom> symptoms) {
        this.id = id;
        this.title = title;
        this.parent = parent;
        this.children = children;
        this.symptoms = symptoms;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getParent() {
        return parent;
    }

    public void setParent(Category parent) {
        this.parent = parent;
    }

    public List<Category> getChildren() {
        return children;
    }

    public void setChildren(List<Category> children) {
        this.children = children;
    }

    public List<Symptom> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(List<Symptom> symptoms) {
        this.symptoms = symptoms;
    }
}
