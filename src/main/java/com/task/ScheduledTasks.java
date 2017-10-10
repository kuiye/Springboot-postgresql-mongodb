package com.task;


import com.JSonE.Ntest;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.entity.Montest2;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javaplugs.mybatis.JsonNodeValue;
import com.mapper.MontestMapper;
import com.entity.Montest;
import com.fasterxml.jackson.databind.JsonNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;;
import java.io.DataInput;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 * Created by KuiYe on 2017/4/25.
 *
 * @version 1.0
 */

@Component
public class ScheduledTasks {

    public static String token;

    private int count = 1;

    @Autowired
    MongoTemplate mongoTemplate;


    @Autowired
    private MontestMapper montestMapper;



    protected static Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);

    //@Scheduled(fixedRate = 1000*60*300)
    //@Scheduled(fixedDelay = 5000)        //fixedDelay = 5000表示当方法执行完毕5000ms后，Spring scheduling会再次调用该方法
    // @Scheduled(cron = "0/5 * * * * ? ") // 每5秒执行一次



    @Scheduled(cron = "0/5 * * * * ? ") // 每天16:26:00执行一次
    public void pjob1() throws SQLException {
        logger.info("======牛逼的后台=====");
        Montest montest=montestMapper.findById(1);
        //JsonNodeValue jsonNodeValue=montest.getDetail();
        Montest2 montest2=montestMapper.findById2(1);
        JsonNodeValue jsonNode=montest2.getDetail();
        JsonNode jsonvale=jsonNode.getValue();
        ObjectMapper mapper = new ObjectMapper();
        Ntest user = null;
        try {
            System.out.println(mapper.writeValueAsString(jsonvale));
            user = mapper.readValue(mapper.writeValueAsString(jsonvale), Ntest.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(user);
        logger.info("======牛逼的后台=====");
    }
   /* @Scheduled(cron = "0/5 * * * * ? ")
    public void job2() {
        System.out.println("JOB2。。。");
    }*/

}
