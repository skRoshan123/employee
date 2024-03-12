package com.jparoshan.jpask.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee1 
{   
	public Employee1()
	{		
	}
	public Employee1(int id, String name, String pass, String email, String mob) {
		super();
		this.id = id;
		this.name = name;
		this.pass = pass;
		this.email = email;
		this.mob = mob;
	}
	@Id
		int id;
        String name;
        String pass;
        String email;
        String mob;
        
      public int getId() {
    	  return id;
      }
      public void setId(int id) {
    	  this.id = id;
      }
      public String getName() {
    	  return name;
      }
      public void setName(String name) {
    	  this.name=name;
      }
      public String getPass() {
    	  return pass;
      }
      public void setPass(String pass) {
    	  this.pass=pass;
      }
      public String getEmail() {
    	  return email;
      }
      public void setEmail(String email) {
    	  this.email=email;
      }
      public String getmob() {
    	  return mob;
      }
      public void setmob(String mob) {
    	  this.mob=mob;
      }
      public void show()
      {
    	  System.out.println("ID : " + id);
    	  System.out.println("Name : " + name);
    	  System.out.println("Password : " + pass);
    	  System.out.println("Email : " + email);
    	  System.out.println("mob : " +mob);
      }
      @Override
      public String toString() {
    	  return "employee [ID = " + id + ", Name = " + name + ", Password = " + pass + ", Email = " + email + ", mob = " + mob + "]";
      }
}
