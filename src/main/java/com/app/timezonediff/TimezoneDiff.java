package com.app.timezonediff;

import java.lang.Math;
import java.lang.StringBuilder;

public class TimezoneDiff {

    private final Timezone refTimeZone;
    private final Timezone targetTimeZone;
    private final int refMod;
    private final int targetMod;
    private final int difference;
    private final String description;


    /**
     * @param refTimeZone
     * @param targetTimeZone
     */
    public TimezoneDiff(Timezone refTimeZone, Timezone targetTimeZone) {
        this(refTimeZone, targetTimeZone, 0, 0);
    }

    public TimezoneDiff(Timezone refTimeZone, Timezone targetTimeZone, int refMod, int targetMod) {
        this.refTimeZone = refTimeZone;
        this.targetTimeZone = targetTimeZone;
        this.refMod = refMod;
        this.targetMod = targetMod;
        this.difference = targetTimeZone.getUtcOffset() + this.targetMod - refTimeZone.getUtcOffset() -  this.refMod;
        this.description = new StringBuilder()
            .append(formatName(targetTimeZone.getName(), this.targetMod))
            .append(" is ")
            .append(Math.abs(difference))
            .append(" hours ")
            .append(difference > 0 ? "ahead of" : "behind")
            .append(formatName(refTimeZone.getName(), this.refMod))
            .toString();
    }

    /**
     * @return the refTimeZone
     */
    public Timezone getRefTimeZone() {
        return refTimeZone;
    }

    /**
     * @return the targetTimeZone
     */
    public Timezone getTargetTimeZone() {
        return targetTimeZone;
    }

    /**
     * @return the difference
     */
    public int getDifference() {
        return difference;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    private String formatName(String name, int mod){
        if (mod == 0) return name;
        if (mod < 0) return name + mod;
        return name + "+" + mod;
    }
}
