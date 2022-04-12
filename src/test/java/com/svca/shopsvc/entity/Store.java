package com.svca.shopsvc.entity;

import java.util.Date;

public class Store {
    private long storeId;
    private String storeName;
    private String storeDesc;
    private String storeAddr;
    private String phone;
    private String storeImg;
    private Integer priority;
    private Status status;
    private Area area;
    private User owner;
    private StoreCategory storeCategory;
    private Date createdDate;
    private Date latestUpdatedDate;

    enum Status {
        ACTIVE(0), BLOCKED(1);

        private final int value;

        Status(int val) {
            this.value = val;
        }

        public int getValue() {
            return value;
        }

    }

    public long getStoreId() {
        return storeId;
    }

    public void setStoreId(long storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreDesc() {
        return storeDesc;
    }

    public void setStoreDesc(String storeDesc) {
        this.storeDesc = storeDesc;
    }

    public String getStoreAddr() {
        return storeAddr;
    }

    public void setStoreAddr(String storeAddr) {
        this.storeAddr = storeAddr;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStoreImg() {
        return storeImg;
    }

    public void setStoreImg(String storeImg) {
        this.storeImg = storeImg;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public StoreCategory getStoreCategory() {
        return storeCategory;
    }

    public void setStoreCategory(StoreCategory storeCategory) {
        this.storeCategory = storeCategory;
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
}
