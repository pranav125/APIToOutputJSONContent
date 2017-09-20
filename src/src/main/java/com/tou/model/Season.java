package com.tou.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Season {
    private String name;
    private int startDay;
    private int endDay;
    private int startMonth;
    private int endMonth;

    private Map<Integer, List<DayPeriod>> dayPeriods = new HashMap();

    public Season(String name, int startDay, int endDay, int startMonth, int endMonth) {
        this.name = name;
        this.startDay = startDay;
        this.endDay = endDay;
        this.startMonth = startMonth;
        this.endMonth = endMonth;
    }

    public void addDayPeriod(int day, DayPeriod dayPeriod) {
        if(!dayPeriods.containsKey(day)) {
            dayPeriods.put(day, new ArrayList());
        }
        dayPeriods.get(day).add(dayPeriod);
    }
}
