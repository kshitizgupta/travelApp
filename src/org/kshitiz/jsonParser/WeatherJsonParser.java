package org.kshitiz.jsonParser;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.kshitiz.models.Weather;
import org.kshitiz.utils.WeatherUtil;

import java.util.Map;

/**
 * Created by kshitzgupta on 6/6/16.
 */
public class WeatherJsonParser {
    public static Weather parseWeahterjson(String weatherJson) {
        Gson gson = new Gson();
        Map<String, Object> map = gson.fromJson(weatherJson, new TypeToken<Map<String, Object>>(){}.getType());
        String weatherMain = map.get("main").toString();
        Weather weatherMap = gson.fromJson(weatherMain, Weather.class);
        weatherMap.setTemp(WeatherUtil.convertDegree(weatherMap.getTemp(), WeatherUtil.KELVIN, WeatherUtil.CELSIUS));
        weatherMap.setTemp_max(WeatherUtil.convertDegree(weatherMap.getTemp_max(), WeatherUtil.KELVIN, WeatherUtil.CELSIUS));
        weatherMap.setTemp_min(WeatherUtil.convertDegree(weatherMap.getTemp_min(), WeatherUtil.KELVIN, WeatherUtil.CELSIUS));

        return weatherMap;
    }
}
