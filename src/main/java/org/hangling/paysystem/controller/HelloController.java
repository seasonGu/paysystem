package org.hangling.paysystem.controller;

import org.hangling.paysystem.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello(String nickName, String phone){
        System.out.println(phone);
        return "Hello World,sd23" + nickName;
    }
    @RequestMapping(value="/postTest1",method = RequestMethod.POST)
    public String postTest1() {
        return "postTest1";
    }
    @RequestMapping(value="/postTest2",method = RequestMethod.POST)
    public String postTest2(User user) {
        System.out.println(user);
        return "postTest2";
    }
    @RequestMapping(value="/postTest3",method = RequestMethod.POST)
    public String postTest3(@RequestBody  User user) {
        System.out.println(user);
        return "postTest3";
    }
}
