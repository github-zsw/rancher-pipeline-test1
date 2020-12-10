package cn.com.zsw.rancherpipelinetest1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：shiwangzhou
 * @date ：Created in 2020-12-10 10:40
 * @description ：
 */
@RestController("test")
public class TestController {
    @RequestMapping("hello")
    public String hello() {
        return "hello World";
    }
}
