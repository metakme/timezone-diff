package com.app.timezonediff;

import java.util.List;

interface TimezoneDAO {
    List<Timezone> findAll();
    public Timezone findByName(String name);
    public boolean insertTimezone(Timezone timezone);
    public boolean updateTimezone(Timezone timezone);
    public boolean deleteTimezone(Timezone timezone);
}
