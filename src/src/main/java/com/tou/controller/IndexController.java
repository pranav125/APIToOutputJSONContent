package com.tou.controller;

import com.tou.request.Season;
import com.tou.service.SeasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class IndexController {

    @Autowired
    private SeasonService seasonService;


    @RequestMapping(value = "api/tou/changes", method = POST)
    public Map<String, Date> getTous(@RequestParam String startTime, @RequestParam String endTime, @RequestBody List<Season> seasons) throws IOException {
        seasonService.getTous(seasons);

        return new HashMap<>();
    }

}