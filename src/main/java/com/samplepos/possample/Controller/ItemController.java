package com.samplepos.possample.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/customer")
public class ItemController {

    @GetMapping
    public String checkItem(){
        return "Items are checking....";
    }
}
