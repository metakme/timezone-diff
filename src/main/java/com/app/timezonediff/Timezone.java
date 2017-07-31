package com.app.timezonediff;

public class Timezone {

    private String name;
    private int utcOffset;

    /**
     * Empty Constructor initializes to UTC 0
     */
    public Timezone() {
        this("UTC", 0);
    }


    /**
     * Offset is set to 0 if not provided
     * @param name
     */
    public Timezone(String name) {
        this(name, 0);
    }

    /**
     * @param name
     * @param utcOffset
     */
    public Timezone(String name, int utcOffset) {
        this.name = name;
        this.utcOffset = utcOffset;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the utcOffset
     */
    public int getUtcOffset() {
        return utcOffset;
    }

    /**
     * @param utcOffset the utcOffset to set
     */
    public void setUtcOffset(int utcOffset) {
        this.utcOffset = utcOffset;
    }

}
