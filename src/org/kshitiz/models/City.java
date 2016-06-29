package org.kshitiz.models;

import javax.persistence.*;

/**
 * Created by kshitzgupta on 25/6/16.
 */
@Entity
@Table(name = "City")
public class City extends BaseObject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "state")
    private String state;

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;
        return (name == city.name ? true : false);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
