/**
 * Copyright (C), 2019, 中国牛逼
 * FileName: UserMapper
 * Author:   lxz
 * Date:     2019/4/11 21:42
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.mapper;

import com.jk.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author lenovo
 * @create 2019/4/11
 * @since 1.0.0
 */
@Repository
public interface UserMapper extends JpaRepository<User,Integer> {


}
