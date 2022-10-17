package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WeatherDetails {
    @JsonProperty("base")
    public String base;
    @JsonProperty("visibility")
    public Integer visibility;
}
