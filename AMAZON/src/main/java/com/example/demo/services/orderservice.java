package com.example.demo.services;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.ordermodel;
import com.example.demo.repository.orderrepository;
@Service
public class orderservice {
@Autowired
orderrepository repo;
public ordermodel insert(ordermodel o) {
	return repo.save(o);
	}
    public Iterable<ordermodel> insertall(  List<ordermodel> or) {
		 return repo.saveAll(or);
	 }
	 public List<ordermodel> getall(){
		 return (List<ordermodel>)repo.findAll();
		 }
	 public Optional<ordermodel> getbyid(int id) {
		  return repo.findById(id);
	 }
	 public String deletebyid(int id) {
		  repo.deleteById(id);
		  return "succesfully deleted" + id;
	  }
	 public ordermodel updatebyid(ordermodel e) {
		 int id=e.getOrderid();
		ordermodel emp = repo.findById(id).get();
		 emp.setOrderid(e.getOrderid());
		 emp.setName(e.getName());
		 emp.setEmail(e.getEmail());
		 emp.setCost(e.getCost());
		 emp.setAddress(e.getAddress());
		 return repo.save(e);
	 }
	 
	  
	 
	 
	

}
