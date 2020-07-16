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
    @RequestMapping(value = "/userread", method = RequestMethod.GET )
    public List<User> showUser(){
        return UserServiceBaseimpl.showUser();
    }
    @RequestMapping(value = "/usercreate", method = RequestMethod.POST)
    public User create(@RequestBody User u){
        return UserServiceBaseimpl.create(u);
    }
    @RequestMapping(value = "/userupdate/{id}", method = RequestMethod.PUT)
    public User update(@PathVariable int id, @RequestBody User u){
        return UserServiceBaseimpl.update(id, u);
    }

    @RequestMapping(value="/userdelete/{id}",method=RequestMethod.DELETE)
    public User delete(@PathVariable int id){
        return UserServiceBaseimpl.delete(id);
    }

}
