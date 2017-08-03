package com.app.timezonediff;

import java.util.List;

abstract class TimezoneDAO {
    public abstract List<Timezone> findAll();
    public abstract Timezone findByName(String name);
    public abstract boolean insertTimezone(Timezone timezone);
    public abstract boolean updateTimezone(Timezone timezone);
    public abstract boolean deleteTimezone(Timezone timezone);
}
