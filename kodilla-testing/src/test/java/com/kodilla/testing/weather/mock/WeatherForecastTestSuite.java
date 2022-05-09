package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {

    public static int testCounter = 0;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test suite start");
    }

    @BeforeEach
    public void beforeEach() {
        testCounter++;
        System.out.println("Preparing to execute test # " + testCounter);
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("All tests finish");
    }

    @Mock
    private Temperatures temperaturesMock;

    @Nested
    class GroupTestsCalculateForecast {
        @Test
        void testCalculateForecastWithMock() {
            //Given
            Map<String, Double> temperaturesMap = new HashMap<>();
            temperaturesMap.put("Rzeszow", 25.5);
            temperaturesMap.put("Krakow", 26.2);
            temperaturesMap.put("Wroclaw", 24.8);
            temperaturesMap.put("Warszawa", 25.2);
            temperaturesMap.put("Gdansk", 26.1);
            when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
            WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

            //When
            int quantityOfSensors = weatherForecast.calculateForecast().size();

            //Then
            Assertions.assertEquals(5, quantityOfSensors);
        }
    }

    @Nested
    class  GroupTestsCalculateAverageTemperature {

        @Test
        void testCalculateAverageTemperature() {
            //Given
            Map<String, Double> temperaturesMap = new HashMap<>();
            temperaturesMap.put("Rzeszow", 25.5);
            temperaturesMap.put("Krakow", 26.2);
            temperaturesMap.put("Wroclaw", 24.8);
            temperaturesMap.put("Warszawa", 25.2);
            temperaturesMap.put("Gdansk", 26.1);
            when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
            WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

            //When
            double result = weatherForecast.calculateAverageTemperature();

            //Then
            assertEquals(25.56, result);
        }

        @Test
        void testCalculateAverageTemperatureForEmptyMap() {
            //Given
            Map<String, Double> temperaturesMap = new HashMap<>();
            when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
            WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

            //When
            Double result = weatherForecast.calculateAverageTemperature();

            //Then
            assertEquals(Double.NaN, result);
        }
    }

    @Nested
    class GroupTestsCalculateMedianTemperatures {
        @Test
        void testCalculateMedianTemperaturesForOddSizeMap() {
            //Given
            Map<String, Double> temperaturesMap = new HashMap<>();
            temperaturesMap.put("Rzeszow", 25.5);
            temperaturesMap.put("Krakow", 26.8);
            temperaturesMap.put("Wroclaw", 24.8);
            temperaturesMap.put("Warszawa", 25.2);
            temperaturesMap.put("Gdansk", 26.1);
            when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
            WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

            //When
            double result = weatherForecast.calculateMedianTemperatures();

            //Then
            assertEquals(25.5, result);
        }

        @Test
        void testCalculateMedianTemperaturesForEvenSizeMap() {
            //Given
            Map<String, Double> temperaturesMap = new HashMap<>();
            temperaturesMap.put("Rzeszow", 25.5);
            temperaturesMap.put("Krakow", 26.2);
            temperaturesMap.put("Wroclaw", 24.8);
            temperaturesMap.put("Warszawa", 25.2);
            when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
            WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

            //When
            double result = weatherForecast.calculateMedianTemperatures();

            //Then
            assertEquals(25.35, result);
        }

        @Test
        void testCalculateMedianTemperaturesForEmptyMap() {
            //Given
            Map<String, Double> temperaturesMap = new HashMap<>();
            when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
            WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

            //When
            Double result = weatherForecast.calculateMedianTemperatures();

            //Then
            assertEquals(Double.NaN, result);

        }
    }
}