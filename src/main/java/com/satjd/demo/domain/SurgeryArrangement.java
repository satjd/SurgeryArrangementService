package com.satjd.demo.domain;

import java.util.List;

public class SurgeryArrangement {

    private int surgeryId;
    private String surgeryName;
    private String surgeryDate;
    private String surgeryTime;
    private int surgeryRoom;
    private int surgeryOrder;
    private List<Staff> instNurse;
    private List<Staff> rovNurse;

    public int getSurgeryId() {
        return surgeryId;
    }

    public void setSurgeryId(int surgeryId) {
        this.surgeryId = surgeryId;
    }

    public String getSurgeryName() {
        return surgeryName;
    }

    public void setSurgeryName(String surgeryName) {
        this.surgeryName = surgeryName;
    }

    public String getSurgeryDate() {
        return surgeryDate;
    }

    public void setSurgeryDate(String surgeryDate) {
        this.surgeryDate = surgeryDate;
    }

    public String getSurgeryTime() {
        return surgeryTime;
    }

    public void setSurgeryTime(String surgeryTime) {
        this.surgeryTime = surgeryTime;
    }

    public int getSurgeryRoom() {
        return surgeryRoom;
    }

    public void setSurgeryRoom(int surgeryRoom) {
        this.surgeryRoom = surgeryRoom;
    }

    public int getSurgeryOrder() {
        return surgeryOrder;
    }

    public void setSurgeryOrder(int surgeryOrder) {
        this.surgeryOrder = surgeryOrder;
    }

    public List<Staff> getInstNurse() {
        return instNurse;
    }

    public void setInstNurse(List<Staff> instNurse) {
        this.instNurse = instNurse;
    }

    public List<Staff> getRovNurse() {
        return rovNurse;
    }

    public void setRovNurse(List<Staff> rovNurse) {
        this.rovNurse = rovNurse;
    }

    public static class Staff {
    }

}
