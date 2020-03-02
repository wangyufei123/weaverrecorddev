package com.weavernorth.controller;

import com.weavernorth.domain.UserInfo;
import com.weavernorth.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: java类作用描述
 * @Author: 王玉飞
 * @CreateDate: 2020-03-01 13:43
 * @UpdateUser: 王玉飞
 * @UpdateDate: 2020-03-01 13:43
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@RestController
public class UserLoginController {
    @Autowired
    UserMapper userMapper;
    @PostMapping("/login")
    public Map<String,Object> getDepartment(@RequestBody UserInfo userInfo){
        UserInfo loginUser = userMapper.getLoginUser(userInfo);
        Map<String,Object> map = new HashMap<>();
        map.put("code","0");
        map.put("msg","登陆成功");
        map.put("data",loginUser);
        return map;
    }
}
