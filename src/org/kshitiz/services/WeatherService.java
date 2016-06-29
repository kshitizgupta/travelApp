package org.kshitiz.services;

import org.apache.http.client.utils.URIBuilder;
import org.kshitiz.models.Weather;
import org.kshitiz.utils.HttpReqRes;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * Created by kshitzgupta on 29/5/16.
 */
public class WeatherService {
    private String url;
    private String city;
    private String country;
    private Weather weather;
    private final String weatherApi = "http://api.openweathermap.org/data/2.5/weather";
    private final String weatherApiKey = "70ea03e172ab4e6672cd6a8fcaa55cf2";
    private static WeatherService weatherServiceInstance;

    public WeatherService() {
        weather = new Weather();
    }

    public static WeatherService getInstance() {
        if(weatherServiceInstance == null) {
            weatherServiceInstance = new WeatherService();
        }
        return weatherServiceInstance;
    }
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getWeatherData() throws IOException, URISyntaxException {
        HttpReqRes httpReqRes = new HttpReqRes();
        if(city == null || city.equals("")) city = "New+Delhi";
        if(country == null || country.equals("")) country = "IN";
        URL url = new URL(weatherApi + "?q=" + country + "," + city + "&APPID=" + weatherApiKey);
        URIBuilder uriBuilder = new URIBuilder(weatherApi);
        uriBuilder.addParameter("q", country + "," + city);
//        url = new URL(uriBuilder.toString());
        String s = httpReqRes.get(url);
        weather.setWeatherInfo(s);
        return weather.getWeatherInfo();
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
}
