package com.jparoshan.jpask.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jparoshan.jpask.model.Employee1;
import com.jparoshan.jpask.service.Employee1service;

@RestController
@CrossOrigin(origins="*")

public class Controller1 
{
      @Autowired
      private Employee1service employee1Service;
      @RequestMapping("/")
      public List<Employee1> getAllUsers()
      {
    	  return employee1Service.getAllUsers();
      }
}
