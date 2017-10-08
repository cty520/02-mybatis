package cn.happy.dao.impl;

import cn.happy.Util.MybatisUtil;
import cn.happy.dao.News_Dao;
import cn.happy.entity.News;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by adminastrator on 2017/9/26.
 */
public class News_impl implements News_Dao {

    News_Dao sm=null;
    SqlSession session=null;
    public News_impl(){
        session= MybatisUtil.getSession();
        sm=session.getMapper(News_Dao.class);
    }
    public List<News> findAll(int pageIndex,int pageSize) {

        List<News>  list=sm.findAll(pageIndex,pageSize);
            return list;

    }

    public int  News_count (){

        int count = sm.News_count();

        return count;
    }
}
