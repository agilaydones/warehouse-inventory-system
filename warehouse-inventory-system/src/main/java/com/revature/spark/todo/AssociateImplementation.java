package com.revature.spark.todo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.revature.spark.beans.Product;
import com.revature.spark.beans.Warehouse;

/**
 * Within this class, you will implement the logic to calculate data for various
 * reports.
 * 
 * @author Your Name Here
 * 
 */
public class AssociateImplementation {

	/**
	 * Find the sum of all product assets. Remember that quantity times price is the
	 * total value for a given product.
	 * 
	 * @param products
	 * @return
	 */
	public Double sum(List<Product> products) {
		return 0.0;
	}

	/**
	 * Find the lowest product price out of all products.
	 * 
	 * @param products
	 * @return
	 */
	public Double min(List<Product> products) {
		return 0.0;
	}

	/**
	 * Find the highest product price out of all products.
	 * 
	 * @param products
	 * @return
	 */
	public Double max(List<Product> products) {
		return 0.0;
	}

	/**
	 * Find the average product price of all products.
	 * 
	 * @param products
	 * @return
	 */
	public Double avg(List<Product> products) {
		return 0.0;
	}

	/**
	 * Find the median product price of all products.
	 * 
	 * @param products
	 * @return
	 */
	public Double median(List<Product> products) {
		return 0.0;
	}

	/**
	 * !! BONUS CHALLENGE REQUIREMENT !!
	 * 
	 * Find the total value of all products in each warehouse (total assets).
	 * 
	 * Let's look at some example data:
	 * 
	 * Warehouse A Product | Price | Quantity Rice | $3.40 | 8 Beans | $1.50 | 3
	 * ------------------------------------ Warehouse B Product | Price | Quantity
	 * TV | $50.25 | 4 Speaker | $15.10 | 6 -----------------------------------
	 * Result: Warehouse A : $31.70 Warehouse B : $291.60
	 * 
	 * 
	 * @param products
	 * @return
	 */
	public Map<Warehouse, Double> totalAssetsPerWarehouse(List<Product> products) {
		return new HashMap<>();
	}

}
