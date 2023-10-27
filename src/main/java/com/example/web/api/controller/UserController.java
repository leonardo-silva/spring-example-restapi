package com.example.web.api.controller;

import com.example.web.api.model.User;
import com.example.web.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users") // it means that all routes here will start with /users
public class UserController {
    @Autowired
    private UserRepository repository;
    //@GetMapping("/users")
    @GetMapping()
    public List<User> getUsers() {
        return repository.findAll();
    }
    //@GetMapping("/users/{username}")
    @GetMapping("/{username}")
    public User getOne(@PathVariable("username") String username) {
        return repository.findByUsername(username);
    }
    //@DeleteMapping("/users/{id}")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        repository.deleteById(id);
    }
    @PostMapping()
    public void postUser(@RequestBody User user) {
        repository.save(user);
    }
}
