package com.myblog.main.Entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
@TableName(value = "taglist")
public class TagList implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
}
