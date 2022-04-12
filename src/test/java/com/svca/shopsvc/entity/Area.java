package com.svca.shopsvc.entity;

import java.util.Date;

public class Area {

    private int areaId;

    private String areaName;

    private int priority;

    private Date createdDate;

    private Date latestUpdatedDate;

    public int getAreaId() {
        return areaId;
    }

    public void setAreaId(int areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public Date getLatestUpdatedDate() {
        return latestUpdatedDate;
    }
}
