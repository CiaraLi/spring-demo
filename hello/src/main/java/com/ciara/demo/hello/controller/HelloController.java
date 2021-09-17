package com.ciara.demo.hello.controller;

import com.ciara.demo.hello.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //直接注入环境变量
    @Autowired
    private Environment env;
    //读取配置
    @Value("${site.title}")
    private String title;
    //读物数组配置
    @Value("${allows[0]}")
    private String allows;
    // 注入配置对象
    @Autowired
    private Site site;

    @RequestMapping("/hello")
    public String hello() {
        //读取环境变量
        System.out.println(env.getProperty("env"));
        return "Hello Spring:" + title;
    }

    @RequestMapping("/site")
    public String site() {
        return "欢迎来到" + site.getAuthor() + "小站：" + site.getTitle();
    }
}
