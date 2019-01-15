package com.revature.spark.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.spark.beans.Product;

@RestController
public class ProductController {

	@GetMapping("/product/all")
	public ResponseEntity<List<Product>> findAll(){
		throw new UnsupportedOperationException();
	}

	@PostMapping("/product")
	public ResponseEntity<Product> create(Product product){
		throw new UnsupportedOperationException();
	}

	@PutMapping("/product")
	public ResponseEntity<Product> update(Product product){
		throw new UnsupportedOperationException();
	}
	
	@DeleteMapping("/product")
	public ResponseEntity<Void> delete(Product product){
		throw new UnsupportedOperationException();
	}
	
	@GetMapping("/product/sum")
	public ResponseEntity<Double> sum(){
		throw new UnsupportedOperationException();
	}
	
	@GetMapping("/product/min")
	public ResponseEntity<Double> min(){
		throw new UnsupportedOperationException();
	}
	
	@GetMapping("/product/max")
	public ResponseEntity<Double> max(){
		throw new UnsupportedOperationException();
	}
	
	@GetMapping("/product/avg")
	public ResponseEntity<Double> avg(){
		throw new UnsupportedOperationException();
	}
	
	@GetMapping("/product/median")
	public ResponseEntity<Double> median(){
		throw new UnsupportedOperationException();
	}
	
}
