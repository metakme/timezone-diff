package com.app.timezonediff;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/timezones")
public class TimezoneController {
    @RequestMapping("/")
    public List<Timezone> getAllTimezones() {
        return DefaultTimezoneDAO.getTimeZoneDAO().findAll();
    }
    @RequestMapping("/{name}")
    public Timezone getTimezone(@PathVariable String name) {
        return DefaultTimezoneDAO.getTimeZoneDAO().findByName(name);
    }
}
