package com.revature.spark.todo;

import java.util.Collections;
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
		double sum = 0.0;
		for(Product prod : products) {
			sum += prod.getPrice() * prod.getQuantity();
		}
		return sum;
	}

	/**
	 * Find the lowest product price out of all products.
	 * 
	 * @param products
	 * @return
	 */
	public Double min(List<Product> products) {
		double min = Double.MAX_VALUE;
		for(Product prod : products) {
			if(prod.getPrice() < min) {
				min = prod.getPrice();
			}
		}
		return min;
	}

	/**
	 * Find the highest product price out of all products.
	 * 
	 * @param products
	 * @return
	 */
	public Double max(List<Product> products) {
		double max = Double.MIN_VALUE;
		for(Product prod : products) {
			if(prod.getPrice() > max) {
				max = prod.getPrice();
			}
		}
		return max;
	}

	/**
	 * Find the average product price of all products.
	 * 
	 * @param products
	 * @return
	 */
	public Double avg(List<Product> products) {
		double sum = 0.0;
		for(Product prod : products) {
			sum += prod.getPrice();
		}
		return sum/products.size();
	}

	/**
	 * Find the median product price of all products.
	 * 
	 * @param products
	 * @return
	 */
	public Double median(List<Product> products) {
		Collections.sort(products);
		if (products.size()% 2 == 0)
			return (products.get(products.size()/2).getPrice() + products.get(products.size()/2 - 1).getPrice())/2;
		else
			return products.get(products.size()/2).getPrice();
	}

	/**
	 * !! BONUS CHALLENGE REQUIREMENT !!
	 * 
	 * Find the total value of all products in each warehouse (total assets).
	 * 
	 * Let's look at some example data:
	 * 
	 * Warehouse A 
	 * Product 	| Price | Quantity 
	 * Rice 	| $3.40 | 8 
	 * Beans 	| $1.50 | 3
	 * ------------------------------------ 
	 * Warehouse B 
	 * Product 	| Price 	| Quantity
	 * TV 		| $50.25 	| 4 
	 * Speaker 	| $15.10 	| 6 
	 * -----------------------------------
	 * Result: 
	 * Warehouse A : $31.70 
	 * Warehouse B : $291.60
	 * 
	 * 
	 * @param products
	 * @return
	 */
	public Map<Warehouse, Double> totalAssetsPerWarehouse(List<Product> products) {
		Map<Warehouse, Double> map = new HashMap<>();
		for(Product p : products) {
			if(map.containsKey(p.getWarehouse())) {
				map.put(p.getWarehouse(), map.get(p.getWarehouse()) + (p.getPrice() * p.getQuantity() ));
			}else {
				map.put(p.getWarehouse(), (p.getPrice() * p.getQuantity()));
			}
		}
		return map;
	}

}
