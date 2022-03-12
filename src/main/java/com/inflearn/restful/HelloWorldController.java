package com.inflearn.restful;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    // GET
    // end-point = /hello-world
    // 구 버전 --> @RequestMapping(method=RequestMethod.GET, path="/hello-world")
    @GetMapping("/hello-world")
    public String helloworld(){
        return "hello-world";
    }

}
