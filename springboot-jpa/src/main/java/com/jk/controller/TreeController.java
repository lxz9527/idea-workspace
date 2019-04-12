/**
 * Copyright (C), 2019, 中央人民政府
 * FileName: TreeController
 * Author:   lxz
 * Date:     2019/4/11 18:45
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.controller;

import com.jk.model.TreeBean;
import com.jk.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈b〉
 *
 * @author lenovo
 * @create 2019/4/11
 * @since 1.0.0
 */
@Controller
@RequestMapping("tree")
public class TreeController {

    @Autowired
    private TreeService treeService;

    @RequestMapping("findTree")
    @ResponseBody
    public List<TreeBean> findTree(){
        List<TreeBean> tree = treeService.findTree();
        return tree;
    }
}