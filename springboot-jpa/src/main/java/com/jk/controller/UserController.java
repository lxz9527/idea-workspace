/**
 * Copyright (C), 2019, 中央人民政府
 * FileName: UserController
 * Author:   lxz
 * Date:     2019/4/11 16:46
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.controller;

import com.jk.model.User;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author lenovo
 * @create 2019/4/11
 * @since 1.0.0
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("findUserList")
    @ResponseBody
    public List<User> findUserList(){
        List<User> list = userService.findUserList();
        return list;
    }
}