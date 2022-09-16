package com.codingworld.service1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Service1Controller {

  @GetMapping(name = "/say",value = "/say")
  public String sayHello() {

    return "Hello From Service2";
  }


}
