package com.luozhanwei;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by luxiaolin on 17/7/8.
 */
@RestController
public class UserController {
    @Autowired
    private UserRepo userRepo;

    @GetMapping(value = "/users")
    public List<User> getUsers(){
        return userRepo.findAll();
    }

    @GetMapping(value = "/addusers")
    public User userAdd(@RequestParam("username") String username,
                          @RequestParam("telnum") String telNum){
        User user =new User();
        user.setUserName(username);
        user.setTelNum(telNum);
        return userRepo.save(user);

    }

}
