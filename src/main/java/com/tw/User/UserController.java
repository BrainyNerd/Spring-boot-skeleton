package com.tw.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/foo")
    public String foo() {
        return "foo";
    }


    @GetMapping(value = "/user/{id}")
    public User fetchUser(@PathVariable Integer id){
        return userService.fetchUser(id);
    }

    @PostMapping(value = "/user/add")
    public User addUser(@RequestBody User user){
        return userService.save(user);
    }

}
