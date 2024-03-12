package com.jparoshan.jpask.service;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jparoshan.jpask.model.Employee1;
import com.jparoshan.jpask.repository.Employee1Repository;

@Service
public class Employee1service 
{
   @Autowired
   private Employee1Repository employee1Repository;
   public List<Employee1> getAllUsers()
   {
	   List<Employee1> employee1Records = new ArrayList<>();
	   employee1Repository.findAll().forEach(employee1Records::add);
	   return employee1Records;
   }
}
