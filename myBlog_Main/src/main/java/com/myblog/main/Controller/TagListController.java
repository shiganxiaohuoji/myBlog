package com.myblog.main.Controller;


import com.myblog.main.Entity.TagList;
import com.myblog.main.Mapper.TagListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Tag")
public class TagListController {

    @Autowired
    private TagListMapper tagListMapper;


    @GetMapping("/taglist")
    public List<TagList> getTagList(){
        return tagListMapper.selectList(null);
    }
}
