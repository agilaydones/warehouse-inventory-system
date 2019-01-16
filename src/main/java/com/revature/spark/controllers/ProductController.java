package com.revature.spark.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.spark.beans.Product;
import com.revature.spark.services.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;
	
	@GetMapping("/product/all")
	public ResponseEntity<List<Product>> findAll(){
		return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
	}

	@PostMapping("/product")
	public ResponseEntity<Product> create(@Valid @RequestBody Product product){
		return new ResponseEntity<>(service.create(product), HttpStatus.CREATED);
	}

	@PutMapping("/product")
	public ResponseEntity<Product> update(@Valid @RequestBody Product product){
		return new ResponseEntity<>(service.update(product), HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("/product")
	public ResponseEntity<Void> delete(@Valid @RequestBody Product product){
		service.delete(product);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/product/sum")
	public ResponseEntity<Double> sum(){
		return new ResponseEntity<>(service.sum(), HttpStatus.OK);
	}
	
	@GetMapping("/product/min")
	public ResponseEntity<Double> min(){
		return new ResponseEntity<>(service.min(), HttpStatus.OK);
	}
	
	@GetMapping("/product/max")
	public ResponseEntity<Double> max(){
		return new ResponseEntity<>(service.max(), HttpStatus.OK);
	}
	
	@GetMapping("/product/avg")
	public ResponseEntity<Double> avg(){
		return new ResponseEntity<>(service.avg(), HttpStatus.OK);
	}
	
	@GetMapping("/product/median")
	public ResponseEntity<Double> median(){
		return new ResponseEntity<>(service.median(), HttpStatus.OK);
	}
	
}
