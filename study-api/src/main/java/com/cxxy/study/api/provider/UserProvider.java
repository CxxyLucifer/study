package com.cxxy.study.api.provider;

import com.cxxy.study.api.model.UserRequest;

public interface UserProvider {

    /**
     *
     * @param userRequest
     * @return
     * @throws Exception
     */
    public int addUser(UserRequest userRequest) throws Exception;
}
