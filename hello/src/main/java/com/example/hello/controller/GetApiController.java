package com.example.hello.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello") //http://localhost:9090/api/get/hello
    public String hello(){
        return "get hello";
    }

    @RequestMapping(path = "/hi", method = RequestMethod.GET) //get http://localhost:9090\/api/get/hi
    public String hi(){
        return "hi";
    }

    // localhost:9090/api/get/path-variable/{name}
    @GetMapping("/path-variable")
    public String pathVariable(@PathVariable String name){
        System.out.println("PathVariable : " + name);
        return name;

    }
}
