package com.ihewro.focus.bean;

import org.litepal.annotation.Column;
import org.litepal.crud.LitePalSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *     author : hewro
 *     e-mail : ihewro@163.com
 *     time   : 2019/03/09
 *     desc   : 某个订阅，比如微博的用户动态订阅
 *     version: 1.0
 * </pre>
 */
public class Feed extends LitePalSupport {

    @Column(unique = true)
    private String iid;
    private String name;
    private String desc;
    private String url;//不包括参数
    private String websiteName;
    private String websiteCategoryName;
    private Long time;
    private int totalNum;//总文章数
    private int unreadNum;//未读文章数

    @Column(ignore = true)
    private List<FeedItem> feedItemList = new ArrayList<>();
    @Column(ignore = true)
    private List<FeedRequire> feedRequireList = new ArrayList<>();//当前feed所需要的参数

    @Override
    public String toString() {
        return "feedId" + iid + "\n"
                + "name" + name + '\n'
                + "url" + url +"\n"
                + "文章数目" + feedItemList.size()+"\n"
                + feedItemList.toString();

    }

    public String getIid() {
        return iid;
    }

    public void setIid(String iid) {
        this.iid = iid;
    }

    public void setIid() {
        this.iid = name.hashCode() + url.hashCode() + "";//如果没有id，就生成一个唯一标识符
    }

    public int getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
    }

    public int getUnreadNum() {
        return unreadNum;
    }

    public void setUnreadNum(int unreadNum) {
        this.unreadNum = unreadNum;
    }

    public List<FeedRequire> getFeedRequireList() {
        return feedRequireList;
    }

    public void setFeedRequireList(List<FeedRequire> feedRequireList) {
        this.feedRequireList = feedRequireList;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FeedItem> getFeedItemList() {
        return feedItemList;
    }

    public void setFeedItemList(List<FeedItem> feedItemList) {
        this.feedItemList = feedItemList;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getWebsiteName() {
        return websiteName;
    }

    public void setWebsiteName(String websiteName) {
        this.websiteName = websiteName;
    }

    public String getWebsiteCategoryName() {
        return websiteCategoryName;
    }

    public void setWebsiteCategoryName(String websiteCategoryName) {
        this.websiteCategoryName = websiteCategoryName;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Long getTime() {
        return time;
    }
}