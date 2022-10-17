package com.example.demo.controller;

import com.example.demo.model.WeatherDetails;
import com.example.demo.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
    @Autowired
    WeatherService service;

    @GetMapping("/get_weather_details")
        public WeatherDetails getWeatherDetails() {
        return service.getWeatherDetails();
    }
}
