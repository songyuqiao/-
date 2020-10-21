package com.mobiletrain.domain;

public class Address {
    private String id;
    private String detail;
    private String name;
    private String mobile;
    private String def;
    private String uid;

    @Override
    public String toString() {
        return "Address{" +
                "id='" + id + '\'' +
                ", detail='" + detail + '\'' +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", def='" + def + '\'' +
                ", uid='" + uid + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
