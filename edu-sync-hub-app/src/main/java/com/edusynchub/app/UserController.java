package com.edusynchub.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    UserRepository userRepository;

    @GetMapping("/user")
    public String save(){
        User user = new User("Harshal");
        userRepository.save(user);
        return "done";
    }

}
