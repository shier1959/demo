package com.example.demo.entity;

import java.util.Date;

public class usersd {

    private  Integer  uid;
    private String uname;
    private String photo;
    private Date operationTime;

    public usersd() {
        super();
    }

    public usersd(Integer uid, String uname, String photo, Date operationTime) {
        this.uid = uid;
        this.uname = uname;
        this.photo = photo;
        this.operationTime = operationTime;
    }

    public Integer getUid() {
        return uid;
    }
    public String getUname() {
        return uname;
    }

    public String getPhoto() {
        return photo;
    }

    public Date getOperationTime() {
        return operationTime;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }

    @Override
    public String toString() {
        return "usersd{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", photo='" + photo + '\'' +
                ", operationTime=" + operationTime +
                '}';
    }
}
