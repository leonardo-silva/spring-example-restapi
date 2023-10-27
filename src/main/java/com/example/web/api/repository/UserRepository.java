package com.example.web.api.repository;

import com.example.web.api.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(User user) {
        if (user.getId() == null)
            System.out.println("SAVE - Receiving user on repository layer");
        else
            System.out.println("UPDATE - Receiving user on repository layer");

        System.out.println(user);
    }

    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id - Receiving id: %d to delete", id));
        System.out.println(id);
    }

    public List<User> findAll() {
        System.out.println("LIST - Listing all users");
        List<User> users = new ArrayList<>();
        users.add(new User("pablo", "escobar"));
        users.add(new User("frank", "sinatra"));
        return users;
    }

    public User findById(Integer id) {
        System.out.println(String.format("FIND/id - Receiving id: %id to locate user", id));
        return new User("pablo", "escobar");
    }

    public User findByUsername(String username) {
        System.out.println(String.format("FIND/id - Receiving username: %s to locate user", username));
        return new User("pablo", "escobar");
    }

}
