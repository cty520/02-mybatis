package cn.happy.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by adminastrator on 2017/9/23.
 */
public class teacher {
    private int tid;
    private String tname;
    private List<student66> list = new ArrayList<student66>();

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public List<student66> getList() {
        return list;
    }

    public void setList(List<student66> list) {
        this.list = list;
    }
}
