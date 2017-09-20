package com.tou.request;


public class Period {

    private String periodName;
    private int fromDayOfWeek;
    private int toDayOfWeek;
    private int fromHour;
    private int toHour;
    private int fromMinute;
    private int toMinute;

    public String getPeriodName() {
        return periodName;
    }

    public void setPeriodName(String periodName) {
        this.periodName = periodName;
    }

    public int getFromDayOfWeek() {
        return fromDayOfWeek;
    }

    public void setFromDayOfWeek(int fromDayOfWeek) {
        this.fromDayOfWeek = fromDayOfWeek;
    }

    public int getToDayOfWeek() {
        return toDayOfWeek;
    }

    public void setToDayOfWeek(int toDayOfWeek) {
        this.toDayOfWeek = toDayOfWeek;
    }

    public int getFromHour() {
        return fromHour;
    }

    public void setFromHour(int fromHour) {
        this.fromHour = fromHour;
    }

    public int getToHour() {
        return toHour;
    }

    public void setToHour(int toHour) {
        this.toHour = toHour;
    }

    public int getFromMinute() {
        return fromMinute;
    }

    public void setFromMinute(int fromMinute) {
        this.fromMinute = fromMinute;
    }

    public int getToMinute() {
        return toMinute;
    }

    public void setToMinute(int toMinute) {
        this.toMinute = toMinute;
    }
}
