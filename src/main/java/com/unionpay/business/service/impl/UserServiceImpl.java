package com.unionpay.business.service.impl;

import com.unionpay.business.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final static Logger LOG = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public String getUserNameById(String id) {
        LOG.warn("query user name by id : {}", id);
        return "test";
    }
}
