package com.zjx.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {

    @ResponseBody
    @RequestMapping("/test")
    public String test(){
        JSONObject json = new JSONObject();
        json.put("test","test success");
        return JSON.toJSONString(json);
    }

}
