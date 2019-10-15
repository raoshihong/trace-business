package com.daoyuan.trace.business.service.faced;

import com.daoyuan.trace.business.dto.UserDto;
import com.daoyuan.trace.business.entity.User;
import com.daoyuan.trace.business.service.IUserFaced;
import com.daoyuan.trace.business.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserFacedImpl implements IUserFaced {

    @Autowired
    private IUserService iUserService;

    @Override
    public void save(UserDto userDto) {
        User user = new User();
        BeanUtils.copyProperties(userDto,user);
        iUserService.save(user);
    }

    @Override
    public void update(UserDto userDto) {
        User user = new User();
        BeanUtils.copyProperties(userDto,user);
        iUserService.updateById(user);
    }

    @Override
    public void delete(Long id) {
        iUserService.removeById(id);
    }
}
