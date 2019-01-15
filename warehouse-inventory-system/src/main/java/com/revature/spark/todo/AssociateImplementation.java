package com.revature.spark.todo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.revature.spark.beans.Product;
import com.revature.spark.beans.Warehouse;

/**
 * 
 * @author Your Name Here
 *
 */
public class AssociateImplementation {

	/**
	 * 
	 * @param products
	 * @return
	 */
	public Double sum(List<Product> products){
		return 0.0;
	}
	
	/**
	 * 
	 * @param products
	 * @return
	 */
	public Double min(List<Product> products){
		return 0.0;
	}
	
	/**
	 * 
	 * @param products
	 * @return
	 */
	public Double max(List<Product> products){
		return 0.0;
	}
	
	/**
	 * 
	 * @param products
	 * @return
	 */
	public Double avg(List<Product> products){
		return 0.0;
	}
	
	/**
	 * 
	 * @param products
	 * @return
	 */
	public Double median(List<Product> products){
		return 0.0;
	}
	
	/**
	 * !! BONUS CHALLENGE REQUIREMENT !!
	 * @param products
	 * @return
	 */
	public Map<Warehouse, Double> totalAssetsPerWarehouse(List<Product> products){
		return new HashMap<>();
	}

}
