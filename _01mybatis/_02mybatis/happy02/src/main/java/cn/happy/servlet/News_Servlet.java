package cn.happy.servlet;


import cn.happy.dao.News_Dao;
import cn.happy.dao.impl.News_impl;
import cn.happy.entity.News;
import cn.happy.entity.pages;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by 16125 on 2017/9/19.
 */


public class News_Servlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action=request.getParameter("action");

        request.setCharacterEncoding("utf-8");

        News_Dao news_dao = new News_impl();
        //smbms_user user = new smbms_user();

        if(action==null || action.equals("list")){
            System.out.println("qusiba ");


            pages pa=new pages();

            //当前页码
            int pageIndex=1;
            //每页显示数
            int pageSize=3;

            //总记录数
            int totalRecords=news_dao.News_count();
            //总页数
            int totalPages=totalRecords%pageSize==0?totalRecords/pageSize:totalRecords/pageSize+1;

            if(request.getParameter("pageIndex")!=null&&request.getParameter("pageIndex")!=""){
                pageIndex=Integer.parseInt(request.getParameter("pageIndex"));
            }




            if(pageIndex>=totalPages){
                //最后一页停止
                pageIndex=totalPages;
            }
            if(pageIndex<=0){
                //等于第一页
                pageIndex=1;
            }



            //每页记录数
            pa.setPageSize(pageSize);
            //总页数
            pa.setTotalPages(totalPages);
            //总记录数
            pa.setTotalRecords(totalRecords);
            //当前页码



            List<News>list=news_dao.findAll((pageIndex-1)*pageSize,pageSize);


            for (News li:list){
                System.out.println(li.getClickCount()+li.getNewsid()+li.getNewsContent()+li.getNewstitle());
            }
            pa.setPageIndex(pageIndex);


            pa.setPag_user(list);
            request.setAttribute("pa",pa);

            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);

    }
}
