package com.cxxy.study.service;

import com.cxxy.com.cxxy.study.model.UserInfo;
import com.cxxy.study.dal.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {

    @Autowired
    private IUserDao userDao;

    public int addUser(UserInfo user) throws Exception{

        return userDao.addUser(user);

    }
}
