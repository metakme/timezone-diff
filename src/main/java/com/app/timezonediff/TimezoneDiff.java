package com.app.timezonediff;


public class TimezoneDiff {
    
    private final String refTimeZone;
    private final String targetTimeZone;
    private int difference;

    /**
     * @param refTimeZone
     * @param targetTimeZone
     */
    public TimezoneDiff(String refTimeZone, String targetTimeZone) {
        this.refTimeZone = refTimeZone;
        this.targetTimeZone = targetTimeZone;
    }

    /**
     * @return the refTimeZone
     */
    public String getRefTimeZone() {
        return refTimeZone;
    }

    /**
     * @return the targetTimeZone
     */
    public String getTargetTimeZone() {
        return targetTimeZone;
    }

    /**
     * @return the difference
     */
    public int getDifference() {
        return difference;
    }
}
