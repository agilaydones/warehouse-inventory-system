package com.revature.spark.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.spark.beans.Product;

@RestController("/product")
public class ProductController {

	@GetMapping("/all")
	public ResponseEntity<List<Product>> findAll(){
		throw new UnsupportedOperationException();
	}

	@PostMapping
	public ResponseEntity<Product> create(Product product){
		throw new UnsupportedOperationException();
	}

	@PutMapping
	public ResponseEntity<Product> update(Product product){
		throw new UnsupportedOperationException();
	}
	
	@DeleteMapping
	public ResponseEntity<Void> delete(Product product){
		throw new UnsupportedOperationException();
	}
	
	@GetMapping("/sum")
	public ResponseEntity<Double> sum(){
		throw new UnsupportedOperationException();
	}
	
	@GetMapping("/min")
	public ResponseEntity<Double> min(){
		throw new UnsupportedOperationException();
	}
	
	@GetMapping("/max")
	public ResponseEntity<Double> max(){
		throw new UnsupportedOperationException();
	}
	
	@GetMapping("/avg")
	public ResponseEntity<Double> avg(){
		throw new UnsupportedOperationException();
	}
	
	@GetMapping("/median")
	public ResponseEntity<Double> median(){
		throw new UnsupportedOperationException();
	}
	
}
