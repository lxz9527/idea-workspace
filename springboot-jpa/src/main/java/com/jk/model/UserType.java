/**
 * Copyright (C), 2019, 中央人民政府
 * FileName: UserType
 * Author:   lxz
 * Date:     2019/4/11 18:36
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.model;

import javax.persistence.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author lenovo
 * @create 2019/4/11
 * @since 1.0.0
 */
@Entity
@Table(name = "t_user_type")
public class UserType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}