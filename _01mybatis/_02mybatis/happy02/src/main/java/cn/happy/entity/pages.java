package cn.happy.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16125 on 2017/9/22.
 */
public class pages {
    //当前页码
    private Integer pageIndex;
    //每页记录数
    private Integer pageSize;
    //总页数
    private Integer totalPages;
    //总记录数
    private Integer totalRecords;

    private Integer fistIndex;

    public Integer getFistIndex() {
        return fistIndex;
    }

    public void setFistIndex(Integer fistIndex) {
        this.fistIndex = fistIndex;
    }

    private List<News> Pag_user=new ArrayList<News>();






    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
    }

    public List<News> getPag_user() {
        return Pag_user;
    }

    public void setPag_user(List<News> pag_user) {
        Pag_user = pag_user;
    }
}
