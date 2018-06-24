package com.jsuszynski;

public class Person {

    private Integer id;

    public Person() {
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(Integer id, Integer age, String name, String surname, String address) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public String getSurname() {
        return surname;

    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private Integer age;
    private String name;
    private String surname;
    private String address;
}
