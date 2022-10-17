package com.example.demo.repository;

import com.example.demo.model.WeatherDetails;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;

@Repository
@Configuration
public class WeatherRepository {
    private final WebClient webClient;

    @Value("${weatherapi.token}")
    private String weatherApiToken;

    public WeatherRepository(WebClient.Builder builder) {
        webClient = builder.baseUrl("https://api.openweathermap.org/data/2.5").build();
    }

    public WeatherDetails getWeatherDetails() {
        return webClient
                .get()
                .uri(uriBuilder -> uriBuilder
                        .path("/weather")
                        .queryParam("lat", "35.794238297241435")
                        .queryParam("lon", "-78.69940445049596")
                        .queryParam("units", "metric")
                        .queryParam("appid", weatherApiToken)
                        .build())
                .retrieve()
                .bodyToMono(WeatherDetails.class).block();
    }
}
