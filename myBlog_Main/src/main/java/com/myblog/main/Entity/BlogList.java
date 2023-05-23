package com.myblog.main.Entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
@TableName(value = "bloglist")
public class BlogList implements Serializable {

    @TableId(value ="id" , type=IdType.AUTO)
    private Integer id;
    private String name;

}
