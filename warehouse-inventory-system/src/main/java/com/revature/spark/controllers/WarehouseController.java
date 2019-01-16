package com.revature.spark.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.spark.beans.Warehouse;
import com.revature.spark.services.WarehouseService;

@RestController
public class WarehouseController {
	
	@Autowired
	private WarehouseService warehouseService;

	@GetMapping("/warehouse/all")
	public ResponseEntity<List<Warehouse>> findAll(){
		return new ResponseEntity<>(warehouseService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/warehouse/all/assets")
	public ResponseEntity<Map<Warehouse, Double>> totalAssetsPerWarehouse(){
		return new ResponseEntity<>(warehouseService.totalAssetsPerWarehouse(), HttpStatus.OK);
	}

}
