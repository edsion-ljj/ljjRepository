package com.mr.erp_utils.controller;

import com.mr.erp_utils.redis.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("RedisTestController")
public class RedisTestController {

    @Autowired
    private RedisUtils<Map<String,Object>> redisUtils;


    @GetMapping("testRedis")
    public Map<String,Object>  testRedis(){

        HashMap<String, Object> goods = new HashMap<>();

        goods.put("clothes","chanel");
        goods.put("lipstick","dior");
        goods.put("dog","zzx");
        redisUtils.setHash("shoppingcart","ljj",goods);//购物车  姓名 商品

        Map<String, Object> retParams = redisUtils.getHash("shoppingcart","quen");
        Map<String, Object> retParams1 = redisUtils.getHash("shoppingcart","ljj");

        HashMap<String, Object> retmap = new HashMap<>();
        retmap.put("ljj",retParams1);
        retmap.put("quen",retParams);

        return retmap;
    }
}
