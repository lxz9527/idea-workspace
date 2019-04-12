/**
 * Copyright (C), 2019, 中央人民政府
 * FileName: PageController
 * Author:   lxz
 * Date:     2019/4/11 21:01
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author lenovo
 * @create 2019/4/11
 * @since 1.0.0
 */
@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("findTreeList")
    public String findTree(){
        return "main";
    }

    @RequestMapping("findUser")
    public String findUserList(){
        return "user";
    }
}