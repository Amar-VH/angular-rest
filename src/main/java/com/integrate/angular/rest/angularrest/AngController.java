package com.integrate.angular.rest.angularrest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AngController {
    @RequestMapping(value= "/sayhello", method = RequestMethod.GET)
    public String sayHello(){
        return "Hello the REST is integrated with angular";
    }
    @RequestMapping(value="/getBean", method = RequestMethod.GET)
    public MyTextBean getTextBean(){
        return new MyTextBean("John Smith, Dallas, TX, 12345, PHONE : 999-999-9999");
    }

}
