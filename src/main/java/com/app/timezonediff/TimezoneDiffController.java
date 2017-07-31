package com.app.timezonediff;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/timezonediff/{ref}/{target}")
public class TimezoneDiffController {
    @RequestMapping("/")
    public TimezoneDiff getTimezoneDiff(
            @PathVariable("ref") final String ref,
            @PathVariable("target") final String target,
            @RequestParam(value = "ref-mod", required = false, defaultValue = 0) final int refModifier,
            @RequestParam(value = "target-mod", required = false, defaultValue = 0) final int targetModifier
            ) throws BadParameterException {
        Timezone refTimezone = DefaultTimezoneDAO.getTimeZoneDAO().findByName(ref);
        if (refTimezone == null) 
            throw new TimezoneNotFoundException(ref);
        
        Timezone targetTimezone = DefaultTimezoneDAO.getTimeZoneDAO().findByName(target),
        if (targetTimezone == null) 
            throw new TimezoneNotFoundException(target);

        return new TimeZoneDiff ( refTimezone, targetTimezone, refModifier, targetModifier );
    }
}
