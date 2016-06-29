package org.kshitiz.models;

import javax.persistence.*;

/**
 * Created by kshitzgupta on 29/5/16.
 */
@Entity
@Table(name = "weather")
public class Weather {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    int id;

    @Column(name = "temp")
    float temp;

    @Column(name = "pressure")
    float pressure;

    @Column(name = "humidity")
    float humidity;

    @Column(name = "tempMax")
    float temp_max;

    @Column(name = "tempMin")
    float temp_min;

    @Column(name = "weatherInfo")
    String weatherInfo;

    @Column(name = "description")
    String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(float temp_max) {
        this.temp_max = temp_max;
    }

    public float getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(float temp_min) {
        this.temp_min = temp_min;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWeatherInfo() {
        return weatherInfo;
    }

    public void setWeatherInfo(String weatherInfo) {
        this.weatherInfo = weatherInfo;
    }
}
