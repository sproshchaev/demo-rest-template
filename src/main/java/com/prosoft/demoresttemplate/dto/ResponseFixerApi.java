package com.prosoft.demoresttemplate.dto;

import java.util.HashMap;
import java.util.Map;

public class ResponseFixerApi {

    private String date;
    private Info info;
    private Query query;
    private Double result;
    private Boolean success;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "ResponseFixerApi{" +
                "date='" + date + '\'' +
                ", info=" + info +
                ", query=" + query +
                ", result=" + result +
                ", success=" + success +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
