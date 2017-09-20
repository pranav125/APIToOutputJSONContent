package com.tou.response;

public class Period {
    private String startTime;
    private String endTime;
    private String season;
    private String period;

    public Period(String startTime, String endTime, String season, String period) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.season = season;
        this.period = period;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getSeason() {
        return season;
    }

    public String getPeriod() {
        return period;
    }
}
