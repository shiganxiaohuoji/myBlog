package com.myblog.main.Service;

import com.alibaba.fastjson.JSONObject;
import com.myblog.main.Entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.myblog.main.Util.PageBean;
import org.springframework.stereotype.Repository;


@Repository
public interface UserService extends IService<User> {


    PageBean<User> pageUser(JSONObject jsonObject);
}
