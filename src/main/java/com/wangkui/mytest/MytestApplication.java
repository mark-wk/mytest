package com.wangkui.mytest;

import com.wangkui.mytest.bean.ResultBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@SpringBootApplication
@RestController
public class MytestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MytestApplication.class, args);
    }

    @GetMapping("/hello")
    public ResultBean hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        ResultBean resultBean = new ResultBean();
        resultBean.setT(LocalDateTime.now());
        return resultBean;
    }
}
