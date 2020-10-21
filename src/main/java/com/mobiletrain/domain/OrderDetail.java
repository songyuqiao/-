package com.mobiletrain.domain;

public class OrderDetail {
    private String id;
    private String amount;
    private String count;
    private String oid;
    private String pid;
    private Product product;

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id='" + id + '\'' +
                ", amount='" + amount + '\'' +
                ", count='" + count + '\'' +
                ", oid='" + oid + '\'' +
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

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
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
