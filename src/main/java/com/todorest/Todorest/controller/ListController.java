package com.todorest.Todorest.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.todorest.Todorest.model.Item;
import com.todorest.Todorest.model.User;
import com.todorest.Todorest.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/")
@RestController
public class ListController {

    private final DataService dataService;

    @Autowired
    public ListController(DataService dataService) {
        this.dataService = dataService;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping
    public int addItem(@RequestBody Item item) {
        return dataService.addItem(item);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping
    public int removeItem(@RequestBody Item item) {
        return dataService.removeItem(item);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(path = "{name}")
    public List<String> getItems(@PathVariable("name") String name) {
        return dataService.getTodoList(name);
    }
}
