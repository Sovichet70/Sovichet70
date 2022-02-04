package com.example.springbootdatabase.controller;

import com.example.springbootdatabase.model.User;
import com.example.springbootdatabase.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path="/user") // This means URL started with /user (after Application path)
public class MainController {
    @Autowired

    private UserRepository userRepository;

    @PostMapping(path = "/add") // Map ONLY POST Requests
    public @ResponseBody String addUser (@RequestParam String name, @RequestParam String email){
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        userRepository.save(user);
        return "User has been saved.";
    }

    @GetMapping(path = "/find")
    public @ResponseBody Optional<User> findById(@RequestParam Integer id) {
        return userRepository.findById(id);
    }

    @GetMapping(path = "/list")
    public @ResponseBody Iterable<User> getList() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }

}
