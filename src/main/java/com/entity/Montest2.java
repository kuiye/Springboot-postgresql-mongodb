package com.entity;

import com.JSonE.Ntest;
import com.github.javaplugs.mybatis.JsonNodeValue;

import java.util.Date;

/**
 * Created by KuiYe on 2017/4/26.
 */
public class Montest2 {
    private int id;
    private String name;
    private Date datetimne;
    private JsonNodeValue detail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDatetimne() {
        return datetimne;
    }

    public void setDatetimne(Date datetimne) {
        this.datetimne = datetimne;
    }

    public JsonNodeValue getDetail() {
        return detail;
    }

    public void setDetail(JsonNodeValue detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Montest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", datetimne=" + datetimne +
                ", detail='" + detail.toString() + '\'' +
                '}';
    }
}
