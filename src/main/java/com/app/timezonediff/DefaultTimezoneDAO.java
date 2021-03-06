package com.app.timezonediff;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultTimezoneDAO extends TimezoneDAO {

    private final Map <String, Timezone> timezones;

    public DefaultTimezoneDAO() {
        this.timezones = new HashMap<String,Timezone>();
        timezones.put("UTC", new Timezone("UTC", 0));
        timezones.put("GMT", new Timezone("GMT", 0));
        timezones.put("EST", new Timezone("EST", -4));
        timezones.put("PST", new Timezone("PST", -7));
    }

    @Override
    public List<Timezone> findAll() {
        return (List<Timezone>) new ArrayList<Timezone>( this.timezones.values() ) ;
    }

    @Override
    public Timezone findByName(String name) {
        return this.timezones.get(name);
    }

    @Override
    public boolean insertTimezone(Timezone timezone) {
        if (!this.timezones.containsKey(timezone.getName())) {
            this.timezones.put(timezone.getName(), timezone);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateTimezone(Timezone timezone) {
        if (this.timezones.containsKey(timezone.getName())) {
            this.timezones.put(timezone.getName(), timezone);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteTimezone(Timezone timezone) {
        return this.timezones.remove(timezone.getName(), timezone);
    }
}
