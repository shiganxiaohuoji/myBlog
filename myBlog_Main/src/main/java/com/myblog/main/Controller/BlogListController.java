package com.myblog.main.Controller;

import com.myblog.main.Entity.BlogList;
import com.myblog.main.Entity.User;
import com.myblog.main.Mapper.BlogListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bloglist")
public class BlogListController {

    @Autowired
    private BlogListMapper blogListMapper;

    @GetMapping("/getList")
    public List<BlogList> getList (){
        List<BlogList> bloglist = blogListMapper.selectList(null);
        return bloglist;
    }

}
