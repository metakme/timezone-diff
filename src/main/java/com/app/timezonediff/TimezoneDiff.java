package com.app.timezonediff;


public class TimezoneDiff {
    
    private final Timezone refTimeZone;
    private final Timezone targetTimeZone;
    private final int difference;
    private final String description;


    /**
     * @param refTimeZone
     * @param targetTimeZone
     */
    public TimezoneDiff(Timezone refTimeZone, Timezone targetTimeZone) {
        TimezoneDiff(refTimeZone,
                     targetTimeZone,
                     difference,
                     description);
    }

    private TimezoneDiff(Timezone refTimeZone, Timezone targetTimeZone, int difference, String description) {
        this.refTimeZone = refTimeZone;
        this.targetTimeZone = targetTimeZone;
        this.difference = difference;
        this.description = description;
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
