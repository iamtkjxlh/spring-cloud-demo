package pers.bruce.springdemo.sbdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author Bruce.Tong
 * @description
 * @date 2019/7/6
 */
@Controller
public class DemoController {
    @RequestMapping("/demo")
    @ResponseBody
    public Map<String,String> getDemoMap(){
        return Map.of("a","1","b","2");
    }
}
