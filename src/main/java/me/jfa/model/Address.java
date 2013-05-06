package me.jfa.model;


/**
 * Created with IntelliJ IDEA.
 * User: justinatkinson
 * Date: 5/6/13
 * Time: 1:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class Address {
    private String street;
    private String city;
    private String State;
    private String zipCode;
    private String country;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
