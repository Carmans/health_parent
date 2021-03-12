package com.itheima.service;

import com.itheima.entity.PageResult;
import com.itheima.entity.QueryPageBean;
import com.itheima.pojo.TCheckitem;

/**
 * @author zhang_fei
 * @create 2021-03-10 17:48
 */
//服务接口
public interface CheckItemService {
    public void add(TCheckitem checkItem);

    public PageResult pageQuery(Integer currentPage, Integer pageSize, String pueryString);

}
