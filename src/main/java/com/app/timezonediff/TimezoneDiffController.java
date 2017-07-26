package com.app.timezonediff;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimezoneDiffController {
    @RequestMapping("/diff")
    public TimezoneDiff timezoneDiff() {
        return new TimezoneDiff("GMT","PST");
    }
}
