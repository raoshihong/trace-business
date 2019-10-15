package com.daoyuan.trace.business.controller;

import com.daoyuan.trace.business.dto.UserDto;
import com.daoyuan.trace.business.entity.User;
import com.daoyuan.trace.business.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping(value = "/user/save")
    public void save(@RequestBody UserDto userDto){
        User user = new User();
        BeanUtils.copyProperties(userDto,user);
        userService.save(user);
    }

    @PostMapping(value = "/user/update")
    public void update(@RequestBody UserDto userDto){
        User user = new User();
        BeanUtils.copyProperties(userDto,user);
        userService.updateById(user);
    }

    @PostMapping(value = "/user/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        userService.removeById(id);
    }

}
