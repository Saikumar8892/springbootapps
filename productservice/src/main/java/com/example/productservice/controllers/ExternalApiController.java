package com.example.productservice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ExternalApiController {

	@RequestMapping("/weather")
	public String getWeather(@RequestParam("city") String city) {
		String url = "http://api.weatherstack.com/current?access_key=983b81658e82999c139c3b0263ccd384&query="+city;
		RestTemplate restTemplate = new RestTemplate();
		String weatherData = restTemplate.getForObject(url, String.class);
		return weatherData;
	}
	
}