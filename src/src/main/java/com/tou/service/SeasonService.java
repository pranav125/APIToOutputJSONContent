package com.tou.service;

import com.tou.model.DayPeriod;
import com.tou.model.Seasons;
import com.tou.request.Season;
import com.tou.response.Period;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SeasonService {
    public List<Period> getTous(List<Season> seasons) {
        Seasons formattedSeasons = this.format(seasons);
        return null;
    }

    private Seasons format(List<Season> seasonList) {
        Seasons seasons = new Seasons();
        for (Season requestSeason : seasonList) {
            com.tou.model.Season season = new com.tou.model.Season(requestSeason.getSeasonName(),
                    requestSeason.getStartDay(),
                    requestSeason.getEndDay(),
                    requestSeason.getStartMonth(),
                    requestSeason.getEndMonth());
            for (com.tou.request.Period period: requestSeason.getPeriods()) {
                if(period.getFromDayOfWeek() > period.getToDayOfWeek()) {
                    for(int day = period.getFromDayOfWeek(); day < 7 ; day++) {
                        addDayPeriod(season, period, day);
                    }
                    for(int day = 0; day <= period.getToDayOfWeek() ; day++) {
                        addDayPeriod(season, period, day);
                    }
                } else {
                    for (int day = period.getFromDayOfWeek(); day <= period.getToDayOfWeek(); day++) {
                        addDayPeriod(season, period, day);
                    }
                }
            }
            seasons.addSeason(season);
        }
        return seasons;
    }

    private void addDayPeriod(com.tou.model.Season season, com.tou.request.Period period, int day) {
        if(period.getFromHour() > period.getToHour()){
            season.addDayPeriod(day, new DayPeriod(period.getPeriodName(),
                    period.getFromHour(),
                    0,
                    period.getFromMinute(),
                    period.getToMinute()));
            season.addDayPeriod(day, new DayPeriod(period.getPeriodName(),
                    0,
                    period.getToHour(),
                    period.getFromMinute(),
                    period.getToMinute()));
        } else {
            season.addDayPeriod(day, new DayPeriod(period.getPeriodName(),
                    period.getFromHour(),
                    period.getToHour(),
                    period.getFromMinute(),
                    period.getToMinute()));
        }
    }
}
