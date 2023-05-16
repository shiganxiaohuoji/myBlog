package com.myblog.main.Entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String name;
    private String price;
}
