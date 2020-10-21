package com.mobiletrain.domain;

public class Cart {
    private String id;
    private String amount;
    private String count;
    private String uid;
    private String pid;
    private Product product;

    @Override
    public String toString() {
        return "Cart{" +
                "id='" + id + '\'' +
                ", amount='" + amount + '\'' +
                ", count='" + count + '\'' +
                ", uid='" + uid + '\'' +
                ", pid='" + pid + '\'' +
                ", product=" + product +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
