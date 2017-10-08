package cn.happy.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by adminastrator on 2017/9/23.
 */
public class student66 {
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public List<teacher> getList() {
        return list;
    }

    public void setList(List<teacher> list) {
        this.list = list;
    }

    private int sid;
   private String sname;
    protected List<teacher> list= new ArrayList<teacher>();





}

