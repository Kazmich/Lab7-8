package net.javabeat.hibernate;

import java.io.Serializable;

public class User implements Serializable {
    private Long personId;
    private String name;
    private Address address;
    public Person() {
    }
    public Long getPersonId() {
        return personId;
    }
    public void setPersonId(Long personId) {
        this.personId = personId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
}
