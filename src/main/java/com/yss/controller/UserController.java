package com.yss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.yss.entity.User;
import com.yss.service.UserService;
import java.util.List;
@RestController
public class UserController
{
    @Autowired
    private UserService userService;
    @RequestMapping("/")
    public List<User> getAllUser()
    {
        return userService.getAllUsers();
    }
    @RequestMapping(value="/add-user", method=RequestMethod.POST)
    public void addUser(@RequestBody User User)
    {
        userService.addUser(User);
    }
}
