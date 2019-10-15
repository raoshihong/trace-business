package com.daoyuan.trace.business.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.daoyuan.trace.business.entity.User;
import com.daoyuan.trace.business.mapper.UserMapper;
import com.daoyuan.trace.business.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2019-09-11
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
