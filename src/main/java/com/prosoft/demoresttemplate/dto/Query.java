package com.prosoft.demoresttemplate.dto;

import java.util.HashMap;
import java.util.Map;

public class Query {

    private Integer amount;
    private String from;
    private String to;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "Query{" +
                "amount=" + amount +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
