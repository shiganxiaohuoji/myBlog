package com.myblog.main.Service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.myblog.main.Entity.TagList;
import com.myblog.main.Mapper.TagListMapper;
import com.myblog.main.Service.TagListService;
import org.springframework.stereotype.Service;

@Service
public class TagListServicelmpl extends ServiceImpl<TagListMapper, TagList> implements TagListService {
}
