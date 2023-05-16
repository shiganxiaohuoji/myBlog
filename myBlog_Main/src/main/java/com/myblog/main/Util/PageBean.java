package com.myblog.main.Util;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PageBean<T> implements Serializable {

    private int CurrentPage;//当前页数
    private int PageSize; //每页显示数
    private int totalPage; //总页数
    private int totalRecord; //总记录数
    private List<T> data;
    private int start;
    private int end;

    public PageBean(){

    }

    public PageBean(int CurrentPage, int PageSize, int totalRecord){
        this.CurrentPage = CurrentPage;
        this.PageSize   = PageSize;
        this.totalPage = totalRecord%PageSize == 0? (PageSize/totalRecord):(PageSize/totalRecord+1);

        this.start = (CurrentPage-1) * PageSize;
        this.end = start + PageSize;
    }
}
