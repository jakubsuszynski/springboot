package com.jsuszynski;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {


    @Autowired
    private Service service;

    @RequestMapping("/all")
    public List<Person> returnAllPersons() {
        return service.returnAllPersons();
    }
}


