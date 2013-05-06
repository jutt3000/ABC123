package me.jfa.model;


/**
 * Created with IntelliJ IDEA.
 * User: justinatkinson
 * Date: 5/6/13
 * Time: 1:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class Trainee {
    private String firstName;
    private String lastName;
    private Address address;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }
}
