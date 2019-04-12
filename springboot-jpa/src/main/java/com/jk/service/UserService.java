/**
 * Copyright (C), 2019, 中国牛逼
 * FileName: UserService
 * Author:   lxz
 * Date:     2019/4/11 21:37
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.service;

import com.jk.model.User;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author lenovo
 * @create 2019/4/11
 * @since 1.0.0
 */
public interface UserService {

    List<User> findUserList();
}
