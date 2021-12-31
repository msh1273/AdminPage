package com.example.admin_study.controller;

import com.example.admin_study.model.SearchParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PostController {

    // HTML <Form>
    // ajax 검색
    // http post body -> data
    // json, xml, multipart-form / text-plain
    @PostMapping(value = "/postMethod")
    public SearchParam postMethod(@RequestBody SearchParam searchParam){
        System.out.println(searchParam.getAccount());
        return searchParam;
    }
}
