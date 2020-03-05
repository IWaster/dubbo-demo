package io.ouka.dubbo.consumer.controller;

import io.ouka.dubbo.api.TestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Collections;

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


}
