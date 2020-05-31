package com.asiainfo.group.tmallcore.service.impl;

import com.asiainfo.group.tmallcore.mapper.UserMapper;
import com.asiainfo.group.tmallcore.model.User;
import com.asiainfo.group.tmallcore.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
@Service
@Transactional
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper userMapper;
 
}