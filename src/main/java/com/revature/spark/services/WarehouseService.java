package com.revature.spark.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.spark.beans.Warehouse;
import com.revature.spark.repository.ProductRepository;
import com.revature.spark.repository.WarehouseRepository;
import com.revature.spark.todo.AssociateImplementation;

@Service
public class WarehouseService {
	
	/**
	 * In Spring, we would likely @Autowired this property.
	 * Just to keep the associate code free of Spring annotations,
	 * we opted to simply instantiate the old-fashioned way.
	 */
	private AssociateImplementation associateImplementation = new AssociateImplementation();
	
	@Autowired
	private WarehouseRepository warehouseRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Warehouse> findAll(){
		return warehouseRepository.findAll();
	}
	
	public Map<Warehouse, Double> totalAssetsPerWarehouse(){
		return associateImplementation.totalAssetsPerWarehouse(productRepository.findAll());
	}
	
}
