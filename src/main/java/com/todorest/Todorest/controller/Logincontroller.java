package com.todorest.Todorest.controller;

import com.todorest.Todorest.model.User;
import com.todorest.Todorest.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/login")
@RestController
public class Logincontroller {

    private final DataService dataService;

    @Autowired
    public Logincontroller(DataService dataService) {
        this.dataService = dataService;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(path = "{name}")
    public User getUserByName(@PathVariable("name") String name) {
        return dataService.getUserByName(name);
    }

}
