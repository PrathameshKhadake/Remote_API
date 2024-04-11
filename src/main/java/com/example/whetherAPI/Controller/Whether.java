package com.example.whetherAPI.Controller;

import com.example.whetherAPI.Service.WhetherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/whether")
public class Whether {

    @Autowired
    WhetherService whetherService;

    @GetMapping
    public Object getWhether(@RequestParam("location") String location, @RequestParam("apikey") String apikey){
        return whetherService.getWhether(location, apikey);
    }


}
