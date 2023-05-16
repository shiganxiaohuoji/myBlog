package com.myblog.main.Controller;


import com.alibaba.fastjson.JSONObject;
import com.myblog.main.Entity.User;
import com.myblog.main.Mapper.UserMapper;
import com.myblog.main.Service.UserService;
import com.myblog.main.Service.impl.UserServiceImpl;
import com.myblog.main.Util.PageBean;
import com.myblog.main.Util.ResultMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserServiceImpl userServiceimpl;


    @GetMapping("/getUserById/{id}")
    public User getUserById(@PathVariable("id") Integer id){
        return this.userService.getById(id);
    }

    @GetMapping("/getUserAll")
    public List<User> getUserAll (){
        List<User> users = userMapper.selectList(null);
        return users;
    }

    @PostMapping("/pageUser")
    public ResultMsg pageUser(@RequestBody JSONObject jsonObject){
        PageBean<User> page = userServiceimpl.pageUser(jsonObject);

        return new ResultMsg(200, (List) page,"成功查询");
    }

}
