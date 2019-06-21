package com.tw.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User fetchUser(Integer id) {
        return userRepository.getOne(id);
    }

    public User save(User user) {
        return userRepository.saveAndFlush(user);
    }
}
