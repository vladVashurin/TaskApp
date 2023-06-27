package org.example;

import org.springframework.web.bind.annotation.GetMapping;

public class MsgController {
    @GetMapping("/msg")
   public String getMsg(){
        return "Hello";
    }
}
