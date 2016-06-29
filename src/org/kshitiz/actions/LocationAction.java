package org.kshitiz.actions;

import org.kshitiz.dao.CityDao;
import org.kshitiz.models.City;

/**
 * Created by kshitzgupta on 25/6/16.
 */
public class LocationAction {
    City city;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String execute() {
        return "success";
    }

    public String save() {
        if(city != null) {
            CityDao cityDao = new CityDao();
            cityDao.addCity(city);
        }
//        city = new City();
//        city.setName("Kanpur");
//        city.setState("Uttar Pradesh");

//        System.out.println(city.toString());
        return "success";
    }
}
