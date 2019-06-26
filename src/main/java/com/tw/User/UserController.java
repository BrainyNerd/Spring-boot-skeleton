package com.tw.User;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/foo")
    public String foo() {
        return "foo";
    }


    @GetMapping(value = "/user/{id}")
    public User fetchUser(@PathVariable Integer id){
        System.out.println("Printing inside provider " + id);
        return userService.fetchUser(id);
    }

    @RequestMapping(value = "/user/add", consumes = "application/json")
    public User addUser(@RequestBody User user){
        return userService.save(user);
    }

    @GetMapping(value = "/user/all")
    public List<User> getUsers(){
        return userService.getUsers() ;
    }
}
