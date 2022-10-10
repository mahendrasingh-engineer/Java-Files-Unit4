package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cassandra.CassandraProperties.Request;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GlobControll {
	@Autowired
	Employeedao empdt;
	
	@Autowired
	Addressdao adt;
	
	@GetMapping(path="/api/employees/all")
	public List<Employee> fun1(){
		return empdt.findAll();
	}
	@GetMapping(path="/api/employee")
	public Employee fun2(@PathParam("id") int id){
		return empdt.findById(id).get();
	} 
	@GetMapping(path="/api/employees/create")
	public String fun3(@PathParam("first name")  String firstName,@PathParam("last-name")  String lastName,@PathParam("phone")  String phone,@PathParam("country")  String country,@PathParam("state")   String state,@PathParam("city")   String city,@PathParam("street")   String street){
		Address ad=new Address(0,country,state,city,street);
		Employee em=new Employee(0, firstName, lastName, phone,new ArrayList<Address>());
		em.getAddressId().add(ad);
		
		empdt.save(em);
		return "Successfully added";
	}
	@GetMapping(path="/api/employees/update")
	public String fun4(@PathParam("id") int id,@PathParam("first name")  String firstName,@PathParam("last-name")  String lastName,@PathParam("phone")  String phone,@PathParam("country")  String country,@PathParam("state")   String state,@PathParam("city")   String city,@PathParam("street")   String street){
		Address ad=new Address(0,country,state,city,street);
		Employee em=empdt.getById(id);
		em.setFirstName(firstName);em.setLastName(lastName);em.setPhone(phone);
		em.getAddressId().add(ad);
		empdt.save(em);
		return "Successfully added";
	}
	@DeleteMapping(path="/api/employee/delete")
	public String fun5(@PathParam("id")int id){
		empdt.deleteById(id);
		return "deleted";
	}
	
}
