package com.app.timezonediff;


public class TimezoneDiff {
    
    private final Timezone refTimeZone;
    private final Timezone targetTimeZone;
    private final int refMod;
    private final int targetMod;
    private int difference;
    private String description;


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
        this.description = targetTimeZone.getName() + " is " + difference + " hours compared to " + refTimeZone.getName();
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
}
