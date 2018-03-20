package com.satjd.demo.domain;

import java.util.List;

public class MonthArrangement {

    private int id;
    private String date;
    private List<Staff> night;
    private List<Staff> nightStandby;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Staff> getNight() {
        return night;
    }

    public void setNight(List<Staff> night) {
        this.night = night;
    }

    public List<Staff> getNightStandby() {
        return nightStandby;
    }

    public void setNightStandby(List<Staff> nightStandby) {
        this.nightStandby = nightStandby;
    }
}
