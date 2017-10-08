package cn.happy.entity;

/**
 * Created by annan on 2017/9/26.
 * news表
 */
public class News {
   private Integer newsid; //咨讯标识 自增
    private String newstitle;// 咨讯标题
    private String newsContent;// 咨讯内容
    private Integer clickCount;// 访问量

    public Integer getNewsid() {
        return newsid;
    }

    public void setNewsid(Integer newsid) {
        this.newsid = newsid;
    }

    public String getNewstitle() {
        return newstitle;
    }

    public void setNewstitle(String newstitle) {
        this.newstitle = newstitle;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContene(String newsContent) {
        this.newsContent = newsContent;
    }

    public Integer getClickCount() {
        return clickCount;
    }

    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }
}
