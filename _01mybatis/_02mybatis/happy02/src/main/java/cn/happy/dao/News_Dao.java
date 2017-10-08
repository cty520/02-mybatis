package cn.happy.dao;

import cn.happy.entity.News;

import java.util.List;

/**
 * Created by adminastrator on 2017/9/21.
 */
public interface News_Dao {


    public List<News> findAll(int pageIndex,int pageSize);
    //总页数
    public int News_count ();
}
