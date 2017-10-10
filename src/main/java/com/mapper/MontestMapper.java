package com.mapper;

import com.Handler.JsonTypeHandler;
import com.entity.Montest;
import com.entity.Montest2;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import com.JSonE.Ntest;
import java.sql.SQLException;


/**
 * Created by KuiYe on 2017/4/26.
 */
@Repository
@Mapper
public interface MontestMapper {

    @Select("select * from test where id = #{id}")
    @Results(value = {
            @Result(property="detail",column="detail",javaType = com.JSonE.Ntest.class,typeHandler = JsonTypeHandler.class)
    })
    Montest findById(Integer id)  throws SQLException;

    @Select("select * from test where id = #{id}")
    @Results(value = {
            @Result(property="detail",column="detail",javaType = com.fasterxml.jackson.databind.JsonNode.class,typeHandler = com.github.javaplugs.mybatis.JsonNodeValueTypeHandler.class)
    })
    Montest2 findById2(Integer id)  throws SQLException;

}

