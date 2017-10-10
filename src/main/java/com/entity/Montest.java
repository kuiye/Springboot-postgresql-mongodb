package com.entity;

import com.JSonE.Ntest;
import com.github.javaplugs.mybatis.JsonNodeValue;
import com.types.JSONBUserType;
import com.alibaba.fastjson.JSONObject;
import com.mongodb.util.JSON;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import com.JSonE.Ntest;
import java.util.Date;

/**
 * Created by KuiYe on 2017/4/26.
 */
public class Montest {
    private int id;
    private String name;
    private Date datetimne;
    private Ntest detail;

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

    public Ntest getDetail() {
        return detail;
    }

    public void setDetail(Ntest detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Montest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", datetimne=" + datetimne +
                ", detail='" + detail + '\'' +
                '}';
    }
}
