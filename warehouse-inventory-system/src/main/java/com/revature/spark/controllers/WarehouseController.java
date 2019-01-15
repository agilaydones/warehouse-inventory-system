package com.revature.spark.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.spark.beans.Warehouse;

@RestController
public class WarehouseController {

	@GetMapping("/warehouse/all")
	public ResponseEntity<List<Warehouse>> findAll(){
		throw new UnsupportedOperationException();
	}
	
	@GetMapping("/warehouse/all/assets")
	public ResponseEntity<Map<Warehouse, Double>> totalAssetsPerWarehouse(){
		throw new UnsupportedOperationException();
	}

}
