package com.cxxy.study.dal.dao;

import com.cxxy.com.cxxy.study.model.UserInfo;
import org.apache.ibatis.annotations.Param;

public interface IUserDao {
    int addUser(UserInfo userInfo);
}
