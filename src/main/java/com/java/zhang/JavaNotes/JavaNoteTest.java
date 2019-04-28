package com.java.zhang.JavaNotes;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class JavaNoteTest {


    @RequestMapping("/build")
    public String build(){
        return  "构建成功!";

    }
}
