package com.leaderment.util.entity;

import java.util.List;

/**
  * @Author zhangshuai
  * @Date 19-3-19 下午12:07
  * @Description //页面结果类
  * @Param
  * @return
  * @version 1.0
        **/
public class PageResult<T> {

    private long total;
    private List<T> rows;

    public PageResult() {
    }

    public PageResult(long total) {
        this.total = total;
    }

    public PageResult(long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}