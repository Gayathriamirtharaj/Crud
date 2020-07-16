package com.example.demoapp;
import Service.UserServiceBaseimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vo.User;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class UserController {
    @Autowired
    @RequestMapping(value = "/user read", method = RequestMethod.GET )
    public List<User> showUser(){
        return UserServiceBaseimpl.showUser();
    }
    @RequestMapping(value = "/user create", method = RequestMethod.POST)
    public User create(@RequestBody User u){
        return UserServiceBaseimpl.create(u);
    }
    @RequestMapping(value = "/user update/{id}", method = RequestMethod.PUT)
    public User update(@PathVariable int id, @RequestBody User u){
        return UserServiceBaseimpl.update(id, u);
    }

    @RequestMapping(value="/user delete/{id}",method=RequestMethod.DELETE)
    public User delete(@PathVariable int id){
        return UserServiceBaseimpl.delete(id);
    }

}
