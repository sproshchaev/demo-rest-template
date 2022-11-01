package com.prosoft.demoresttemplate.dto;

import java.util.HashMap;
import java.util.Map;

public class Info {

    private Double rate;
    private Integer timestamp;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Info{" +
                "rate=" + rate +
                ", timestamp=" + timestamp +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
