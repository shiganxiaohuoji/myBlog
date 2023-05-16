package com.myblog.main.Service.impl;


import com.alibaba.fastjson.JSONObject;
import com.myblog.main.Mapper.UserMapper;
import com.myblog.main.Entity.User;
import com.myblog.main.Service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.myblog.main.Util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public PageBean<User> pageUser(JSONObject jsonObject){
        List<User> urf = userMapper.selectList(null);

        int totalRecord = 0;
        if(!CollectionUtils.isEmpty(urf)){
            totalRecord = urf.size();
        }

        PageBean<User> pageBean = new PageBean<>(Integer.valueOf(String.valueOf(jsonObject.get("CurrentPage"))), Integer.valueOf(String.valueOf(jsonObject.get("PageSize"))), totalRecord);
        List<User> data = new ArrayList<>();
        for(int i = pageBean.getStart(); i<pageBean.getEnd(); ++i){
            data.add(urf.get(i));
        }
        pageBean.setData(data);
        pageBean.setTotalRecord(totalRecord);
        return pageBean;
    }
}
