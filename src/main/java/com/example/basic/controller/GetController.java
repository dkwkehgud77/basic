package com.example.basic.controller;

import ch.qos.logback.core.CoreConstants;
import com.example.basic.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GetController {

    @RequestMapping(method = RequestMethod.GET, path="/getMethod")
    public String getRequest(){

        return "Hi getMethod";
    }

    @GetMapping("getParameter")
    public String getParameter(@RequestParam String id, @RequestParam String password){
        System.out.println("id :: "+id);
        System.out.println("password :: "+password);

        return id + password;
    }

    @GetMapping("/getMultiParameter")
    public SearchParam getMultiParameter(SearchParam searchParam){
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());

        return searchParam;
    }
}
