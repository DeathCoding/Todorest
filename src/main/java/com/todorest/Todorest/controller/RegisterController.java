package com.todorest.Todorest.controller;

import com.todorest.Todorest.model.User;
import com.todorest.Todorest.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/register")
@RestController
public class RegisterController {

    private DataService dataService;

    @Autowired
    public RegisterController(DataService dataService) {
        this.dataService = dataService;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping
    public int register(@RequestBody User user) {
        return dataService.register(user);
    }

}
