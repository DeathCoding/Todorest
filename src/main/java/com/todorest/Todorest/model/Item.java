package com.todorest.Todorest.model;

public class Item {

    private final String name;
    private final String item;

    public Item(String name, String item) {
        this.name = name;
        this.item = item;
    }

    public String getName() {
        return name;
    }

    public String getItem() {
        return item;
    }
}
