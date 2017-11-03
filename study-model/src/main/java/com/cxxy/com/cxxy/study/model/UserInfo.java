package com.cxxy.com.cxxy.study.model;

import lombok.Data;
import java.io.Serializable;

@Data
public class UserInfo implements Serializable{

    private String userId;

    private String userName;

    private String password;
}
