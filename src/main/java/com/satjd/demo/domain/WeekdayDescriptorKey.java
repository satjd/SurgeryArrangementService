package com.satjd.demo.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class WeekdayDescriptorKey implements Serializable {
    private short weekday;

    private int weekArrangementId;

    public short getWeekDay() {
        return weekday;
    }

    public void setWeekDay(short weekDay) {
        this.weekday = weekDay;
    }

    public int getWeekArrangementId() {
        return weekArrangementId;
    }

    public void setWeekArrangementId(int weekArrangementId) {
        this.weekArrangementId = weekArrangementId;
    }
}
