package org.kshitiz.utils;

/**
 * Created by kshitzgupta on 6/6/16.
 */
public class WeatherUtil {
    public static final String KELVIN = "KELVIN";
    public static final String CELSIUS = "CELSIUS";
    public static final String FAHRENHEIT = "FAHRENHEIT";

    public static float convertDegree(float number, String source, String target) {
        float result = 0;
        switch (source) {
            case KELVIN:
                    result = (float) (number - 273.15);
                break;
            case CELSIUS:
                break;

            case FAHRENHEIT:
                break;

        }
        return result;
    }
}
