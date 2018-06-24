package com.jsuszynski;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {

    private List<Person> database = new ArrayList<>();

    {
        database.add(new Person(1, 24, "Jan", "Kowalski", "Kanałowa 2"));
        database.add(new Person(2, 30, "Anna", "Kowalska", "Kanałowa 2"));
        database.add(new Person(3, 18, "Maciej", "Stachowski", "Twarda 12"));
        database.add(new Person(4, 22, "Artur", "Nowak", "Opacka 212"));
    }

    public List<Person> returnAllPersons() {
        return database;
    }
}
