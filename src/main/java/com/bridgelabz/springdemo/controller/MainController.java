package com.bridgelabz.springdemo.controller;


import com.bridgelabz.springdemo.model.User;
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
     //UC3
     @RequestMapping (value="/path/{name}",method = RequestMethod.GET)
     public String message2(@PathVariable String name)
    {
        return "Hello "+name;
    }
    //UC4
    @RequestMapping (value="/body",method = RequestMethod.POST)
    public String acceptData(@RequestBody User user)
    {
        //return "FirstName: "+user.getFirstName() + "LastName : "+user.getLastName();
        return user.toString();
    }
    //UC5
    //PUT request method is used,first name as path variable and last name as QueryParameter are implemented
    @PutMapping("/put/{firstName}")
    public String put(@PathVariable String firstName,
                      @RequestParam(value = "lastName") String lastName) {
        return "Hello " + firstName + " " + lastName;
    }
}
