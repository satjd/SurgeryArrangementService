package com.satjd.demo.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "staff")
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sid;

    @NotBlank
    private String name;

    @NotNull
    private int age;

    private boolean pregnant;

    private boolean vacation;

    @NotNull
    private int exp;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "night")
    private Set<MonthArrangement> monthNightStaffArrangement = new HashSet<>();

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "nightStandby")
    private Set<MonthArrangement> monthNightStandbyStaffArrangement = new HashSet<>();

    public Staff() {}

    public Staff(int sid) {
        this.sid = sid;
    }

    public Staff(@NotBlank String name, @NotBlank int age, boolean pregnant, boolean vacation, @NotBlank int exp) {
        this.name = name;
        this.age = age;
        this.pregnant = pregnant;
        this.vacation = vacation;
        this.exp = exp;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isPregnant() {
        return pregnant;
    }

    public void setPregnant(boolean pregnant) {
        this.pregnant = pregnant;
    }

    public boolean isVacation() {
        return vacation;
    }

    public void setVacation(boolean vacation) {
        this.vacation = vacation;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}
