package com.myblog.main.Service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.myblog.main.Entity.BlogList;
import com.myblog.main.Mapper.BlogListMapper;
import com.myblog.main.Service.BlogListService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogListServicelmpl extends ServiceImpl<BlogListMapper, BlogList> implements BlogListService {

//    public List<BlogList> getList(){
//        QueryWrapper<BlogList> queryWrapper = new QueryWrapper<>();
//        queryWrapper("id", );
//
//    }
}
