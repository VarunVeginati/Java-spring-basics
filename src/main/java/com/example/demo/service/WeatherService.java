package com.example.demo.service;

import com.example.demo.model.WeatherDetails;
import com.example.demo.repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {
    @Autowired
    WeatherRepository repository;

    public WeatherDetails getWeatherDetails() {
        return repository.getWeatherDetails();
    }
}
