package com.satjd.demo.domain;

import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "week_arrangement")
public class WeekArrangement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int weekArrangementId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "sid",nullable = false)
    @JsonView(Staff.Views.Public.class)
    private Staff staffThisWeekday;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            mappedBy = "arrangementOfDescriptor")
    private List<WeekdayDescriptor> todayDescriptors = new ArrayList<>();

    public List<WeekdayDescriptor> getTodayDescriptors() {
        return todayDescriptors;
    }

    public void setTodayDescriptors(List<WeekdayDescriptor> todayDescriptors) {
        this.todayDescriptors = todayDescriptors;
    }

    public int getWeekArrangementId() {
        return weekArrangementId;
    }

    public void setWeekArrangementId(int weekArrangementId) {
        this.weekArrangementId = weekArrangementId;
    }


    public Staff getStaffThisWeekday() {
        return staffThisWeekday;
    }

    public void setStaffThisWeekday(Staff staffThisWeekday) {
        this.staffThisWeekday = staffThisWeekday;
    }

//    public List<WeekdayDescriptor> getArrangements() {
//        return todayDescriptors;
//    }
//
//    public void setArrangements(List<WeekdayDescriptor> todayDescriptors) {
//        this.todayDescriptors = todayDescriptors;
//    }

}
