package com.app.timezonediff;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

//TODO: Change to use logic from this example http://websystique.com/spring-boot/spring-boot-rest-api-example/
//https://www.leveluplunch.com/java/tutorials/014-post-json-to-spring-rest-webservice/
@RestController
@RequestMapping("/timezones")
public class TimezoneController {
    @RequestMapping("/", method = RequestMethod.GET)
    public List<Timezone> getAllTimezones() {
        return DAOController.getTimeZoneDAO().findAll();
    }

    @RequestMapping("/{name}", method = RequestMethod.GET)
    public Timezone getTimezone(@PathVariable String name) {
        return DAOController.getTimeZoneDAO().findByName(name);
    }

    @RequestMapping("/{name}", method = RequestMethod.POST)
    public Timezone addTimezone(@PathVariable String name, @RequestBody Timezone timezone) {
        if(timezone != null)
            DAOController.getTimeZoneDAO().insertTimezone(timezone);
        return new ResponseEntity<Timezone>(timezone, HttpStatus.OK);
    }
}
