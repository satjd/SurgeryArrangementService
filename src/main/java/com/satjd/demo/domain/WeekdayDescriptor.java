package com.satjd.demo.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "weekday_descriptor")
public class WeekdayDescriptor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int descriptorId;

    private short weekday;

    @NotNull
    private boolean idle;

    private short start;

    private short end;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "week_arrangement_id")
    private WeekArrangement arrangementOfDescriptor;

    public void setArrangementOfDescriptor(WeekArrangement arrangementOfDescriptor) {
        this.arrangementOfDescriptor = arrangementOfDescriptor;
    }

    public boolean isIdle() {
        return idle;
    }

    public void setIdle(boolean idle) {
        this.idle = idle;
    }

    public short getStart() {
        return start;
    }

    public void setStart(short start) {
        this.start = start;
    }

    public short getEnd() {
        return end;
    }

    public void setEnd(short end) {
        this.end = end;
    }

    public short getWeekDay() {
        return weekday;
    }

    public void setWeekDay(short weekDay) {
        this.weekday = weekDay;
    }
}
