package com.jsuszynski;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private Repository repository;


    public List<Person> returnAllPersons() {
        return repository.returnAllPersons();
    }
}
