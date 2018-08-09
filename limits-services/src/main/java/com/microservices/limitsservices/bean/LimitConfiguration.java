package com.microservices.limitsservices.bean;

public class LimitConfiguration {

    private int max;
    private int min;

    protected LimitConfiguration() {

    }

    public LimitConfiguration(int max, int min) {
        super();
        this.max = max;
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

}
