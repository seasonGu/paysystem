package org.hangling.paysystem.controller;

import org.hangling.paysystem.entity.User;
import org.hangling.paysystem.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper  userMapper;

    @GetMapping("/user")
    public List getUser(){
        return userMapper.getUserList();
    }

    @PostMapping("/user/insert")
    public String insetUser(User user){
        int i = userMapper.insertUser(user);
        if(i>0){
            return "success";
        } else {
            return "failed";
        }
    }
}
