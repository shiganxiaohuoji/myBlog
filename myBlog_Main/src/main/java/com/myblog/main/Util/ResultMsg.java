package com.myblog.main.Util;

import java.io.Serializable;
import java.util.List;

public class ResultMsg<T> implements Serializable {
    private int code;
    private String msg;
    private List<T> data;


    public ResultMsg(int code, List<T> data, String msg){
        this.code = code;
        this.data = data;
        this.msg = msg;
    }
}
