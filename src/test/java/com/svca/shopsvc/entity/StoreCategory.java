package com.svca.shopsvc.entity;

import java.util.Date;

public class StoreCategory {

    private Long storeCategoryId;
    private String storeCategoryName;
    private String storeCategoryDesc;
    private String storeCategoryImg;
    private Integer priority;
    private Date createdDate;
    private Date latestUpdatedDate;
    private StoreCategory parent;

    public Long getStoreCategoryId() {
        return storeCategoryId;
    }

    public void setStoreCategoryId(Long storeCategoryId) {
        this.storeCategoryId = storeCategoryId;
    }

    public String getStoreCategoryName() {
        return storeCategoryName;
    }

    public void setStoreCategoryName(String storeCategoryName) {
        this.storeCategoryName = storeCategoryName;
    }

    public String getStoreCategoryDesc() {
        return storeCategoryDesc;
    }

    public void setStoreCategoryDesc(String storeCategoryDesc) {
        this.storeCategoryDesc = storeCategoryDesc;
    }

    public String getStoreCategoryImg() {
        return storeCategoryImg;
    }

    public void setStoreCategoryImg(String storeCategoryImg) {
        this.storeCategoryImg = storeCategoryImg;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLatestUpdatedDate() {
        return latestUpdatedDate;
    }

    public void setLatestUpdatedDate(Date latestUpdatedDate) {
        this.latestUpdatedDate = latestUpdatedDate;
    }

    public StoreCategory getParent() {
        return parent;
    }

    public void setParent(StoreCategory parent) {
        this.parent = parent;
    }
}
