package cn.happy.entity;

import java.util.Date;

/**
 * Created by annan on 2017/9/26.
 * Talk表
 */
public class Talk {
    private Integer tid; //评论编号 自增
    private String content;// 评论内容
    private Date talktime;// 评论时间
    private  Integer nid;// 咨讯id 外键

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTalktime() {
        return talktime;
    }

    public void setTalktime(Date talktime) {
        this.talktime = talktime;
    }

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }
}
