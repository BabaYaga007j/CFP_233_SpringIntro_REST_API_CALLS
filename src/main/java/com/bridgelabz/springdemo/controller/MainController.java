package com.bridgelabz.springdemo.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {
    //UC1
    @RequestMapping (value="/message",method = RequestMethod.GET)
     public String message()
     {
         return "hello From BridgeLabz";
     }
     //UC2
     @RequestMapping (value="/queryparam",method = RequestMethod.GET)
     public String message1(@RequestParam(value = "name", defaultValue = "BridgeLabz") String name)
     {

         return "Hello "+name;
     }
}
