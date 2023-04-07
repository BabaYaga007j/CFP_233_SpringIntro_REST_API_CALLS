package com.bridgelabz.springdemo.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {
    @RequestMapping (value="/message",method = RequestMethod.GET)
     public String message()
     {
         return "hello From BridgeLabz";
     }
}
