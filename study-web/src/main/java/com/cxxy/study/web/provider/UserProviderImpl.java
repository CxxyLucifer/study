package com.cxxy.study.web.provider;

import com.cxxy.com.cxxy.study.model.UserInfo;
import com.cxxy.study.api.model.UserRequest;
import com.cxxy.study.api.provider.UserProvider;
import com.cxxy.study.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userProvider")
public class UserProviderImpl implements UserProvider{

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserService userService;

    @Override
    public int addUser(UserRequest userRequest) throws Exception {

        UserInfo userInfo = new UserInfo();

        BeanUtils.copyProperties(userRequest,userInfo);

        return userService.addUser(userInfo);
    }
}
