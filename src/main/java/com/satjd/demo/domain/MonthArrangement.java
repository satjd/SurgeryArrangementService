package com.satjd.demo.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "month_arrangement")
public class MonthArrangement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String date;

    public String getDate() {
        return date;
    }

    public Set<Staff> getNightStandby() {
        return nightStandby;
    }

    public void setDate(String date) {

        this.date = date;
    }

    public void setNightStandby(Set<Staff> nightStandby) {
        this.nightStandby = nightStandby;
    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "month_night_staffs",
            joinColumns = {@JoinColumn(name = "month_id")},
            inverseJoinColumns = {@JoinColumn(name = "staff_id")})
    private Set<Staff> night = new HashSet<>();

    @ElementCollection
    @JoinTable(name = "month_night_standby_staffs",
            joinColumns = {@JoinColumn(name = "month_id")},
            inverseJoinColumns = {@JoinColumn(name = "staff_id")})
    private Set<Staff> nightStandby;

    public int getId() {
        return id;
    }

    public Set<Staff> getNight() {
        return night;
    }

    public void setNight(Set<Staff> night) {
        this.night = night;
    }
}
