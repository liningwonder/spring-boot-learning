package com.unionpay.business.controller;

import com.unionpay.business.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value="queryNameByID", notes="get user name by id")
    @ApiImplicitParam(name = "id", value = "user ID", required = true, dataType = "String")
    @RequestMapping(value = "/queryNameByID/{id}", method = RequestMethod.GET)
    public String getUserName(@PathVariable String id) {
        return userService.getUserNameById(id);
    }
}
