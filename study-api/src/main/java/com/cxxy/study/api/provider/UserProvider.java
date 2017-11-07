package com.cxxy.study.api.provider;

import com.cxxy.study.api.model.UserRequest;

public interface UserProvider {

    /**
     *
     * @param userRequest
     * @return
     * @throws Exception
     */
    int addUser(UserRequest userRequest) throws Exception;
}
