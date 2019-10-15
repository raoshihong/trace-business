package com.daoyuan.trace.business.service;


import com.daoyuan.trace.business.dto.UserDto;

public interface IUserFaced {
    void save(UserDto userDto);
    void update(UserDto userDto);
    void delete(Long id);
}
