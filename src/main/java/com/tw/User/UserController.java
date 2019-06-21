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
        User user = userService.fetchUser(id);
        return user;
    }
    
}
