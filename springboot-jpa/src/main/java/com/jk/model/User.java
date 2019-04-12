/**
 * Copyright (C), 2019, 中央人民政府
 * FileName: User
 * Author:   lxz
 * Date:     2019/4/11 16:55
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author lenovo
 * @create 2019/4/11
 * @since 1.0.0
 */
@Entity
@Table(name="t_user")
public class User implements Serializable {

    private static final long serialVersionUID = -6670640310551713010L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String loginnumber;
    private String password;
    @CreatedDate
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date userdate;

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

    public String getLoginnumber() {
        return loginnumber;
    }

    public void setLoginnumber(String loginnumber) {
        this.loginnumber = loginnumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getUserdate() {
        return userdate;
    }

    public void setUserdate(Date userdate) {
        this.userdate = userdate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", loginnumber='" + loginnumber + '\'' +
                ", password='" + password + '\'' +
                ", userdate=" + userdate +
                '}';
    }
}