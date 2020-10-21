package com.mobiletrain.domain;

import java.util.List;

public class Order {
    private String id;
    private String totalAmount;
    private String state;
    private String creationTime;
    private String uid;
    private List<OrderDetail> details;

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", totalAmount='" + totalAmount + '\'' +
                ", state='" + state + '\'' +
                ", creationTime='" + creationTime + '\'' +
                ", uid='" + uid + '\'' +
                ", details=" + details +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public List<OrderDetail> getDetails() {
        return details;
    }

    public void setDetails(List<OrderDetail> details) {
        this.details = details;
    }
}
