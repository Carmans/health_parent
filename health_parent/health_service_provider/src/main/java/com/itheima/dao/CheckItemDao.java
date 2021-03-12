package com.itheima.dao;

import com.github.pagehelper.Page;
import com.itheima.pojo.TCheckitem;

/**
 * @author zhang_fei
 * @create 2021-03-10 18:02
 */

/**
 * 持久层Dao接口
 */
public interface CheckItemDao {
    public void add(TCheckitem checkItem);

    public Page<TCheckitem> selectByCondition(String queryString);
}