package com.example.demo.controller;

import com.example.demo.service.BloomFilterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    private BloomFilterService bloomFilterService;

    @RequestMapping("/add")
    public String add(){
        for (int i=0;i<100;i++){
            bloomFilterService.add("瓜田李下"+i);
        }

        return "success";
    }

    @RequestMapping("/get")
    public String contain(@RequestParam("value") String value){
        if (bloomFilterService.contain(value)){
            System.out.println("查找的值："+value+" 存在");
            return value+" 存在";
        }else{
            System.out.println("查找的值："+value+" 不存在");
            return value+" 不存在";
        }
    }
}
