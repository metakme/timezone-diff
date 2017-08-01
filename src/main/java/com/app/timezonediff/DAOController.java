package com.app.timezonediff;

import java.lang.Class;

public class DAOController {
    private static DAOClassName = "com.app.timezonediff.DefaultTimezoneDAO";
    private static TimezoneDAO timezoneDAO = null;

    public static TimezoneDAO getTimeZoneDAO(){
        if(timezoneDAO == null) {
            try {
                Class c = Class.forName(DAOClassName);
                this.timezoneDAO = (TimezoneDAO) Class.forName(DAOClassName).newInstance();
            } catch (Exception e) {
                //some error handling needed, but this is more like a proof of concept
                this.timezoneDAO = new DefaultTimezoneDAO();
            }
        }

        return this.timezoneDAO;
    }
}
