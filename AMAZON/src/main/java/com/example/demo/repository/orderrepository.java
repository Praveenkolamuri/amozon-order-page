package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.models.ordermodel;

public interface orderrepository extends CrudRepository<ordermodel, Integer> {
	ordermodel findByEmail(String email);

}
