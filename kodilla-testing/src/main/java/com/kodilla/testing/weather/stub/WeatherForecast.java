package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public Double calculateAverageTemperature() {

        double result = 0;
        if (temperatures.getTemperatures().size() == 0) {
            return Double.NaN;
        } else {
            for (Map.Entry<String, Double> temperature: temperatures.getTemperatures().entrySet()) {
                result = result + temperature.getValue();
            }
            return result / temperatures.getTemperatures().size();
        }
    }

    public Double calculateMedianTemperatures() {

        double median = 0;
        List<Double> temperaturesList = new ArrayList<>(temperatures.getTemperatures().values());
        if (temperaturesList.size() == 0) {
            return Double.NaN;
        } else {
            Collections.sort(temperaturesList);

            int halfSize = temperaturesList.size() / 2;
            if (temperaturesList.size() % 2 == 0) {
                median = (temperaturesList.get(halfSize) + temperaturesList.get(halfSize - 1)) / 2;
            } else {
                median = temperaturesList.get(halfSize);
            }
            return median;
        }
    }
}


