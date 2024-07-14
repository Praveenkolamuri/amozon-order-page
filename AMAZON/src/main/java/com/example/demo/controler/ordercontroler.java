package com.example.demo.controler;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.ordermodel;
import com.example.demo.services.orderservice;
@RestController
@RequestMapping("/api/v1")
public class ordercontroler {
	@Autowired
	orderservice service;
	@PostMapping("/insertion")
	public ordermodel insert( @RequestBody ordermodel l) {
		return service.insert(l);
	}
	@PostMapping("/insertall")
	public Iterable<ordermodel> insertall(@RequestBody List<ordermodel> or) {
		return service.insertall(or);
	}
	@GetMapping("/getall")
	public List<ordermodel>getall(){
		return service.getall();
	}
	@GetMapping("/getbyid/{id}")
	public Optional<ordermodel> getbyid( @PathVariable  int id) {
		return service.getbyid(id);
	}
	@DeleteMapping("/deletebyid/{id}")
	public String deletebyid(@PathVariable int id) {
		return service.deletebyid(id);
	}
	@PutMapping("/update")
	public ordermodel updatebyid( @RequestBody ordermodel e) {
		 return service.updatebyid(e);
	 }

}
