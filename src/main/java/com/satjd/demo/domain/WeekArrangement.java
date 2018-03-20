package com.satjd.demo.domain;

import java.util.List;

public class WeekArrangement {

    private int id;
    private String name;
    private List<WeekdayDescriptor> arrangements;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<WeekdayDescriptor> getArrangements() {
        return arrangements;
    }

    public void setArrangements(List<WeekdayDescriptor> arrangements) {
        this.arrangements = arrangements;
    }

}
