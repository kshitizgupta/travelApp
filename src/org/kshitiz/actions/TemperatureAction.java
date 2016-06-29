/**
 * Created by kshitzgupta on 5/5/16.
 */
package org.kshitiz.actions;


import org.kshitiz.dao.WeatherDao;
import org.kshitiz.jsonParser.WeatherJsonParser;
import org.kshitiz.services.WeatherService;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Logger;

public class TemperatureAction {
    String name;
    String title;
    String city;
    String country;
    String weatherApiResStr;
    String debugName = TemperatureAction.class.getName();
    static Logger log = Logger.getLogger(TemperatureAction.class.getName());
    WeatherService weatherService;

    public String getWeatherApiResStr() {
        return weatherApiResStr;
    }

    public void setWeatherApiResStr(String weatherApiResStr) {
        this.weatherApiResStr = weatherApiResStr;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String execute() throws IOException, URISyntaxException {
        System.out.println(debugName + ": CALLED");
        weatherService = WeatherService.getInstance();
        weatherApiResStr = weatherService.getWeatherData();
        WeatherDao weatherDao = new WeatherDao();
        weatherDao.addWeatherDetails(WeatherJsonParser.parseWeahterjson(weatherApiResStr));
        return "success";
    }

}
