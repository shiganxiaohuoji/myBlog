package com.myblog.main.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.myblog.main.Entity.BlogList;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogListMapper extends BaseMapper<BlogList> {
}
