package com.tou.model;

public class DayPeriod {

    private String periodName;
    private int startHours;
    private int endHours;
    private int startMinutes;
    private int endMinutes;

    public DayPeriod(String periodName, int startHours, int endHours, int startMinutes, int endMinutes) {
        this.periodName = periodName;
        this.startHours = startHours;
        this.endHours = endHours;
        this.startMinutes = startMinutes;
        this.endMinutes = endMinutes;
    }
}
