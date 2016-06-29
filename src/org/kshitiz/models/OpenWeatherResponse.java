package org.kshitiz.models;

/**
 * Created by kshitzgupta on 5/6/16.
 */
public class OpenWeatherResponse {
    Coord coord;
    Weather weather;
    WeatherInfoNumbers main;

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public WeatherInfoNumbers getMain() {
        return main;
    }

    public void setMain(WeatherInfoNumbers main) {
        this.main = main;
    }
}
