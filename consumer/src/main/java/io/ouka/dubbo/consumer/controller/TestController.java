package io.ouka.dubbo.consumer.controller;

import io.ouka.dubbo.api.TestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * User: Ouka
 * Date: 2020-02-15
 * Time: 22:36
 */
@RestController
public class TestController {
    @Reference(version = "0.0.1")
    TestService testService;



    @GetMapping("/test/{str}")
    public String test(@PathVariable("str") String str){
        return testService.test(str);
    }


    @GetMapping("/test")
    public String test1(){
        return "1";
    }


}
