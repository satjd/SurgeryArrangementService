package com.satjd.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "weekday_descriptor")
public class WeekdayDescriptor {

    @EmbeddedId
    private WeekdayDescriptorKey key;

    @ManyToOne
    @MapsId("weekArrangementId")
    @JoinColumn(name = "week_arrangement_id")
    @JsonIgnore
    private WeekArrangement arrangementOfDescriptor;

    @NotNull
    private boolean idle;

    private short start;

    private short end;

    public WeekdayDescriptorKey getKey() {
        return key;
    }

    public void setKey(WeekdayDescriptorKey key) {
        this.key = key;
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

    public WeekArrangement getArrangementOfDescriptor() {
        return arrangementOfDescriptor;
    }

    public void setArrangementOfDescriptor(WeekArrangement arrangementOfDescriptor) {
        this.arrangementOfDescriptor = arrangementOfDescriptor;
    }
}
